package Lb5;

import javax.swing.*;

import java.io.FileNotFoundException;


class info {
	
	public info() {
		JFrame info_GUI = new JFrame("subversion");	// �������� ������������ ����
		info_GUI.setTitle ("��� � �������");
		info_GUI.setBounds(500,400,350,300);
		info_GUI.setResizable(false); // ������������� ������ ����
		JPanel InfoPanel = new JPanel();
		InfoPanel.setLayout(null);
		info_GUI.add(InfoPanel);
		
		JLabel li1 = new JLabel("����� �.A. : 20130830; 02.04.22 "); // ����������� ������ ��� �����������
		li1.setBounds(10,10,150,30);
		InfoPanel.add(li1);
		
		JLabel li2 = new JLabel("�������� �.�. : 20130505; 02.04.22"); // ����������� ������ ��� �����������
		li2.setBounds(10,40,150,30);
		InfoPanel.add(li2);
		
		JLabel li3 = new JLabel("����� �.�. : 20130821; 02.04.22 "); // ����������� ������ ��� �����������
		li3.setBounds(10,70,180,30);
		InfoPanel.add(li3);
		
		JLabel li4 = new JLabel("���������� �.�. : 20131012"); // ����������� ������ ��� �����������
		li4.setBounds(10,100,180,30);
		InfoPanel.add(li4);
		
		JButton button_back = new JButton("�����");
        button_back.setBounds(200, 200, 100, 40);
        ListenerButtonBack infoListener = new ListenerButtonBack(info_GUI);
        button_back.addActionListener(infoListener);
        InfoPanel.add(button_back);
        
        //StringBuilder strLine = new StringBuilder();
        //try {
        //    FileRead fl = new FileRead(strLine);
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}


        //JTextArea rtx = new JTextArea(strLine.toString());
        //rtx.setBounds(0,0,350,300);
        //rtx.setEditable(false);
        //InfoPanel.add(rtx);
		
		info_GUI.setVisible(true);
	}

}
