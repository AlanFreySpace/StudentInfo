package com.you.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.you.Model.Admin;
import com.you.Model.UserType;
import com.you.dao.AdminDao;
import com.you.util.StringUtil;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrm extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTextField;
	private JTextField passwordTextField;
    private JComboBox userTypeComboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrm frame = new LoginFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrm() {
		setTitle("\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5B66\u751F\u4FE1\u606F\u7CFB\u7EDF\u767B\u5F55");
		lblNewLabel.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/logo.png")));
		lblNewLabel.setFont(new Font("楷体", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("   \u7528\u6237\u540D");
		lblNewLabel_1.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		userNameTextField = new JTextField();
		userNameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("   \u5BC6   \u7801");
		lblNewLabel_2.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u5BC6\u7801.png")));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u7528\u6237\u7C7B\u578B");
		lblNewLabel_3.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/userType.png")));
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		userTypeComboBox = new JComboBox();
		//枚举类型，重写toString方法
		userTypeComboBox.setModel(new DefaultComboBoxModel(new UserType[] {UserType.ADMIN, UserType.TEACHER, UserType.STUDENT}));
		userTypeComboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton loginButton = new JButton("\u767B\u5F55");
		loginButton.addActionListener(new ActionListener() {
			//点击登录按钮后执行的操作
			public void actionPerformed(ActionEvent ae) {
				loginAction(ae);
			}
		});
		loginButton.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u767B\u5F55.png")));
		loginButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton resetButton = new JButton("\u91CD\u7F6E");
		resetButton.addActionListener(new ActionListener() {
			//点击重置按钮后执行的操作
			public void actionPerformed(ActionEvent ae) {
				resetValue(ae);
			}
		});
		resetButton.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u91CD\u7F6E.png")));
		resetButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(170)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(loginButton)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(resetButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(userTypeComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblNewLabel)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordTextField)
								.addComponent(userNameTextField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(userTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(loginButton)
						.addComponent(resetButton))
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}

	

	protected void loginAction(ActionEvent ae) {
		// TODO Auto-generated method stub
		String userName=userNameTextField.getText().toString();
		String password=passwordTextField.getText().toString();
		UserType selectedItem=(UserType)userTypeComboBox.getSelectedItem();
		if(StringUtil.isEmpty(userName)||StringUtil.isEmpty(password)){
			JOptionPane.showMessageDialog(this, "用户名或密码不能为空！");
			return;
		}
		if("系统管理员".equals(selectedItem.getName())) {
			//系统管理员登录
			AdminDao adminDao=new AdminDao();
			Admin adminTmp=new Admin();
			adminTmp.setName(userName);
			adminTmp.setPassword(password);
			Admin admin=adminDao.login(adminTmp);
			if(admin==null) {
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
				return;
			}
		}else if("教师".equals(selectedItem.getName())) {
			//教师登录
		}else {
			//学生登录
		}
	}

	protected void resetValue(ActionEvent ae) {
		// TODO Auto-generated method stub
		userNameTextField.setText("");
		passwordTextField.setText("");
		userTypeComboBox.setSelectedIndex(0);//第一项下标为0
	}

	
}
