package com.aaa.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 *  ʹ��˵����
 *   1.Action�̳д�BaaseAction����һ��ʵ���������Ҫ��ΪModelDriven��ʵ��ʹ�ã�
 *   2.Ĭ�ϼ̳�ActionSupport��
 *   3.Ĭ��ʵ��ModelDriven�ӿ�,ǰ̨����ֱ��ͨ��������������Ӧ�Ĵ�ֵ(ͨ��getModel��ȡʵ��)
 * */
public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	//����
	   //request��
	public Map getRequestMap(){
		return  (Map)ActionContext.getContext().get("request");
	}
	  //session��
	public Map getSessionMap(){
		return  ActionContext.getContext().getSession();
	}
	//���
	public HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	public HttpSession getSession(){
		return ServletActionContext.getRequest().getSession();
	}
	//��ȡPrintWriter��
	public PrintWriter getOut(){
		PrintWriter out = null;
		try {
			HttpServletResponse response=this.getResponse();
			response.setCharacterEncoding("utf-8");
			out= response.getWriter();
		} catch (IOException e) {
			System.out.println("��ȡOut�����쳣");
			e.printStackTrace();
		}
		return out;
	}
	//ModelDriven�ӿڵ�ʵ��
	  T entity;
	{
		ParameterizedType type=(ParameterizedType) this.getClass().getGenericSuperclass();
		Type types[]=type.getActualTypeArguments();//�������ʵ����
		Class cla=(Class) types[0];//���������
		try {
			entity=(T) cla.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ʵ�����ʵ�����쳣");
		} 
	}
	public T getModel() {
	    return (T) entity;
	}
}
