package com.aaa.dao;

import com.aaa.entity.Loanaccountinfo;
import com.aaa.entity.Loanapplication;

public interface LoanaccountinfoDao extends BaseDao<Loanaccountinfo> {
   //ͨ��������鿴������Ϣ
	public Loanaccountinfo getLoanaccountinf(Loanapplication loan);
}
