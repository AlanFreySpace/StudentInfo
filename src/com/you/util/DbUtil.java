package com.you.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_student?useUnicode=true&characterEncoding=utf8";
    private String dbUserName="root";
    private String dbPassword="123456";
    private String jdbcName="com.mysql.jdbc.Driver";
    
    public Connection getCon() {
    	try {
    		Class.forName(jdbcName);
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	Connection con=null;
    	try {
    		con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    	return con;
    }
    
    public void closeCon(Connection con)throws Exception{
    	if(con!=null) {
    		con.close();
    	}
    }
    
    public static void main(String[] args) {
    	DbUtil dbUtil=new DbUtil();
    	try{
    		dbUtil.getCon();
    		System.out.println("数据库连接成功");
    	}catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("数据库连接失败");
    	}
    	}
    
}
