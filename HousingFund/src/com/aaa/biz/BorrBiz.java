package com.aaa.biz;

import java.util.List;

import com.aaa.entity.Borrowmoneyagreement;
import com.aaa.entity.Loanapplication;
import com.aaa.entity.Repaymentplandetails;

/**����ͬ**/
public interface BorrBiz {
  //���ҳ�������(ȡ��һ�������¼)
  public Repaymentplandetails getRepay(Borrowmoneyagreement borr);
  //ͨ�����֤��ȡ������ͬ
  public Borrowmoneyagreement getBorr(Borrowmoneyagreement borr);
  //�����ύ����
  public boolean return_loan(Integer id);
  //���廹��
  public void sure_end(String repaymentAccount);
  //��ѯ�ѻ����¼
  public List getPaid(Integer id);
  //��ѯδ�����
public boolean find(Loanapplication loan);
}
