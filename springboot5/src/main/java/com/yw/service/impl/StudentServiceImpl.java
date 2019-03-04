package com.yw.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yw.mapper.StudentMapper;
import com.yw.service.StudentService;
@Service
@Transactional(readOnly=false)
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentmapper;
	@Override
	public List<Map<String, Object>> findAllStudents() {
		return studentmapper.findAllStudents();
	}

}
