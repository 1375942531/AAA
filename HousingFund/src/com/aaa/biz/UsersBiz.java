package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Role;
import com.aaa.entity.Users;

public interface UsersBiz {
	public List<Users> users_login(String hql);
	
	//��ѯȫ��
	public List<Users> get_UsersAll();
	//���ӹ���
	public int addUsers(Users users);
	//ɾ������
	public int del_Users(Users users);
	
	
	//��ѯһ��
	public List get_This_Users(Users users);
	//�޸�
	public int update_Users(Users users, Role role);
}
