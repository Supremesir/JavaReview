package com.supremesir.experiment5;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

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
        //设置退出后关闭程序
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 250);

        pathLabel.setText("请输入文件路径");
        addLabel.setText("请输入要添加的内容");

        writeButton.setText("将文本区内容写入文件");
        //为按钮添加事件监听
        writeButton.addActionListener(this);

        //文本框自动换行
        fileText.setLineWrap(true);

        //为追加文字添加事件监听
        addText.addActionListener(this);

        //将组件添加到面板里
        panelUp.add(pathLabel);
        panelUp.add(pathText);
        panelUp.add(addLabel);
        panelUp.add(addText);
        panelUp.add(writeButton);
        //面板布局设置为3*2的GridLayout
        panelUp.setLayout(new GridLayout(3, 2));
        //设置可见性
        panelUp.setVisible(true);

        mainFrame.add(panelUp);
        //初始化一个容器（旧版兼容）
        mainFrame.getContentPane().add(fileText);
        //窗体布局设置为2*1的GridLayout
        mainFrame.setLayout(new GridLayout(2, 1));
        mainFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //获取事件对象
        Object source = e.getSource();
        //为按钮事件添加响应
        if (source == writeButton) {
            String text = fileText.getText();
            String path = pathText.getText();
            if (!path.equals("")) {
                try {
                    FileWriter file = new FileWriter(path);
                    file.write(text);
                    file.flush();
                    file.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        //为追加文字事件添加响应
        if (source == addText) {
            String str = addText.getText();
            fileText.append("\n" + str);
        }
    }

    public static void main(String[] args) {
        //开始构造
        new TextGUI();
    }

}
