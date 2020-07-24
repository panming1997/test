package com.pm.sp01.service;

import com.pm.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	
	void addScore(Integer id, Integer score);

}
