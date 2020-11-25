package com.yzr.demo.mapper;

import org.apache.ibatis.annotations.Select;

import com.yzr.demo.po.UserInfo;

public interface UserInfoMapper {
	
	@Select("select nama,nickname from user_info where id =1")
	public UserInfo getUserById();
}
