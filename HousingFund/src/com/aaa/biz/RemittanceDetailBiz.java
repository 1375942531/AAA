package com.aaa.biz;

import java.util.List;

import com.aaa.entity.RDUtil;
import com.aaa.entity.Remittancedetail;
import com.aaa.entity.Utinremittancedetail;

public interface RemittanceDetailBiz {

	//���֮��  ����> ��Ӹ��˻����ϸ
	public abstract int sava_RemittanceDetail(RDUtil rdu, Remittancedetail rd);

	//���֮��  ����> ��ӵ�λ�����ϸ
	public abstract int sava_UtInRemittanceDetail(RDUtil rdu,
			Utinremittancedetail rd);
	
	//��ѯ��ɼ�¼
		public List<Remittancedetail> findRecord(String indAccountId);

}