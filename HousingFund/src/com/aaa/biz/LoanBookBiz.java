package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Loanapplication;
import com.aaa.entity.Loanbook;

public interface LoanBookBiz{
   //�����˻�OR��ͬ����˴����¼��ѯ
	public List<Loanbook> findAll(String loanaccountId);
}
