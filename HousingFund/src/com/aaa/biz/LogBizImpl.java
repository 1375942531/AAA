package com.aaa.biz;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.LogDao;
import com.aaa.entity.Log;
@Service
@Transactional
//�廹����־
public class LogBizImpl implements LogBiz {
	 @Autowired
	 private LogDao dao;
   //��¼��־
	@Override
	public void add(Log log) {
		dao.save(log);
	}
   //��ѯ��־
	@Override
	public List getAll() {
		return dao.findByCriteria(null, Order.desc("id"));
	}

}
