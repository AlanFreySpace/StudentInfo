package com.you.dao;

import java.sql.Connection;

import com.you.util.DbUtil;

public class BaseDao {
	public Connection con=new DbUtil().getCon();

}
