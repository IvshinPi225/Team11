package Lb5;

import javax.swing.*;
import javax.swing.text.PlainDocument;

public class Calculator {
    JTextField tf1, tf2, tf3;
    public Calculator(JPanel a) {
        JLabel firstPrmtr = new JLabel("a=");
        firstPrmtr.setBounds(20, 30, 30, 30);
        a.add(firstPrmtr);

        JLabel secondPrmtr = new JLabel("b=");
        secondPrmtr.setBounds(20, 70, 30, 30);
        a.add(secondPrmtr);

        JLabel thirdPrmtr = new JLabel("h=");
        thirdPrmtr.setBounds(20, 110, 30, 30);
        a.add(thirdPrmtr);

        tf1 = new JTextField("0");
        tf2 = new JTextField("0");
        tf3 = new JTextField("0");

        PlainDocument doc1 = (PlainDocument) tf1.getDocument();
        doc1.setDocumentFilter(new DigitFilter());

        PlainDocument doc2 = (PlainDocument) tf2.getDocument();
        doc2.setDocumentFilter(new DigitFilter());

        PlainDocument doc3 = (PlainDocument) tf3.getDocument();
        doc3.setDocumentFilter(new DigitFilter());



        tf1.setBounds(50,30,60,30);
        tf2.setBounds(50,70,60,30);
        tf3.setBounds(50,110,60,30);

        a.add(tf1);
        a.add(tf2);
        a.add(tf3);

        JLabel s = new JLabel("");
        s.setBounds(120,110,300,30);
        a.add(s);
        
        JButton calculat = new JButton("Вычислить");
        calculat.setBounds(120, 70, 100, 30);
        ListenerButtonCalculator calculatorListener = new ListenerButtonCalculator(tf1,tf2,tf3,s);
        calculat.addActionListener(calculatorListener);
        a.add(calculat);

    }
}