package com.you.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_student?useUnicode=true&characterEncoding=utf8";//数据库连接地址，指定Unicode编码方式，字符集使用utf8
	private String dbUserNmae="root";//用户名
	private String dbPassword="123456";//密码
	private String jdbcName="com.mysql.jdbc.Driver";//驱动名称
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getCon(){
		try{
			Class.forName(jdbcName);//找到调入的mysql的jar包
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Connection con=null;
		try{
			con=DriverManager.getConnection(dbUrl,dbUserNmae,dbPassword);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * 关闭数据库连接
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception{
		if(con!=null)
			con.close();
	}
	public static void main(String[] args){
		DbUtil dbUtil=new DbUtil();
		try{
			dbUtil.getCon();
			System.out.println("数据库连接成功");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
		
	}
}
