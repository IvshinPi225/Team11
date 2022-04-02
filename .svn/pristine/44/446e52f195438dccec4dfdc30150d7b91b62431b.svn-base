package Lb5;

import javax.swing.*;

public class MenuBar {
	
	public  MenuBar(JPanel a,JFrame b,Image c){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");

        JMenuItem logMenu = new JMenuItem("Отобразить логотип УГАТУ");
        fileMenu.add(logMenu);
        ListenerButtonLogo actionLogo = new ListenerButtonLogo(a,c);
        logMenu.addActionListener(actionLogo);
        
        JMenuItem loadMenu = new JMenuItem("Загрузить файл в проект11");
        fileMenu.add(loadMenu);
        
        fileMenu.addSeparator();

        JMenuItem exitMenu = new JMenuItem("Выход");
        fileMenu.add(exitMenu);

        ListenerButton actionListener2 = new ListenerButton();
        exitMenu.addActionListener(actionListener2);



        menuBar.add(fileMenu);
        b.setJMenuBar(menuBar);
    }
}
