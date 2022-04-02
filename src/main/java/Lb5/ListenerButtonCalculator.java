package Lb5;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenerButtonCalculator implements ActionListener {

    private Integer a1i,b1i,h1i;
    private JLabel c1;
    private JTextField a1,b1,h1;
    private double s;

    public ListenerButtonCalculator(JTextField a,JTextField b,JTextField h,JLabel c){

        a1 = a;
        b1 = b;
        h1 = h;
        c1 = c;

    }
     // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
    public void actionPerformed(ActionEvent arg0) {

        a1i = Integer.parseInt(a1.getText());
        b1i = Integer.parseInt(b1.getText());
        h1i = Integer.parseInt(h1.getText());

        if (a1i==0 ) {
            c1.setText("Основание трапеции не может быть 0");
        } else
            if (b1i==0) {
                c1.setText("Основание трапеции не может быть 0");
        } else
            if (h1i==0) {
                c1.setText("Высота трапеции не может быть 0");

        } else {
            s = (a1i * b1i * h1i) / 2;
            c1.setText("Площадь трапеции = " + s);
        }
    }
}