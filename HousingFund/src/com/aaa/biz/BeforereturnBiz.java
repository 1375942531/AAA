package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Beforereturn;
  //��ǰ����
public interface BeforereturnBiz {
   //�ύ��ǰ��������
	public void save(Beforereturn entity);
   //��ѯδ��˵���ǰ��������
	public List find();
   //��ȡ��ǰ��������
	public Beforereturn getBefore(Integer id);
    //ͨ�����루���ɹ���ǰ���
	public void success(Beforereturn entity);
	//���벵��
	public void error(Beforereturn entity);
}
