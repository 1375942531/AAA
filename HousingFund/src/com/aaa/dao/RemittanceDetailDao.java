package com.aaa.dao;

import com.aaa.entity.RDUtil;
import com.aaa.entity.Remittancedetail;
import com.aaa.entity.Utinremittancedetail;

public interface RemittanceDetailDao extends BaseDao<Remittancedetail>{

	//���֮��  ����> ��Ӹ��˻����ϸ
	public abstract int sava_RemittanceDetail(RDUtil rdu, Remittancedetail rd);

	//���֮��  ����> ��ӵ�λ�����ϸ
	public abstract int sava_UtInRemittanceDetail(RDUtil rdu,Utinremittancedetail rd);

}