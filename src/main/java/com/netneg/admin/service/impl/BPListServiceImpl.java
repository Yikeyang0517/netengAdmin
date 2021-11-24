package com.netneg.admin.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netneg.admin.dao.BPEntityMapper;
import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;
import com.netneg.admin.dto.CustcnntInDto;
import com.netneg.admin.dto.CustcnntOutDto;
import com.netneg.admin.dto.CustomInDto;
import com.netneg.admin.dto.CustomOutDto;
import com.netneg.admin.service.BPListService;
import com.netneg.admin.vo.SearchBean;

@Service
public class BPListServiceImpl implements BPListService{

	
	@Autowired
	BPEntityMapper bpDto;
	@Override
	public List<BPListOutDto> getBPListInit(String userId) throws Exception {
		//获取所有BP
		List<BPListOutDto> list = bpDto.getInitList(userId);
		//为list附上ID
		setBPId(list);
		return list;
	}
	@Override
	public List<BPListOutDto> searchBP(String company, String sales) {
		//获取所有检索后的BPList
				List<BPListOutDto> list = bpDto.getSearchList(company,sales);
				//为list附上ID
				setBPId(list);
		return list;
	}
	public List<BPListOutDto> setBPId(List<BPListOutDto> list){
				//遍历数组并赋值
				for (int i=0;i<list.size();i++) {
					//给每条数据的ID赋值
					list.get(i).setId(String.valueOf(i+1));
					//计算上次联系距今时间，返回contactflg值
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					if(list.get(i).getMaxcnttdays() != null ) {
						if(list.get(i).getContactdate() != null) {
							Date oldDate = list.get(i).getContactdate();
							long diffday = (date.getTime() - oldDate.getTime()) / 60 / 60 / 24 / 1000;
							if( diffday > list.get(i).getMaxcnttdays()) {
								list.get(i).setContactflg("1");
							}
						}else {
							list.get(i).setContactflg("1");
						}
					}
				}
				return list;
	}

	public List<CustomOutDto> setCustomId(List<CustomOutDto> list){
				//遍历数组并赋值
				for (int i=0;i<list.size();i++) {
					//给每条数据的ID赋值
					list.get(i).setId(String.valueOf(i+1));
					//计算上次联系距今时间，返回contactflg值
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					
					if(list.get(i).getMaxcnttdays() != null ) {
						if(list.get(i).getContactdate() != null) {
							Date oldDate = list.get(i).getContactdate();
							long diffday = (date.getTime() - oldDate.getTime()) / 60 / 60 / 24 / 1000;
							if( diffday > list.get(i).getMaxcnttdays()) {
								list.get(i).setContactflg("1");
							}
						}else {
							list.get(i).setContactflg("1");
						}
					}
				}
				return list;
	}
	
	@Override
	public void createData(BPListInDto data) {
		//生成唯一pbid
		data.setBpid(getCode(1));
		//插入一条BP数据
		bpDto.createData(data);
		
	}
	
	/*
	 * //新增一条沟通记录 CustcnntInDto ctnt= new CustcnntInDto(); //生成唯一pbid
	 * ctnt.setCustcnttId(getCode(2)); ctnt.setCustpsnId(data.getBpid());
	 * bpDto.InsertContactRecord();
	 */
	
	public String getCode(int codeFlg) {
	        char arr[] = new char[11];
	        int i = 0;
	        while (i < 11) {
	           char ch = (char) (int) (Math.random() * 124);
	          if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
	               arr[i++] = ch;
	           }
	       }
	       //将数组转为字符串
	        String autoId = new String(arr);
	        //检证当前生成id是否存在
	        Integer cnt=100;
	        if(codeFlg==1) {
	        	 cnt = bpDto.bpIdExists(autoId);
	        }else if(codeFlg==2){
	        	 cnt = bpDto.cntIdExists(autoId);
	        }else if(codeFlg==3){
	        	 cnt = bpDto.cutmIdExists(autoId);
	        }
	       
	       if(cnt==0) {
	    	   return autoId;
	       }else {
	    	   return  getCode(codeFlg);
	       }
	       
	   }
	@Override
	public List<CustcnntOutDto> getcntList() {
		List<CustcnntOutDto> list = bpDto.getcntList();
		//为list附上ID
		for (int i=0;i<list.size();i++) {
			list.get(i).setId(String.valueOf(i+1));
		}
		return list;
	}
	@Override
	public List<CustcnntOutDto> contactSearch(SearchBean data) {
		
		List<CustcnntOutDto> list = bpDto.contactSearch(data);
		//为list附上ID
		for (int i=0;i<list.size();i++) {
			list.get(i).setId(String.valueOf(i+1));
		}
		return list;
	}
	@Override
	public void cntAllItemUpdate(CustcnntInDto data) {
		//获取更新前custpsnId
		String oldCustpsnId = bpDto.getCustpsnIdById(data.getCustcnttId());
		//更新沟通记录表
		bpDto.CntAllItemUpdate(data);
		//获取更新后的custpsnId
		String newCustpsnId = data.getCustpsnId();
		//通过custpsnId更新custpsn表
		bpDto.updateCPById(oldCustpsnId);
		bpDto.updateCPById(newCustpsnId);
		//通过custpsnId更新bp表
		bpDto.updateBPById(oldCustpsnId);
		bpDto.updateBPById(newCustpsnId);
	}
	@Override
	public void createContact(CustcnntInDto data) {
		//生成唯一pbid
		data.setCustcnttId(getCode(2));
		//插入一条BP数据
		bpDto.createContact(data);
		//获取当前沟通客户的Id
		String custpsnId = data.getCustpsnId();
		//通过custpsnId更新custpsn表
		bpDto.updateCPById(custpsnId);
		//通过custpsnId更新bp表
		bpDto.updateBPById(custpsnId);
		
	}
	@Override
	public List<CustomOutDto> getCustomList() {
		//获取所有customList
				List<CustomOutDto> list = bpDto.getCustomList();
				setCustomId(list);
				return list;
	}
	@Override
	public void customUpdate(CustomInDto data) {
				
				//更新客户人员
				bpDto.customUpdate(data);
				
	}
	@Override
	public List<CustomOutDto> customSearch(SearchBean data) {
		List<CustomOutDto> list = bpDto.customSearch(data);
		//为list附上ID
		setCustomId(list);
		return list;
	}
	@Override
	public void createCustom(CustomInDto data) {
				//生成唯一custpsnId
				data.setCustpsnId(getCode(3));
				//插入一条Custom数据
				bpDto.createCustom(data);
				//通过custpsnId更新bp表
				bpDto.updateBPById(data.getCustpsnId());
				//插入一条contact数据
				CustcnntInDto contactData = new CustcnntInDto();
				contactData.setCustcnttId(getCode(2));
				contactData.setCustpsnId(data.getCustpsnId());
				contactData.setCnttType("00");
				contactData.setSales(data.getSales());
				contactData.setPsncnttmemo("客户人员登记");
				contactData.setContactdate(data.getContactdate());
				contactData.setWorkhours("15");
				contactData.setCreatetime(data.getCreatetime());
				contactData.setCreateuser(data.getCreateuser());
				bpDto.createContact(contactData);
	}
	
}


