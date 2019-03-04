package com.yw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yw.mapper.QQMapper;
import com.yw.service.QQService;
@Service
@Transactional(readOnly=false)
public class QQServiceImpl implements QQService {
	@Autowired
	private QQMapper qqmapper;
	@Override
	public boolean addQQ(String pwd, String phone, String email, Integer age) {
		// TODO Auto-generated method stub
		return qqmapper.addQQ(pwd, phone, email, age)>=1?true:false;
	}

}
