package com.aaa.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.chain.web.MapEntry;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * ��ɫ������
 * **/
public class RoleUtil {
	@Autowired
	static HibernateTemplate hibernateTemplate;
	private static Map Roles;//<��ɫ��,��ɫʵ��>
	static{//��ʼ�����н�ɫ
		DetachedCriteria criteria=DetachedCriteria.forClass("".getClass());//�˴�����Role.class
    	List list=hibernateTemplate.findByCriteria(criteria);
    	Roles=new HashMap();
    	for (Object object : list) {
			//Roles.put(��ɫ��, ��ɫʵ��)
		}
	}
//��ȡ���н�ɫ
    public static Map getRoles(){
  	  return Roles;
    }
//��ȡ��ɫʵ��
    public static Object UserLogin(String key){
	  return Roles.get(key);
	}
//��ӽ�ɫ
    public static void saveUser(Object entity){
  		hibernateTemplate.save(entity); 
  		//Roles.add(��ɫ��,entity);
    }
//ɾ����ɫ
    public static void deleteUser(Object entity){
  	      //Roles.remove(��ɫ��);
		hibernateTemplate.delete(entity); 
   }
/*//�޸Ľ�ɫ    
    public static void UpdateUser(Object entity){
  	  hibernateTemplate.update(entity); 
  	 //Roles.put(��ɫ��, entity);�Զ��滻
   }*/
}
