package com.you.dao;
/*
 *@author you
 *�������ݿ����Ӷ���������Ŀ�����ݿ�򽻵�������һ������ 
 */

import java.sql.Connection;
import com.you.util.DbUtil;

public class BaseDao{
	public Connection con=new DbUtil().getCon();
}
