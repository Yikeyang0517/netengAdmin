package com.netneg.admin.dao;

import java.util.List;

import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;
import com.netneg.admin.dto.CustcnntOutDto;
import com.netneg.admin.dto.MasterListOutDto;
import com.netneg.admin.vo.SearchBean;

public interface BPEntityMapper {
	List<BPListOutDto> getInitList(String userId);

	List<MasterListOutDto> getSalesMaster();

	List<BPListOutDto> getSearchList(String company, String sales);

	void ItemUpdate(BPListInDto data);

	void deleteById(String id);

	void createData(BPListInDto data);

	Integer bpIdExists(String autoId);

	Integer cntIdExists(String autoId);

	List<CustcnntOutDto> getcntList();

	List<MasterListOutDto> getPrjMaster();

	List<MasterListOutDto> getCustpsnMaster();

	List<MasterListOutDto> getPersonMaster();

	List<CustcnntOutDto> contactSearch(SearchBean data);

	void deleteContactById(String id);
}