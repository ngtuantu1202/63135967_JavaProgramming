package Bai2_PTB2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GiaiPTB2 extends JFrame {
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JTextArea txtKetQua;

    public GiaiPTB2() {
        setTitle("Giải phương trình bậc 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(801, 448);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        panel.add(new JLabel("Nhập a:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Nhập b:"));
        txtB = new JTextField();
        panel.add(txtB);

        panel.add(new JLabel("Nhập c:"));
        txtC = new JTextField();
        panel.add(txtC);

        JButton btnGiai = new JButton("Giải");
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());
                String ketQua = giaiPTBac2(a, b, c);
                txtKetQua.setText(ketQua);
            }
        });
        panel.add(btnGiai);

        txtKetQua = new JTextArea();
        txtKetQua.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtKetQua);
        panel.add(scrollPane);

        getContentPane().add(panel);
    }

    private String giaiPTBac2(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Phương trình vô nghiệm";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phương trình có nghiệm kép: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
        }
    }
}
