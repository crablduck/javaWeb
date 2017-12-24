package com.qf.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.Reply;
import com.qf.entity.Topic;
import com.qf.entity.User;
import com.qf.utils.HibernateUtil;

public class UserTest {

	@Test
	public void testUserAdd() {
		User user = new User();
		user.setName("admin");
		user.setPassword("admin");

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		session.save(user);
		transaction.commit();
	}

	@Test
	public void testTopicAdd() {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		User user = (User) session.get(User.class, 2);
		for(int i=0;i<20;i++){
			Topic topic = new Topic();
			topic.setTitle("第"+i+"篇帖子正在开发中。。。。。");
			topic.setContent("第"+i+"篇帖子内容！！");
			topic.setCreateDate(new Date());
			topic.setUser(user);
			session.save(topic);
		}

		transaction.commit();
	}

	@Test
	public void testReplyAdd() {

		Reply reply = new Reply();
		reply.setContent("楼主号见解");
		reply.setCreateDate(new Date());

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		Transaction transaction = session.beginTransaction();

		User user = (User) session.get(User.class, 2);
		Topic topic = (Topic) session.get(Topic.class, 1);
		reply.setUser(user);
		reply.setTopic(topic);

		session.save(reply);
		transaction.commit();
	}

}
