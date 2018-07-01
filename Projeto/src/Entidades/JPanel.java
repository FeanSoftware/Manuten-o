package Entidades;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Julio Cesar
 */
public class JPanel extends javax.swing.JPanel {
    private static Image load(String url) {
        try {
            final Toolkit tk = Toolkit.getDefaultToolkit();
            final URL path = new URL("file:///" + url); // Any URL would work here
            final Image img = tk.createImage(path);
            tk.prepareImage(img, 0, 0, null);
            return img;
        } catch (MalformedURLException e) {
            return null;
        }
    }

    private Image img = load(Internacionalização.getImagenFundo());
    private int x = 0;
    private int y = 0;

    //   private Graphics g = getGraphics();
    public JPanel(String fundo) {

        try {
            this.img = load(fundo);
        } catch (Exception e) {

        }

        // paintComponents();
    }

    public JPanel() {

    }


    @Override
    public void paintComponent(Graphics g) {

        super.paintComponents(g);
        Graphics gr = (Graphics2D) g.create();
        gr.drawImage(img, x, y, this.getWidth(), this.getHeight(), this);
        gr.dispose();
    }

    public void alterarImagem(String fundo) {
        this.img = load(fundo);
        // this.img = novaimagem;
        this.revalidate(); // não lembro se repaint() serve aqui
    }

}
