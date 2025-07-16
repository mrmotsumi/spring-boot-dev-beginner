package com.thobelapawnshop.development.LoanManagementSystem.modules.loan.service.impl;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.dto.CustomerBaseDTO;
import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.dto.NextOfKinDTO;
import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.dto.WorkDetailsDTO;
import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public Long createBaseCustomer(CustomerBaseDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNextOfKins(Long customerId, List<NextOfKinDTO> kins) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addWorkDetails(Long customerId, WorkDetailsDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadIdDocument(Long customerId, MultipartFile file) {
		// TODO Auto-generated method stub
		
	}

}
