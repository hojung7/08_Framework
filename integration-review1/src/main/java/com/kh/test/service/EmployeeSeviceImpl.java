package com.kh.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.kh.test.dto.Employee;
import com.kh.test.mapper.EmployeeMapper;
@Transactional
@Service
public class EmployeeSeviceImpl implements EmployeeService{

	@Autowired
  private EmployeeMapper mapper;
	
	@Override
	public List<Employee>  selectAll() {
	
		return mapper.selectAll() ;
	}

}
