package com.xjw.dao.impl;

import java.util.List;

import com.xjw.dao.IUserDao;
import com.xjw.entity.Page;
import com.xjw.entity.User;
import com.xjw.utils.DBManager;

public class UserDaoImpl extends DBManager<User> implements IUserDao{

	@Override
	public int add(User t) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO tb_user(NAME, PASSWORD) values(?,?)";
		return commonUpdate(sql, t.getName(), t.getPassword());
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE tb_user SET NAME = ?, PASSWORD = ?";
		return commonUpdate(sql, t.getName(), t.getPassword());
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		String sql = "select * from tb_user where id = ?";
		List<User> list = commonQuery(sql, User.class, id);
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM tb_user WHERE id = ?";
		return commonUpdate(sql, id);
	}

	@Override
	public List<User> list(Integer startIndex, Integer pageSize) {
		// TODO Auto-generated method stub
		String sql = "select * from tb_user LIMIT ?,?";
		return commonQuery(sql, User.class, startIndex,pageSize);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		String sql = "select count(1) from tb_user";
		return commonSize(sql);
	}

}
