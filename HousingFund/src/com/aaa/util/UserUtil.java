package com.aaa.util;

import java.io.Serializable;
import java.util.List;

import javax.xml.registry.infomodel.User;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
   /**
    * �û�������
    * ��Object���ɶ�Ӧ��UserEntity
    * **/
public abstract class UserUtil {
	 @Autowired
	private  static HibernateTemplate hibernateTemplate;
    private  static List users;//�����û�����
    
    static{//��̬������,��ʼ���û�����
    	DetachedCriteria criteria=DetachedCriteria.forClass("".getClass());//�˴�����User.class
    	users=hibernateTemplate.findByCriteria(criteria);
    }
//��ȡ�����û�
      public static List getUsers(){
    	  return users;
      }
//�û���½
      public static Object UserLogin(Object entity){
    	  for(Object obj : users){
    		  //if(�û���==�û���&&����==����)
    		  //return obj;
    	  }
		      return null;
		}
//����û�
      public static void saveUser(Object entity){
    		hibernateTemplate.save(entity); 
    		users.add(entity);
      }
//ɾ���û�
      public static void deleteUser(Object entity){
    	  for(Object obj : users){//�ȴӼ�����ɾ��,�ٴ����ݿ���ɾ��
    		  //if(����==����)
    	 	  // users.remove(obj);
    	  }
  		hibernateTemplate.delete(entity); 
     }
//�޸��û�      
      public static void UpdateUser(Object entity){
    	  hibernateTemplate.update(entity); 
    	  for(Object obj : users){//���޸����ݿ�,Ȼ���滻�����е�Ԫ��
    		  //if(����==����)
    	 	  // users.remove(obj);
    		 // users.add(entity);
    	  }
     }
}
