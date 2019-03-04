package com.yw.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface StudentMapper {
	@Select("select * from students")
	List<Map<String, Object>> findAllStudents();
}
