package com.netneg.admin.service;

import java.util.List;

import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;
import com.netneg.admin.dto.CustcnntInDto;
import com.netneg.admin.dto.CustcnntOutDto;
import com.netneg.admin.dto.CustomInDto;
import com.netneg.admin.dto.CustomOutDto;
import com.netneg.admin.vo.SearchBean;

public interface BPListService {
	List<BPListOutDto> getBPListInit(String userId)throws Exception;

	List<BPListOutDto> searchBP(String company, String sales);

	void createData(BPListInDto data);

	List<CustcnntOutDto> getcntList();

	List<CustcnntOutDto> contactSearch(SearchBean data);

	void cntAllItemUpdate(CustcnntInDto data);

	void createContact(CustcnntInDto data);

	List<CustomOutDto> getCustomList();

	void customUpdate(CustomInDto data);

	List<CustomOutDto> customSearch(SearchBean data);

	void createCustom(CustomInDto data);
	
}
