package com.netneg.admin.service;

import java.util.List;

import com.netneg.admin.dto.BPListInDto;
import com.netneg.admin.dto.BPListOutDto;

public interface BPListService {
	List<BPListOutDto> getBPListInit(String userId)throws Exception;

	List<BPListOutDto> SearchBP(String company, String sales);

	void createData(BPListInDto data);
	
}
