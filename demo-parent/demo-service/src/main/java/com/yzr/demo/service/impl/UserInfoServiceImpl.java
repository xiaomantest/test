package com.yzr.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzr.demo.mapper.UserInfoMapper;
import com.yzr.demo.po.UserInfo;
import com.yzr.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserById() {
		return userInfoMapper.getUserById();
	}
}
