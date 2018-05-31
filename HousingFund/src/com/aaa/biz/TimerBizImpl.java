package com.aaa.biz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.UtinaccountinfoUtilDao;
import com.aaa.entity.Flupay;
import com.aaa.entity.Indaccountinfo;
import com.aaa.entity.Utinaccountinfo;
import com.aaa.entity.Utinremittancedetail;

@Service
@Transactional
public class TimerBizImpl implements TimerBiz {

	@Resource
	private UtinaccountinfoUtilDao utdao;
	
	public void timersucc(){
		 Date date=new Date();
		 //��ȡ��ǰԼ������
		 SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM");
		 String currtime=fmt.format(date);
		 System.out.println(currtime);
		
		 //�õ����п�����ʱ����ĵ�λ
		 List<Flupay> flist= utdao.selefu();
		 for (Flupay flupay : flist) {
			 //�жϵ�λ�Ƿ�����
			 System.out.println(flupay.getUtinaccountinfo().getUtinAccountId());
			 List<Utinaccountinfo> ut=utdao.ss(flupay.getUtinaccountinfo().getUtinAccountId());
		     
			 if(ut.size()>0){
		    	//�鿴�����Ƿ񽻹�
				 System.out.println(999);
					List utlist=utdao.sele_uddate(ut.get(0).getUtinAccountId());
					//�Ƿ��нɴ��¼
					if(utlist.size()>0){
						//��ȡ����
						System.out.println(utlist.get(0));
					
						String utdate=utlist.get(0).toString();
						String substr=utdate.substring(0, 7);
						
						System.out.println(substr);
						//�жϵ�ǰ�����Ƿ�������һ�νɴ�����
						if(currtime.equals(substr)){
							
							//������ڲ�����ִ��
							
						}else{
							//����������ִ��
							//�õ���Ҫ������Ǯ��
							Double utsummoney=utdao.UtinSumMoneySele(ut.get(0).getUtinAccountId());
							System.out.println(utsummoney);
							//�õ��˻����
							Double money=utdao.sele_yue(ut.get(0).getUtinAccountId());
							System.out.println(money);
							//��������ڵ����ܽ��ɽ�ִ��
							if(money>=utsummoney){
								System.out.println(111);
								//��ѯ���и����˻� id 
							
							List<Indaccountinfo> indlist=utdao.sele_Allindinfo(ut.get(0).getUtinAccountId());
							
							//�޸ĸ����˻�
							for (Indaccountinfo ind : indlist) {
								//��ѯ�����˻����޸� ��Ӹ��˽ɴ��¼
						utdao.sele_oneindinfo(ut.get(0).getUtinAccountId(), 
								ind.getIndAccountId(),ut.get(0).getUtinName());
						
							}
							//�޸ĵ�λ�˻����
							utdao.update_utinmoney(ut.get(0).getUtinAccountId(), utsummoney);
							//��ӵ�λ��ɼ�¼
							utdao.add_rd(ut.get(0).getUtinAccountId(), utsummoney);
							
							}else{
								
								//��ִ��
							}
							
						}
		    	 
		     }
		 }
		//�õ�����������λ
		//List<Utinaccountinfo> list=utdao.utinse();
		
		}

	}
	
}
