package com.thobelapawnshop.development.LoanManagementSystem.modules.loan.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.dto.CustomerBaseDTO;
import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.dto.NextOfKinDTO;
import com.thobelapawnshop.development.LoanManagementSystem.modules.loan.dto.WorkDetailsDTO;

public interface CustomerService {
    Long createBaseCustomer(CustomerBaseDTO dto);
    void addNextOfKins(Long customerId, List<NextOfKinDTO> kins);
    void addWorkDetails(Long customerId, WorkDetailsDTO dto);
    void uploadIdDocument(Long customerId, MultipartFile file);
}