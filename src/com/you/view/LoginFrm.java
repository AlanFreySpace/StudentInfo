package com.you.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.you.dao.AdminDao;
import com.you.model.Admin;
import com.you.model.UserType;
import com.you.util.StringUtil;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrm extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("New label");
	private JLabel label_1;
	private JLabel lblNewLabel_1;
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
		setTitle("\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u5B66\u751F\u4FE1\u606F\u7CFB\u7EDF\u767B\u9646");
		label.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u5B66\u751F\u7BA1\u7406,\u5934\u50CF,\u4EBA.png")));
		label.setFont(new Font("楷体", Font.BOLD, 20));
		
		label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_1.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u7528\u6237\u540D.png")));
		label_1.setFont(new Font("楷体", Font.BOLD, 15));
		
		lblNewLabel_1 = new JLabel("\u5BC6  \u7801\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u5BC6\u7801.png")));
		lblNewLabel_1.setFont(new Font("楷体", Font.BOLD, 15));
		
		userNameTextField = new JTextField();
		userNameTextField.setColumns(10);
		
		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u89D2  \u8272\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/userType.png")));
		lblNewLabel_2.setFont(new Font("楷体", Font.BOLD, 15));
		
		userTypeComboBox = new JComboBox();
		userTypeComboBox.setModel(new DefaultComboBoxModel(new UserType[] {UserType.ADMIN, UserType.TEACHER, UserType.STUDENT}));
		userTypeComboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		JButton loginButton = new JButton("\u767B\u5F55");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				loginAct(ae);
			}
		});
		loginButton.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u767B\u5F55.png")));
		loginButton.setFont(new Font("楷体", Font.BOLD, 15));
		
		JButton resetButton = new JButton("\u91CD\u7F6E");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				resetValue(ae);
			}
		});
		resetButton.setFont(new Font("楷体", Font.BOLD, 15));
		resetButton.setIcon(new ImageIcon(LoginFrm.class.getResource("/images/\u91CD\u7F6E.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(207)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(label_1)
								.addComponent(loginButton))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordTextField, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
										.addComponent(userTypeComboBox, 0, 186, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(135)
											.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
										.addComponent(userNameTextField, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(resetButton)))
							.addGap(249))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
							.addGap(55))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_1)
							.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(userTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(loginButton)
						.addComponent(resetButton))
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void loginAct(ActionEvent ae) {
		// TODO 自动生成的方法存根
		String userName=userNameTextField.getText().toString();
		String password=passwordTextField.getText().toString();
		UserType selectedItem = (UserType)userTypeComboBox.getSelectedItem();
		if(StringUtil.isEmpty(userName)){
			JOptionPane.showMessageDialog(this, "用户名不能为空！");
			return;
		}
		if(StringUtil.isEmpty(password)){
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			return;
		}
		if("系统管理员".equals(selectedItem.getName())){
			//系统管理员登录
			AdminDao adminDao=new AdminDao();
			Admin adminTmp=new Admin();
			adminTmp.setName(userName);
			adminTmp.setPassword(password);
			Admin admin=adminDao.login(adminTmp);
			if(admin==null){
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
				return;
			}
		}else if("教师".equals(selectedItem.getName())){
			//教师登录
		}else{
			//学生登录
		}
	}

	protected void resetValue(ActionEvent ae) {
		// TODO 自动生成的方法存根
		userNameTextField.setText("");
		passwordTextField.setText("");
		userTypeComboBox.setSelectedIndex(0);
	}
}
