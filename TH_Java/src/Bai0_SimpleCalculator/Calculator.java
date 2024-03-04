package Bai0_SimpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	public Calculator() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a=");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(49, 47, 143, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b=");
		lblNhpB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpB.setBounds(49, 114, 143, 45);
		contentPane.add(lblNhpB);
		
		txtA = new JTextField();
		txtA.setBounds(202, 47, 306, 33);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(202, 121, 306, 33);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý phép Cộng <<Viết ở hàm khác rồi gọi>>
				HamXuLyCong();
				
			}
		});
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCong.setBounds(49, 207, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý phép Trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTru.setBounds(167, 208, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("x");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý phép Nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNhan.setBounds(285, 208, 85, 21);
		contentPane.add(btnNhan);
		
		JButton ntrChia = new JButton("/");
		ntrChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý phép Chia
				HamXuLyChia();
			}
		});
		ntrChia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		ntrChia.setBounds(400, 208, 85, 21);
		contentPane.add(ntrChia);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQu.setBounds(49, 282, 143, 45);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(202, 289, 306, 33);
		contentPane.add(txtKQ);
		} ////END
		
	void HamXuLyCong() {
	    try {
	        //Lấy dữ liệu
	        String str_A = txtA.getText();
	        String str_B = txtB.getText();
	        //Đổi kiểu
	        double A = Double.parseDouble(str_A);
	        double B = Double.parseDouble(str_B);
	        //Tính toán
	        double tong = A + B;
	        //Hiển thị
	        txtKQ.setText(String.valueOf(tong));
	    } catch (NumberFormatException e) {
	        txtKQ.setText("Vui lòng nhập số!");
	    }
	}

	void HamXuLyTru() {
	    try {
	        //Lấy dữ liệu
	        String str_A = txtA.getText();
	        String str_B = txtB.getText();
	        //Đổi kiểu
	        double A = Double.parseDouble(str_A);
	        double B = Double.parseDouble(str_B);
	        //Tính toán
	        double hieu = A - B;
	        //Hiển thị
	        txtKQ.setText(String.valueOf(hieu));
	    } catch (NumberFormatException e) {
	        txtKQ.setText("Vui lòng nhập số!");
	    }
	}

	void HamXuLyNhan() {
	    try {
	        //Lấy dữ liệu
	        String str_A = txtA.getText();
	        String str_B = txtB.getText();
	        //Đổi kiểu
	        double A = Double.parseDouble(str_A);
	        double B = Double.parseDouble(str_B);
	        //Tính toán
	        double tich = A * B;
	        //Hiển thị
	        txtKQ.setText(String.valueOf(tich));
	    } catch (NumberFormatException e) {
	        txtKQ.setText("Vui lòng nhập số!");
	    }
	}

	void HamXuLyChia() {
	    try {
	        //Lấy dữ liệu
	        String str_A = txtA.getText();
	        String str_B = txtB.getText();
	        //Đổi kiểu
	        double A = Double.parseDouble(str_A);
	        double B = Double.parseDouble(str_B);
	        //Kiểm tra chia cho 0
	        if (B == 0) {
	            txtKQ.setText("Không thể chia cho 0");
	        } else {
	            //Tính toán
	            double thuong = A / B;
	            //Hiển thị
	            txtKQ.setText(String.valueOf(thuong));
	        }
	    } catch (NumberFormatException e) {
	        txtKQ.setText("Vui lòng nhập số!");
	    }
	}

		
}
