package com.netneg.admin.dao;

import java.util.List;

import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;
import com.netneg.admin.dto.CustcnntInDto;
import com.netneg.admin.dto.CustcnntOutDto;
import com.netneg.admin.dto.CustomInDto;
import com.netneg.admin.dto.CustomOutDto;
import com.netneg.admin.dto.MasterListOutDto;
import com.netneg.admin.vo.SearchBean;

public interface BPEntityMapper {
	List<BPListOutDto> getInitList(String userId);

	List<MasterListOutDto> getSalesMaster();

	List<BPListOutDto> getSearchList(String company, String sales);

	void AllItemUpdate(BPListInDto data);

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

	void CntAllItemUpdate(CustcnntInDto data);

	String getCustpsnIdById(String custcnttId);

	void updateCPById(String custpsnId);

	void updateBPById(String custpsnId);

	void createContact(CustcnntInDto data);

	List<CustomOutDto> getCustomList();

	void deleteCustomById(String id);

	List<MasterListOutDto> getMaster(String keyName);

	void customUpdate(CustomInDto data);

	List<CustomOutDto> customSearch(SearchBean data);

	List<MasterListOutDto> getCompanyMaster();

	Integer cutmIdExists(String autoId);

	void createCustom(CustomInDto data);
}