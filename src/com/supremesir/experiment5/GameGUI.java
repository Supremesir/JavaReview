package com.supremesir.experiment5;


import com.supremesir.thread.Job;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class GameGUI extends JFrame implements ActionListener {

    JFrame mainFrame = new JFrame("主窗体");
    JPanel panelUp = new JPanel();
    JPanel panelMidDown = new JPanel();
    JPanel panelDown = new JPanel();
    JButton getButton = new JButton("得到一个随机数");
    JLabel getLabel = new JLabel("获取[1,10]之间的一个随机数");
    JLabel guessLabel = new JLabel("输入您的猜测");
    JTextField guessText = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JButton okButton = new JButton("确认");
    JLabel okLabel = new JLabel("单机确认按钮");
    JLabel info = new JLabel("提示", JLabel.CENTER);

    private int number = -1;

    GameGUI() {
        getButton.addActionListener(this);
        okButton.addActionListener(this);

        panelUp.add(getLabel);
        panelUp.add(getButton);
        panelUp.add(guessLabel);
        panelUp.add(guessText);
        panelUp.setLayout(new GridLayout(2, 2));

        panelMidDown.add(okLabel);
        panelMidDown.add(okButton);
        panelMidDown.setLayout(new FlowLayout(FlowLayout.CENTER));

        panelDown.setLayout(new BorderLayout());
        panelDown.add(BorderLayout.NORTH,panelMidDown);
        panelDown.add(BorderLayout.CENTER,info);

        mainFrame.setSize(500,300);
        mainFrame.add(panelUp);
        mainFrame.add(panelDown);
        mainFrame.setLayout(new GridLayout(2, 1));
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == getButton) {

            number = (int) (1 + Math.random() * 10);
            if (number == -1) {
                JOptionPane.showMessageDialog(this, "请生成一个随机数", "错误", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(this,"生成随机数成功","成功",JOptionPane.DEFAULT_OPTION);
            }
        }

        if (obj == okButton) {
            String text = guessText.getText();
            if (!text.equals("")) {
                int guess = Integer.parseInt(text);
                if (guess < number) {
                    info.setText("猜小了");
                }
                if (guess == number) {
                    info.setText("猜对了");
                }
                if (guess > number) {
                    info.setText("猜大了");
                }
            } else {
                JOptionPane.showMessageDialog(this, "请输入一个数字", "错误", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new GameGUI();
    }
}
