package Lb5;

import javax.swing.*;

import java.awt.event.*;

// ����� ����������� ��������� (�������� ������� ������)
public class ListenerButtonBack implements ActionListener {
    private JFrame frame;
    public ListenerButtonBack(JFrame a){
        frame = a;
    }

   
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

        frame.setVisible(false);

    }

}