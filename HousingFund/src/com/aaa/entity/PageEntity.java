package com.aaa.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PageEntity {
	 private Integer Count;//������
	 private Integer CurrentPage=1;//��ǰҳĬ�ϵ�һҳ
     private Integer MaxResult=2;  //ÿҳ��ʾ����
	 private Integer TotalPage; //��ҳ��
	 private List list; //��ҳ����
	 
	public Integer getCount() {
		return Count;
	}
	public void setCount(Integer count) {
		Count = count;
	}
	public Integer getCurrentPage() {
		return CurrentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		CurrentPage = currentPage;
	}
	public Integer getMaxResult() {
		return MaxResult;
	}
	public void setMaxResult(Integer maxResult) {
		MaxResult = maxResult;
	}
	public Integer getTotalPage() {
		return TotalPage;
	}
	public void setTotalPage(Integer totalPage) {
		TotalPage = totalPage;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
