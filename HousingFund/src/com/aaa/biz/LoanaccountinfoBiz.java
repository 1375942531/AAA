package com.aaa.biz;

import com.aaa.entity.Collateralinfo;
import com.aaa.entity.Guarantorinfo;
import com.aaa.entity.Loanaccountinfo;
import com.aaa.entity.Loanapplication;

public interface LoanaccountinfoBiz {
  //��ȡ������Ϣ
	public Loanaccountinfo findByExample(Loanaccountinfo entity);
  //����Ѻ����ֵ����
	public void save(Loanaccountinfo accountEntity,Loanapplication loanentity);
  //��ȡ��Ѻ����Ϣ 	
	public Collateralinfo getColl(int loanId);
  //��ȡ��������Ϣ	
	public Guarantorinfo getGuar(int loanId);
}
