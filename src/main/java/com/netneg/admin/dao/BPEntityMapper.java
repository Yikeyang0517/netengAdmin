package com.netneg.admin.dao;

import java.util.List;

import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;
import com.netneg.admin.dto.MasterListOutDto;

public interface BPEntityMapper {
	List<BPListOutDto> getInitList(String userId);

	List<MasterListOutDto> getSalesMaster();

	List<BPListOutDto> getSearchList(String company, String sales);

	void ItemUpdate(BPListInDto data);

	void deleteById(String id);

	void createData(BPListInDto data);
}