package com.aaa.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Utinaccountinfo;

@Repository
public class TimerDaoImpl {

	@Resource
	private  HibernateTemplate ht;

	public List timer_sele_utinid(){
		 Date date=new Date();
		 //��ȡ��ǰԼ������
		 SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM");
		 String currtime=fmt.format(date);
		 System.out.println(currtime);
		 //�Ȼ�ȡ����������λ�˻�
		List<Utinaccountinfo> list=ht.find("from Utinaccountinfo where accountStatus='����'");
		
	for (Utinaccountinfo ut : list) {
		//�鿴�����Ƿ񽻹�
		System.out.println(ut.getUtinAccountId());
		List utlist=ht.find("select depositDate from Utinremittancedetail ut " +
				"where ut.utinaccountinfo.utinAccountId="+ut.getUtinAccountId()+" " +
						"order by STR_TO_DATE(DepositDate,'%Y-%m-%d') desc ");
		
		//�нɴ��¼
		if(utlist.size()>0){
			System.out.println(utlist.get(0));
			String utdate=(String) utlist.get(0);
			String substr=utdate.substring(0, 7);
			
			System.out.println(substr);
			//�жϵ�ǰ�����Ƿ�������һ�νɴ�����
			if(currtime.equals(substr)){
				//������ڲ�����ִ��
				
			}else{
				//����������ִ��
				//�õ���Ҫ������Ǯ��
				//Double utsummoney=utdao.UtinSumMoneySele(ut.getUtinAccountId());
				//�õ�
				ht.find("select ");
			}
			
		}//
		
		
	}
		return null;
	}

}
