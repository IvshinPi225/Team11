package Lb5;

import javax.swing.*;
import java.awt.*;

public class MenuBox extends JComboBox {

public MenuBox(JPanel a,Image b){

String[] items = {
"Переместить логотип УГАТУ в верхний правый угол",
"Переместить логотип УГАТУ в середину",
"Переместить логотип УГАТУ в левый верхний угол",
"Отсортировать данные в проекте11",
};

JComboBox comboBox= new JComboBox(items);
ListenerButtonComboBox logListener = new ListenerButtonComboBox(comboBox,a,b);
comboBox.addActionListener(logListener);


a.add(comboBox);

comboBox.setBounds(0,160,250,40);
Font font = new Font("Verdana", Font.PLAIN, 9);
comboBox.setFont(font);

}
}