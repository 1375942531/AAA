package com.aaa.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aaa.entity.Loanapplication;
import com.aaa.entity.Repaymentplandetails;
public class JSON {
	
	/**
	 * �������£�
	 *   RemoveRelation(Object obj):ɾ�����������ϵ
	 *   toJson(Object obj):������ת��ΪJSON�ַ���(��Я��������ϵ)
	 *   toJsonRelation(Object obj):������ת��ΪJSON�ַ���(Я��δʵ���κνӿڵĹ�������)
	 *   toCollectionJson(Collection coll):������ת��ΪJSON�ַ���(Я��Ϊʵ���κνӿڵĹ�������)
	 * ***/
	//Ŀǰ֧�ֵ��ֶ�����
	private static Class[] clas={Integer.class,Float.class,String.class,Double.class,Date.class};
//ȡ�����й�������
	public static Object RemoveRelation(Object obj) {
		
		if(obj!=null){
		  Class cla=obj.getClass();
	      Field[] fields=cla.getDeclaredFields();
	      for (Field field : fields) {
	    	  field.setAccessible(true);
	    	 List types=Arrays.asList(clas);
	    	 if(!types.contains(field.getType())){
	    		try {
					field.set(obj, null);
				} catch (Exception e) {
					e.printStackTrace();
				} 
	    	 }
		 }
	      }
		return obj;
	}
//������ת��ΪJSON��ʽ����ת���������� 
	public static String toJson(Object obj) {
        Class cla=obj.getClass();
    	Field[] fields=cla.getDeclaredFields(); //�����ֶ�
    	StringBuffer str=new StringBuffer();
    	  str.append("{");
    	for (Field field : fields) {
    		field.setAccessible(true);//ȡ������Ȩ�޼��
    		List list=Arrays.asList(clas);
    		Class type=field.getType();//�ֶ�����
    		String name=field.getName();
    		if(list.contains(type)){
    			try {
					if(field.get(obj)!=null){//���Բ�Ϊ��ʱת��Ϊjson
						 if(type==Date.class){
								str.append("\""+name+"\"");
								str.append(":");
					    	 Date da=(Date) field.get(obj);
					    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
					    	str.append("\""+sdf.format(da)+"\"");
					    	str.append(",");
						}else{
							str.append("\""+name+"\"");
							str.append(":");
							str.append("\""+field.get(obj)+"\"");
							str.append(",");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				} 
    		}
		}
    	str.deleteCharAt(str.length()-1);//ɾ�����һ������
    	str.append("}");
		return str.toString();
    }
//������ת��ΪJSON��ʽ��ת��ֻʵ��һ�����л��ӿڵ����͵Ĺ������� 
	public static String toJsonRelation(Object obj) {
		try {
		  if(obj==null){
			  return null;
		  }
        Class cla=obj.getClass();
    	Field[] fields=cla.getDeclaredFields(); //�����ֶ�
    	StringBuffer str=new StringBuffer();
    	  str.append("{");
    	for (Field field : fields) {
    		field.setAccessible(true);//ȡ������Ȩ�޼��
    		List list=Arrays.asList(clas);
    		Class type=field.getType();//�ֶ�����
    		String name=field.getName();
    		if(list.contains(type)){
    			if(field.get(obj)!=null){//���Բ�Ϊ��ʱת��Ϊjson
    				 if(type==Date.class){//��������ΪDate����ʱ��ʽ��
    						str.append("\""+name+"\"");
    		    			str.append(":");
                    	 Date da=(Date) field.get(obj);
                    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    	str.append("\""+sdf.format(da)+"\"");
                    	str.append(",");
        			}else{
        				str.append("\""+name+"\"");
		    			str.append(":");
        				str.append("\""+field.get(obj)+"\"");
        				str.append(",");
        			}
    			}
    		}else {
    			 Class[] interfaces = type.getInterfaces();
    			if(interfaces.length==1&&interfaces[0].getName().equals("java.io.Serializable")){//ʵ����ʵ����һ���ӿ�
        			str.append("\""+name+"\"");
        			str.append(":");
        		    str.append(toJsonRelation(field.get(obj)));//�ݹ�ֽ�
        		    str.append(",");
        			str.append("}");
        			str.deleteCharAt(str.length()-1);//ɾ�����һ������
        		}
    		}
		}
    	 str.deleteCharAt(str.length()-1);//ɾ�����һ������
    	 str.append("}");
    	return str.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }
//������ת��ΪJson����
	public static String toCollectionJson(Collection coll){
		StringBuffer str=new StringBuffer();
		  str.append("[");
		    for (Object object : coll) {
		    	str.append(toJsonRelation(object));
		    	str.append(",");
			}
		    str.deleteCharAt(str.length()-1);//ɾ�����һ������
		  str.append("]");
		return str.toString();
	}
/**JSON����***/	
	static class cla{
		String cname="java2";
		stu s;
		
	}
	static class stu{
		String sname="����";
		stu2 s2;
		String aname="����3";
		
	}
	static class stu2{
		String sname="����2";
		
	}
	public static void main(String[] args) throws Exception {
		List list=new ArrayList();
		cla c=new cla();
		stu s=new stu();
		stu2 s2=new stu2();
		s.s2=s2;
		c.s=s;
		list.add(c);
		list.add(s);
		list.add(s2);
		System.out.println(toCollectionJson(list));
	}
	
} 
