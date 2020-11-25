package com.yzr.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzr.demo.service.UserInfoService;

import cn.hutool.json.JSONUtil;

@RestController
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService UserInfoService;
	
	
	@RequestMapping("/getUserInfoById")
	public String getUserInfoById() {
		return JSONUtil.toJsonStr(UserInfoService.getUserById());
	}
}
