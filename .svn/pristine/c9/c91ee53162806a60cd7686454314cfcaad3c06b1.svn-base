package Lb5; //пакет Java классов

import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {
	
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,300);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,0,160,30);
	main_panel.add(laba_info);
	
	JLabel laba_info2 = new JLabel("Прикладная информатика"); // Отображение текста или изображения
	laba_info2.setBounds(120,30,160,30);
	main_panel.add(laba_info2);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("Информация");
	button_info.setBounds(20,200,120,40);
	main_panel.add(button_info);
	InfoButtonListener Bi = new InfoButtonListener();
	button_info.addActionListener(Bi);
	
	Image log = new Image();

	new MenuBar(main_panel,main_GUI,log);
	new MenuBox(main_panel,log);
	
    new Calculator(main_panel);
    
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	
	
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
