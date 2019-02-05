
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square wall2;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        
        /* empieza muro1 */
        wall2 = new Square();
        wall2.moveVertical(60);
        wall2.changeColor("yellow");
        wall2.changeSize(130,100);
        wall2.makeVisible();
        /* termina muro */
        
        /*   empieza ventana fondo */
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(10);
        window.changeSize(10, 30);
        window.moveVertical(20);
        window.makeVisible();
        /* termina ventana */

        /*  empieza tech0 */
        roof = new Triangle();
        roof.changeSize(50, 160);
        roof.moveHorizontal(70);
        roof.moveVertical(50);
        roof.makeVisible();
        /* termina techo */
        
        /*  empieza arbol */
        roof = new Triangle();
        roof.changeSize(50, 120);
        roof.moveHorizontal(190);
        roof.moveVertical(150);
        roof.makeVisible();
        
        /*  empieza arbolbase */
        roof = new Triangle();
        roof.changeSize(50, 120);
        roof.moveHorizontal(190);
        roof.moveVertical(180);
        roof.makeVisible();
        
        /* empieza sol */

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        /* empieza sombra*/
        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(-30);
        sun.changeSize(60);
        sun.makeVisible();
        /* termina sombra */
        
        /* empieza ventana */
        window = new Square();
        window.moveVertical(80);
        window.moveHorizontal(30);
        window.changeColor("blue");
        window.changeSize(20,20);
        window.makeVisible();
        /* termina ventana */
        
        /* empieza ventana2 */
        window = new Square();
        window.moveVertical(80);
        window.moveHorizontal(70);
        window.changeColor("blue");
        window.changeSize(20,20);
        window.makeVisible();
        /* termina ventana2 */
        
        /* empieza puetrta */
        window = new Square();
        window.moveVertical(120);
        window.moveHorizontal(45);
        window.changeColor("red");
        window.changeSize(20,30);
        window.makeVisible();
        /* termina puerta */
        
        
        /* termina sol */
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
