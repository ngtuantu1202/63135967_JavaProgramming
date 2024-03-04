package Bai1_LoginNTU;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTK;
	private JPasswordField txtMK;

	public Login() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("ĐĂNG NHẬP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(58, 84, 107, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMtKhu.setBounds(58, 175, 107, 44);
		contentPane.add(lblMtKhu);
		
		txtTK = new JTextField();
		txtTK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtTK.setBounds(266, 84, 311, 33);
		contentPane.add(txtTK);
		txtTK.setColumns(10);
		
		txtMK = new JPasswordField();
		txtMK.setBounds(266, 184, 311, 30);
		contentPane.add(txtMK);
		
		JButton btnDN = new JButton("ĐĂNG NHẬP");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm xử lý đăng nhập
				XuLyDangNhap();
			}
		});
		btnDN.setBackground(new Color(255, 0, 0));
		btnDN.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnDN.setBounds(283, 305, 201, 44);
		contentPane.add(btnDN);
	}
	
	void XuLyDangNhap() {
		//Lấy tên và mk
		String strTK = txtTK.getText();
		String strMK = txtMK.getText();
		//Xử lý
		if(strTK.equals("63CNTT") && (strMK).equals("123"))
		{
			//Hiện trang chủ
			Home homePage = new Home();
			homePage.setVisible(true);
			//Ẩn form
			this.setVisible(false);
			
		}else 
		{
			txtTK.setText("");
			txtMK.setText("");
			//Báo lỗi
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Sai TK hoặc MK");
		}
	}
}
