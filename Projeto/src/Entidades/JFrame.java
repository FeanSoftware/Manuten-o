package Entidades;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JFrame extends javax.swing.JFrame {

    private BufferedImage img = null;
    private int x = 0;
    private int y = 0;

    public JFrame() {
        //centralizarComponente();
    }

    public JFrame(String urlImg) throws IOException {
        this.img = ImageIO.read(new File(urlImg));

    }

    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    @Override
    public void paintComponents(Graphics g) {

        super.paintComponents(g);
        Graphics gr = (Graphics2D) g.create();
        gr.drawImage(img, x, y, this.getWidth(), this.getHeight(), this);
        gr.dispose();
    }
}
