package com.yw.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.ognl.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yw.entity.QQ;
import com.yw.service.QQService;
import com.yw.service.StudentService;
@Controller
public class FrontController {
	@RequestMapping("/printData.do")
	public @ResponseBody String printData() {
		return "hello springboot";
	}
	@Autowired
	private QQService qqservice;
	@RequestMapping("/getQQInfo.do")
	public @ResponseBody boolean getQQInfo(String pwd,String phone,String email,Integer age) {
		return qqservice.addQQ(pwd,phone,email,age);
	}
		
	@Autowired
	private StudentService studentService;
	@RequestMapping("/selectAllStudents.do")
	public @ResponseBody List<Map<String, Object>> selectAllStudents(){
		return studentService.findAllStudents();
		
	}
}
