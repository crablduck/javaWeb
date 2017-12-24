package day56_hibernate_05_onetomany;

import static org.junit.Assert.*;

import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.qf.entity.Classes;
import com.qf.entity.Teacher;
import com.qf.utils.HibernateUtil;

public class CalssesDaoTest {

	/**
	 * 第一个版本的增加，出现了主键重复的问题，原因：两边都插入了中间表
	 */
	@Test
	public void testAdd() {
		
		// 1.创建两个班级
		Classes classes1 = new Classes();
		classes1.setName("1707");
		
		Classes classes2 = new Classes();
		classes2.setName("1706");
		
		// 2.创建两个老师
		Teacher teacher1 = new Teacher();
		teacher1.setName("侯老师");
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("达老师");
		
		
		//3.建立关系
		// 一个老师带多个班级
		teacher1.getClasses().add(classes1);
		teacher1.getClasses().add(classes2);
		
		teacher2.getClasses().add(classes1);
		teacher2.getClasses().add(classes2);
		
		// 一个班级被多个老师带
		classes1.getTeachers().add(teacher1);
		classes1.getTeachers().add(teacher2);
		
		classes2.getTeachers().add(teacher1);
		classes2.getTeachers().add(teacher2);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 4.保存数据
		session.save(teacher1);
		session.save(teacher2);
		session.save(classes1);
		session.save(classes2);
		
		transaction.commit();
		
	}
	
	/**
	 * 在classs把权限放了交给teacher维护，所以只要在teacher这边建立关系就可以
	 */
	@Test
	public void testAdd2() {
		
		// 1.创建两个班级
		Classes classes1 = new Classes();
		classes1.setName("1707");
		
		Classes classes2 = new Classes();
		classes2.setName("1706");
		
		// 2.创建两个老师
		Teacher teacher1 = new Teacher();
		teacher1.setName("侯老师");
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("达老师");
		
		
		//3.建立关系
		// 一个老师带多个班级
		teacher1.getClasses().add(classes1);
		teacher1.getClasses().add(classes2);
		
		teacher2.getClasses().add(classes1);
		teacher2.getClasses().add(classes2);
		
		// 一个班级被多个老师带
//		classes1.getTeachers().add(teacher1);
//		classes1.getTeachers().add(teacher2);
//		
//		classes2.getTeachers().add(teacher1);
//		classes2.getTeachers().add(teacher2);
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 4.保存数据
		session.save(teacher1);
		session.save(teacher2);
		session.save(classes1);
		session.save(classes2);
		
		transaction.commit();
	}
	
	/**
	 * 级联添加,首先要考虑维护全在那边，级联属性就就加在那边
	 */
	@Test
	public void testAdd3() {
		
		// 1.创建两个班级
		Classes classes1 = new Classes();
		classes1.setName("1707");
		
		Classes classes2 = new Classes();
		classes2.setName("1706");
		
		// 2.创建两个老师
		Teacher teacher1 = new Teacher();
		teacher1.setName("侯老师");
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("达老师");
		
		
		//3.建立关系
		// 一个老师带多个班级
		teacher1.getClasses().add(classes1);
		teacher1.getClasses().add(classes2);
		
		teacher2.getClasses().add(classes1);
		teacher2.getClasses().add(classes2);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// 4.保存数据
		session.save(teacher1);
		session.save(teacher2);
//		session.save(classes1);
//		session.save(classes2);
		
		transaction.commit();
	}
	
	/**
	 * 多对多的级联删除会很危险
	 * 	 再删除老师的时候
	 * 			1)先删除中间表和老师有关系的
	 * 			2)再去删除班级
	 */
	@Test
	public void testDelete() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		Teacher teacher = (Teacher)session.get(Teacher.class, 5);
		
		Set<Classes> classes = teacher.getClasses();
		for (Classes classes2 : classes) {
			classes2.getTeachers().remove(teacher);
		}
		
		session.delete(teacher);
		
		transaction.commit();
	}

}
