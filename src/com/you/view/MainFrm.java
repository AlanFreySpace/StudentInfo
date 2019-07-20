package com.you.view;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class MainFrm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
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
	public MainFrm() {
		setTitle("\u5B66\u751F\u4FE1\u606F\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 621);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		mnNewMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7CFB\u7EDF\u8BBE\u7F6E.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		menuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u4FEE\u6539\u5BC6\u7801.png")));
		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		mnNewMenu.add(menuItem_1);
		
		JMenu menu = new JMenu("\u5B66\u751F\u7BA1\u7406");
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5B66\u751F\u7BA1\u7406.png")));
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5B66\u751F\u6DFB\u52A0");
		mntmNewMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
		menu.add(mntmNewMenuItem);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5B66\u751F\u5217\u8868");
		menuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7528\u6237\u5217\u8868.png")));
		menu.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("\u73ED\u7EA7\u7BA1\u7406");
		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u73ED\u7EA7\u7BA1\u7406.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_3 = new JMenuItem("\u73ED\u7EA7\u6DFB\u52A0");
		menuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u6DFB\u52A0.png")));
		menu_1.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u73ED\u7EA7\u5217\u8868");
		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u73ED\u7EA7\u5217\u8868.png")));
		menu_1.add(menuItem_4);
		
		JMenu menu_2 = new JMenu("\u5E2E\u52A9");
		menu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5E2E\u52A9.png")));
		menuBar.add(menu_2);
		
		JMenuItem menuItem_5 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				aboutUs(ae);
			}
		});
		menuItem_5.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
		menu_2.add(menuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	protected void aboutUs(ActionEvent ae) {
		// TODO Auto-generated method stub
		String info="数据库课程设计\n有伟东\n201600301161";
		//JOptionPane.showMessageDialog(this, info);这样太丑，咱换个花哨的
		String[] buttons= {"看看我的github","不想看"};
		int ret=JOptionPane.showOptionDialog(this, info, "关于", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, new ImageIcon(LoginFrm.class.getResource("/images/logo.png")), buttons, null);
		if(ret==0) {
			try {
				//Java调用浏览器打开指定网址
				URI uri=new URI("https://github.com/alan6frey/StudentInfo");
				Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			JOptionPane.showMessageDialog(this, "你好狠心嘤嘤嘤");
		}
	}

	

}
