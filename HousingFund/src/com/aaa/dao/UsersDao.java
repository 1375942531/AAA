package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Users;
import com.aaa.entity.Role;

public interface UsersDao {

	public List<Users> users_login(String hql);
	/*
	 * 	1���Զ�ע�룺@Resources��@Autowired
		
		2��Bean���壺@Component��@Repository��@Service �� @Constroller 
		
		@Component�Ǹ�����������������κβ�Ρ������web������������@Repository��@Service �� @Constroller
	 * */
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