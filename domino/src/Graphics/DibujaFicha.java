package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DibujaFicha extends JPanel {
    
    private int valorIzquierda;
    private int valorDerecha;
    int recX;
    int recY;

    
    public DibujaFicha(int leftValue, int rightValue) {
        valorIzquierda = leftValue;
        valorDerecha = rightValue;
        recX = 0;
        recY = 0;
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        int width = 240;
        int height = 125;
        
        // Rectangulo negro
        g.setColor(Color.BLACK);
        g.fillRect(recX, recY, width, height);

        // Cuadrados blancos
        g.setColor(Color.WHITE);
        int squareSize = height - 20;
        g.fillRect(recX + 10, recY + 10, squareSize, squareSize);
        g.fillRect(recX+20+squareSize, recY+10, squareSize, squareSize);
        
        // Puntos negros
        g.setColor(Color.BLACK);
        dibujaCirculos(g, valorIzquierda, valorDerecha);
        
    }
    
    private void dibujaCirculos(Graphics g, int izq, int der) {
        
        switch(izq){
            case 0:
                break;
            case 1:
                g.fillOval(recX+54, recY+54, 15, 15);
                break;
            case 2:
                g.fillOval(recX+85, recY+20, 15, 15);
                g.fillOval(recX+20, recY+85, 15, 15);
                break;
             case 3:
                g.fillOval(recX+85, recY+20, 15, 15);
                g.fillOval(recX+20, recY+85, 15, 15);
                g.fillOval(recX+54, recY+54, 15, 15);
                break;
            case 4:
                g.fillOval(recX+85, recY+20, 15, 15);
                g.fillOval(recX+20, recY+85, 15, 15);
                g.fillOval(recX+20, recY+20, 15, 15);
                g.fillOval(recX+85, recY+85, 15, 15);
                break;
            case 5:
                g.fillOval(recX+85, recY+20, 15, 15);
                g.fillOval(recX+20, recY+85, 15, 15);
                g.fillOval(recX+20, recY+20, 15, 15);
                g.fillOval(recX+85, recY+85, 15, 15);
                g.fillOval(recX+54, recY+54, 15, 15);
                break;
            case 6:
                g.fillOval(recX+85, recY+20, 15, 15);
                g.fillOval(recX+20, recY+85, 15, 15);
                g.fillOval(recX+20, recY+20, 15, 15);
                g.fillOval(recX+85, recY+85, 15, 15);
                g.fillOval(recX+54, recY+85, 15, 15);
                g.fillOval(recX+54, recY+20, 15, 15);
                break;
                
        }
        switch(der){
            case 0:
                break;
            case 1:
                g.fillOval(recX+169, recY+54, 15, 15);
                break;
            case 2:
                g.fillOval(recX+200, recY+20, 15, 15);
                g.fillOval(recX+135, recY+85, 15, 15);
                break;
             case 3:
                g.fillOval(recX+200, recY+20, 15, 15);
                g.fillOval(recX+135, recY+85, 15, 15);
                g.fillOval(recX+169, recY+54, 15, 15);
                break;
            case 4:
                g.fillOval(recX+200, recY+20, 15, 15);
                g.fillOval(recX+135, recY+85, 15, 15);
                g.fillOval(recX+135, recY+20, 15, 15);
                g.fillOval(recX+200, recY+85, 15, 15);
                break;
            case 5:
                g.fillOval(recX+200, recY+20, 15, 15);
                g.fillOval(recX+135, recY+85, 15, 15);
                g.fillOval(recX+135, recY+20, 15, 15);
                g.fillOval(recX+200, recY+85, 15, 15);
                g.fillOval(recX+169, recY+54, 15, 15);
                break;
            case 6:
                g.fillOval(recX+200, recY+20, 15, 15);
                g.fillOval(recX+135, recY+85, 15, 15);
                g.fillOval(recX+135, recY+20, 15, 15);
                g.fillOval(recX+200, recY+85, 15, 15);
                g.fillOval(recX+169, recY+85, 15, 15);
                g.fillOval(recX+169, recY+20, 15, 15);
                break;
        }
        
    }
    /*
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ficha");
        Ficha ficha = new Ficha(5,6);
        
        frame.setLayout(null);

        ficha.setBounds(100, 10, 240, 125);
        
        frame.add(ficha);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
*/
}