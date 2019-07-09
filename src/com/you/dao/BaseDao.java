package com.you.dao;
/*
 *@author you
 *创建数据库连接对象，整个项目与数据库打交道都用这一个对象 
 */

import java.sql.Connection;
import com.you.util.DbUtil;

public class BaseDao{
	public Connection con=new DbUtil().getCon();
}
