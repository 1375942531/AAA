package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Powers;
import com.aaa.entity.Role;
import com.aaa.entity.Users;

public interface PowersBiz {
	//��ȡ�û�Ȩ��
	public List<Powers> get_Powers(Users users);
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
