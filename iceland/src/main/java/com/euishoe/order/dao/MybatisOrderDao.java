package com.euishoe.order.dao;

import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisOrderDao implements OrderDao {
	
	private static final String NAMESPACE = "com.euishoe.order.";
	
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}










