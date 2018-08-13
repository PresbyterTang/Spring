package com.nsu.tly.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nsu.tly.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	
	public int addUser(User user) {
		
		String sql1="CREATE table t_user(id int ,username VARCHAR(50) ,password VARCHAR(50) )";
		String sql2="insert into t_user values(1,'zhangsan','123')";
		
		String sql3="insert into t_user values(?,?,?)";
		Object[] params =new Object[]{
			user.getId(),user.getUserName(),user.getPassword()
		};
		return this.jdbcTemplate.update(sql3, params);
	}



	
	public int acountIn(String inUserName,double money) {
		String sql="update t_user set money=money+? " +
				" where userName = ?";
		return jdbcTemplate.update(sql, money,inUserName);
	}



	
	public int acountOut(String outUserName,double money) {
		String sql="update t_user set money=money-? " +
			" where userName = ?";
	    return jdbcTemplate.update(sql, money,outUserName);
	}




	
	public List<User> queryAll() {
		
		String sql="select * from t_user";
		/*RowMapper<User> rowMapper = ParameterizedBeanPropertyRowMapper
                .newInstance(User.class);
		*/
		RowMapper<User> rowMapper1=new BeanPropertyRowMapper<User>(User.class);
		return this.jdbcTemplate.query(sql, rowMapper1);
		
		// TODO Auto-generated method stub
		//return null;
	}




	
	public List<User> queryByName(String userName) {
		
		String sql="select * from t_user where userName=?";
		//RowMapper<User> rowMapper = ParameterizedBeanPropertyRowMapper
          //      .newInstance(User.class);
		
		RowMapper<User> rowMapper1=new BeanPropertyRowMapper<User>(User.class); 
		//BeanPropertyRowMapper<User>.newInstance(User.class);
		
		return this.jdbcTemplate.query(sql,rowMapper1,userName);
		
		
		
		// TODO Auto-generated method stub
		//return null;
	}




	
	public int moneyIn(String inAcount, double money) {
		
		String sql="update t_user set money=money+? where userName=?";
		
		// TODO Auto-generated method stub
		return this.jdbcTemplate.update(sql,money,inAcount);
	}




	
	public int moneyOut(String outAcount, double money) {
String sql="update t_user set money=money-? where userName=?";
	
		return this.jdbcTemplate.update(sql,money,outAcount);
	}


}
