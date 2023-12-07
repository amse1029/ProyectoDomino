package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
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
    
    public String getFicha(String ficha){
        String ubicacionFicha="src/Graphics/Fichas/Escalada/ficha"+ficha+".png";
        return ubicacionFicha;
    }
    
    public int getValorIzquierda(){
        return valorIzquierda;
    }
    
    public int getValorDerecha(){
        return valorDerecha;
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if(valorIzquierda != valorDerecha){
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
        else {
            int width = 125;
            int height = 240;
    
            // Rectangulo negro
            g.setColor(Color.BLACK);
            g.fillRect(recX, recY, width, height);

            // Cuadrados blancos
            g.setColor(Color.WHITE);
            int squareSize = width - 20;
            g.fillRect(recX + 10, recY + 10, squareSize, squareSize);
            g.fillRect(recX+10, recY+20+squareSize, squareSize, squareSize);
    
            // Puntos negros
            g.setColor(Color.BLACK);
            dibujaCirculos(g, valorIzquierda, valorDerecha);
        }
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
        if(valorIzquierda != valorDerecha){
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
        else{
            switch(der){
                case 0:
                break;
            case 1:
                g.fillOval(recX+54, recY+169, 15, 15);
                break;
            case 2:
                g.fillOval(recX+85, recY+135, 15, 15);
                g.fillOval(recX+20, recY+200, 15, 15);
                break;
             case 3:
                g.fillOval(recX+85, recY+135, 15, 15);
                g.fillOval(recX+20, recY+200, 15, 15);
                g.fillOval(recX+54, recY+169, 15, 15);
                break;
            case 4:
                g.fillOval(recX+85, recY+135, 15, 15);
                g.fillOval(recX+20, recY+200, 15, 15);
                g.fillOval(recX+20, recY+135, 15, 15);
                g.fillOval(recX+85, recY+200, 15, 15);
                break;
            case 5:
                g.fillOval(recX+85, recY+135, 15, 15);
                g.fillOval(recX+20, recY+200, 15, 15);
                g.fillOval(recX+20, recY+135, 15, 15);
                g.fillOval(recX+85, recY+200, 15, 15);
                g.fillOval(recX+54, recY+169, 15, 15);
                break;
            case 6:
                g.fillOval(recX+85, recY+135, 15, 15);
                g.fillOval(recX+20, recY+200, 15, 15);
                g.fillOval(recX+20, recY+135, 15, 15);
                g.fillOval(recX+85, recY+200, 15, 15);
                g.fillOval(recX+54, recY+200, 15, 15);
                g.fillOval(recX+54, recY+135, 15, 15);
                break;
            }
        }     
    }
    
    public void guardaImagen(String ruta){
        
        BufferedImage imagen = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = imagen.createGraphics();
        this.paint(g2d);
        try {
            ImageIO.write(imagen, "png", new File(ruta));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static BufferedImage escalarImagen(BufferedImage imagenOriginal, int ancho, int alto) {
        BufferedImage imagenEscalada = new BufferedImage(ancho, alto, imagenOriginal.getType());
        Graphics2D g = imagenEscalada.createGraphics();
        
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(imagenOriginal, 0, 0, ancho, alto, 0, 0, imagenOriginal.getWidth(), imagenOriginal.getHeight(), null);
        g.dispose();
        
        return imagenEscalada;
    }
    
   /* 
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Ficha");
        DibujaFicha ficha = new DibujaFicha(5,6);
        
        int izquierda = ficha.getValorIzquierda();
        int derecha = ficha.getValorDerecha();
        // Set the layout manager of the JFrame to null for precise control
        frame.setLayout(null);

        // Set the bounds (x, y, width, height) of the Ficha object
        if(izquierda != derecha){
            ficha.setBounds(0, 0, 240, 125);
        }
        else{
          ficha.setBounds(0, 0, 125, 240);  
        }
        
        frame.add(ficha);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Especificar la ruta del archivo
        String ruta = "src/Graphics/Fichas/Normal/ficha" + izquierda + derecha + ".png";
        
        // Guardar la ficha como una imagen
        ficha.guardaImagen(ruta);
        
        // Leer la imagen guardada
        BufferedImage imagenOriginal = null;
        try {
            imagenOriginal = ImageIO.read(new File(ruta));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Escalar la imagen
        if (imagenOriginal != null) {
            BufferedImage imagenEscalada = DibujaFicha.escalarImagen(imagenOriginal, 48, 25);

            // Guardar la imagen escalada
            try {
                ImageIO.write(imagenEscalada, "png", new File("src/Graphics/Fichas/Escalada/ficha"+izquierda+derecha+".png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    */
}
