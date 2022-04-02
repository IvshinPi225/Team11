package Lb5;

import javax.swing.*;

public class MassiveGui {
    String m = "";
    public MassiveGui(){

        Class2.array();
        Class3.sort(Class2.mas);

        JFrame mas_GUI = new JFrame("subversion");
        mas_GUI.setTitle("Отсортированный массив ");
        mas_GUI.setBounds(500, 400, 300, 370);
        mas_GUI.setResizable(false);

        JPanel mas_panel = new JPanel();
        mas_panel.setLayout(null);
        mas_GUI.add(mas_panel);

        JLabel masInfo = new JLabel("15 чисел в диапазоне 500-700");
        masInfo.setBounds(0,0,300,30);
        mas_panel.add(masInfo);

        for (int i = 0; i <Class2.mas.length; i++) {
            m += Class2.mas[i] + "\n";
        }

        JTextArea masArea = new JTextArea(m);
        masArea.setBounds(0,30,300,370);
        masArea.setEditable(false);
        mas_panel.add(masArea);

        mas_GUI.setVisible(true);
    }

}
