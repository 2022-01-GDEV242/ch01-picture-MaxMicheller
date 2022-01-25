/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @changes by Max Micheller G00267189
 * @version 2016.02.29
 */
public class Picture
{
    private Square clif;
    private Person bluePerson;
    private Triangle spike1;
    private Triangle spike2;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        clif = new Square();
        bluePerson = new Person();
        spike1 = new Triangle(); 
        spike2 = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            clif.moveHorizontal(-560);
            clif.moveVertical(70);
            clif.changeSize(500);
            clif.changeColor("green");
            clif.makeVisible();
            
            bluePerson.changeColor("blue");
            bluePerson.moveHorizontal(30);
            bluePerson.moveVertical(40);
            bluePerson.makeVisible();
    
            spike1.moveHorizontal(345);
            spike1.moveVertical(270);
            spike1.makeVisible();

            spike2.moveHorizontal(285);
            spike2.moveVertical(270);
            spike2.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(-264);
            sun.moveVertical(-124);
            sun.changeSize(100);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        clif.changeColor("black");
        bluePerson.changeColor("Black");
        spike1.changeColor("black");
        spike2.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        clif.changeColor("green");
        bluePerson.changeColor("blue");
        spike1.changeColor("red");
        spike2.changeColor("red");
        sun.changeColor("yellow");
    }
}
