package com.xjw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xjw.entity.User;

public interface IUserDao {

	@Select("select * from tb_user where id = #{id}")
	User getUserById(Integer id);
	
	@Insert(value="insert into tb_user(name,password) values(#{name},#{password})")
	int add(User user);
	
	@Update(value="update tb_user set name=#{name}, password=#{password} where id=#{id}")
	int update(User user);
	
	@Delete("delete from tb_user where id=#{id} ")
	int delete(Integer id);
	
	@Select("select * from tb_user")
	List<User> list();
}
