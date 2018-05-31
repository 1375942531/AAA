package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Powers;
import com.aaa.entity.Role;
import com.aaa.entity.Users;

public interface PowersDao {
	//��ȡ�û�Ȩ��
	public List<Powers> get_Powers(Users users);
	//��ȡ��ǰ��ɫӵ�е�Ȩ�� 
	public List<Powers> get_role_Powers(Role role);
	//��ȡ��ǰ��ɫû�е�Ȩ�� 
	public List<Powers> get_role_NoPowers(Role role);
	
	//���ӹ���
	public int addFunction(Powers powers);
	//ɾ������
	public int del_Prowers(Powers powers);
	
	//��ѯ���й���
	public List<Powers> getAllPowers(String getRole, Role role);
	
	//��ѯһ��
	public Powers get_This_Powers(Powers powers);
	//�޸�
	public int update_powers(Powers powers);
}
