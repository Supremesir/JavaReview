package com.supremesir.experiment5;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 21:40
 */

public class TextGUI extends JFrame implements ActionListener {

    //声明需要的组件
    JFrame mainFrame = new JFrame("主窗体");
    JPanel panelUp = new JPanel();
    JLabel pathLabel = new JLabel();
    JLabel addLabel = new JLabel();
    JButton writeButton = new JButton();
    JTextField pathText = new JTextField();
    JTextField addText = new JTextField();


    JTextArea fileText = new JTextArea();

    TextGUI() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(200, 300);

        panelUp.add(pathLabel);
        panelUp.add(pathText);
        panelUp.add(addLabel);
        panelUp.add(addText);
        panelUp.add(writeButton);
        panelUp.setLayout(new GridLayout(3, 2));
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new TextGUI();
    }

}
