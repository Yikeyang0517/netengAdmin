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
import com.netneg.admin.dto.MasterListOutDto;
import com.netneg.admin.service.BPListService;
import com.netneg.admin.vo.ResultJson;

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
	@GetMapping("getSearch")
	public ResultJson getSearch(String company,String sales) {
		
		try {
			List<BPListOutDto> list=bpListService.SearchBP(company,sales);
			ResultJson ret=ResultJson.success(list,list.size());
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
	
	@PostMapping("dataUpdate")
	public ResultJson dataUpdate(@RequestBody BPListInDto data) {
		
		try {
			bpDto.ItemUpdate(data);
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
	
	
}
