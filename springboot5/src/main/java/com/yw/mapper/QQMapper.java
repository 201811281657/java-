package com.yw.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QQMapper {
	@Insert("insert into qq values(null,#{arg0},#{arg1},#{arg2},#{arg3})")
	int addQQ(String pwd,String phone,String email,Integer age);
}
