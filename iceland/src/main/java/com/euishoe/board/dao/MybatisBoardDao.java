package com.euishoe.board.dao;

import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisBoardDao implements BoardDao {
	
	private static final String NAMESPACE = "com.euishoe.board.";
	
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}










