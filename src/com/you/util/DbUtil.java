package com.you.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_student?useUnicode=true&characterEncoding=utf8";//���ݿ����ӵ�ַ��ָ��Unicode���뷽ʽ���ַ���ʹ��utf8
	private String dbUserNmae="root";//�û���
	private String dbPassword="123456";//����
	private String jdbcName="com.mysql.jdbc.Driver";//��������
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getCon(){
		try{
			Class.forName(jdbcName);//�ҵ������mysql��jar��
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
	 * �ر����ݿ�����
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
			System.out.println("���ݿ����ӳɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		
	}
}
