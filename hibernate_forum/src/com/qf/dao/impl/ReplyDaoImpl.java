package com.qf.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.qf.dao.IReplyDao;
import com.qf.entity.Reply;
import com.qf.utils.HibernateUtil;

public class ReplyDaoImpl implements IReplyDao {

	@Override
	public int add(Reply t) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		int save = (int) session.save(t);
		return save;
	}

	@Override
	public int update(Reply t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Reply> getList(Integer startIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reply getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCount() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("select count(r) from Reply r");
		Long count = (Long) query.uniqueResult();
		return Integer.parseInt(count.toString());
	}

	@Override
	public List<Reply> getReplyListByTopicId(Integer id, int startIndex, Integer size) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("from Reply r where r.topic.id = :id order by r.createDate asc");
		query.setInteger("id", id);
		query.setFirstResult(startIndex);
		query.setMaxResults(size);
		return (List<Reply>) query.list();
	}

	@Override
	public int getCount(int topicId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Query query = session.createQuery("select count(r) from Reply r where r.topic.id = :id");
		query.setInteger("id", topicId);
		Long count = (Long) query.uniqueResult();
		return Integer.parseInt(count.toString());
	}

}
