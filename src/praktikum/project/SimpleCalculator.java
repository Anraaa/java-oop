package praktikum.project; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        // Membuat komponen GUI
        JLabel label1 = new JLabel("Angka 1:");
        JTextField textField1 = new JTextField();

        JLabel label2 = new JLabel("Angka 2:");
        JTextField textField2 = new JTextField();

        JLabel resultLabel = new JLabel("Hasil:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Hitung");

        // Menambahkan action listener untuk tombol
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double number1 = Double.parseDouble(textField1.getText());
                    double number2 = Double.parseDouble(textField2.getText());
                    double result = number1 + number2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Menambahkan komponen ke frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(new JLabel()); // Kosongkan satu sel
        frame.add(calculateButton);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
