package com.netneg.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netneg.admin.dao.BPEntityMapper;
import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;
import com.netneg.admin.dto.CustcnntInDto;
import com.netneg.admin.dto.CustcnntOutDto;
import com.netneg.admin.dto.MasterListOutDto;
import com.netneg.admin.service.BPListService;
import com.netneg.admin.vo.ResultJson;
import com.netneg.admin.vo.SearchBean;

@RestController
@RequestMapping("/BPList")
@CrossOrigin(origins = "*")
public class BPController {
	@Autowired
	BPListService bpListService;
	@Autowired
	BPEntityMapper bpDto;
	
	@GetMapping("getBPList")
	public ResultJson getBPList(String userId) {
		try {
			List<BPListOutDto> list=bpListService.getBPListInit(userId);
			ResultJson ret=ResultJson.success(list,list.size());
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("getcntList")
	public ResultJson getcntList() {
		try {
			List<CustcnntOutDto> list=bpListService.getcntList();
			ResultJson ret=ResultJson.success(list,list.size());
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("getSalesList")
	public ResultJson getSalesList() {
		try {
			List<MasterListOutDto> mapList= bpDto.getSalesMaster();
			ResultJson ret=ResultJson.success(mapList,mapList.size());
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("getPrjList")
	public ResultJson getPrjList() {
		try {
			List<MasterListOutDto> mapList= bpDto.getPrjMaster();
			ResultJson ret=ResultJson.success(mapList,mapList.size());
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("getCustpsnList")
	public ResultJson getCustpsnList() {
		try {
			List<MasterListOutDto> mapList= bpDto.getCustpsnMaster();
			ResultJson ret=ResultJson.success(mapList,mapList.size());
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("getPersonList")
	public ResultJson getPersonList() {
		try {
			List<MasterListOutDto> mapList= bpDto.getPersonMaster();
			ResultJson ret=ResultJson.success(mapList,mapList.size());
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("getSearch")
	public ResultJson getSearch(String company,String sales) {
		
		try {
			List<BPListOutDto> list=bpListService.searchBP(company,sales);
			ResultJson ret;
			if(list != null) {
				ret=ResultJson.success(list,list.size());
			}else {
				ret=ResultJson.success(null,null);
			}
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	
	@GetMapping("getContactSearch")
	public ResultJson getContactSearch(SearchBean data) {
		
		try {
			List<CustcnntOutDto> list=bpListService.contactSearch(data);
			ResultJson ret;
			if(list != null) {
				ret=ResultJson.success(list,list.size());
			}else {
				ret=ResultJson.success(null,null);
			}
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@GetMapping("deleteById")
	public ResultJson deleteById(String company) {
		
		try {
			bpDto.deleteById(company);
			ResultJson ret=ResultJson.success(null,null);
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	
	@GetMapping("deleteContactById")
	public ResultJson deleteContactById(String id) {
		
		try {
			bpDto.deleteContactById(id);
			ResultJson ret=ResultJson.success(null,null);
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@PostMapping("dataUpdate")
	public ResultJson dataUpdate(@RequestBody BPListInDto data) {
		
		try {
			bpDto.AllItemUpdate(data);
			ResultJson ret=ResultJson.success(null,null);
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@PostMapping("contactUpdate")
	public ResultJson contactUpdate(@RequestBody CustcnntInDto data) {
		
		try {
			bpListService.CntAllItemUpdate(data);
			ResultJson ret=ResultJson.success(null,null);
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	@PostMapping("createData")
	public ResultJson createData(@RequestBody BPListInDto data) {
		
		try {
			bpListService.createData(data);
			ResultJson ret=ResultJson.success(null,null);
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
	
	@PostMapping("createContact")
	public ResultJson createContact(@RequestBody CustcnntInDto data) {
		
		try {
			bpListService.createContact(data);
			ResultJson ret=ResultJson.success(null,null);
			return ret;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ResultJson ret=ResultJson.fail(e);
			return ret;
		}
	}
	
}
