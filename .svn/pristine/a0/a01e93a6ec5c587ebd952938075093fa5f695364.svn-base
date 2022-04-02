package Lb5;

import javax.swing.*;

import java.awt.event.*;

//класс реализующий слушатель (ожидани€ нажати€ кнопки)
public class ListenerButtonLogo implements ActionListener{
 //верхний левый угол
    private Image log2;
   static int COUNT = 0;
  private final JPanel panel;
  public ListenerButtonLogo(JPanel a,Image b){
      panel = a;

      log2 = b;
  }
 // ключевое слово, которое позвол€ет в дочернем классе заново создать реализацию метода родительского класса
 public void actionPerformed(ActionEvent arg0) {
     

     if (COUNT==0) {
         COUNT++;
         log2.setSize(100, 50);
         log2.setLocation(283, 0);
         panel.add(log2);
         panel.repaint();
         log2.setVisible(true);
     }
 }

}