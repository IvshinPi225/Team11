package Lb5;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class Image extends JComponent {

    private BufferedImage image;

    public Image() {

        // получаем изображение и проверяем на доступность
        try
        {
        	image = ImageIO.read(getClass().getResource("/Логотип УГАТУ.jpg"));

        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Отображение рисунка в левом верхнем углу.
            g.drawImage(image, 0, 0,100 ,50, null);
        }
    }
}