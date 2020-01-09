/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling, David J. Barnes, and Reagan Russell
 * @version 2020.01.08
 */
public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person fred;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        fred = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("blue");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            fred.changeColor("black");
            fred.changeSize(60, 30);
            fred.moveHorizontal(210);
            fred.moveVertical(25);
            drawn = true;
        }
    }

    // Changes picture to a black-and-white display.
    public void setBlackAndWhite() {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    // A beautiful sunset, complete with a person walking to the house.
    public void sunset() {
        sun.slowMoveVertical(300);
        fred.makeVisible();
        fred.slowMoveHorizontal(-180);
    }
    
    // Changes the picture to a color display.
    public void setColor() {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("blue");
    }
}
