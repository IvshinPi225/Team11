package Lb5;

import javax.swing.*;


import java.awt.event.*;

// ����� ����������� ��������� (�������� ������� ������)
public class ListenerButtonComboBox implements ActionListener {
	
    private JComboBox box;
    private JPanel panel;
    private Image log3;
    public ListenerButtonComboBox (JComboBox a,JPanel b,Image c) {
        box = a;
        panel = b;
        log3 = c;

    }
    //��������
    
	// �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
    	if(log3==null)
        {}
        else
            try {
                switch (box.getSelectedIndex()) {  //MenuBox.comboBox.
                    case 0:
                        log3.setLocation(280, 0);
                        panel.repaint(); //����������� JPanel
                        ;
                        break;
                    case 1:
                        log3.setLocation(140, 80);
                        panel.repaint(); //����������� JPanel
                        ;
                        break;
                    case 2:
                        log3.setLocation(0, 0);
                        panel.repaint(); //����������� JPanel
                        ;
                        break;
                    case 3:
                        new MassiveGui();

                         break;
                    default:
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}