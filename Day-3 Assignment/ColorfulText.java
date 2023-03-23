import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ColorfulText extends JPanel implements Runnable {
    private static final long serialVersionUID = 1L;
    private int x, y;
    private String message;
    private Color color;
    private Random random;

    public ColorfulText() {
        x = 50;
        y = 50;
        message = "Hello, world!";
        color = Color.BLACK;
        random = new Random();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.setColor(color);
        g.drawString(message, x, y);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colorful Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        ColorfulText colorfulText = new ColorfulText();
        frame.add(colorfulText);
        frame.setVisible(true);
        Thread thread = new Thread(colorfulText);
        thread.start();
    }
}
