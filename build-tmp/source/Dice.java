import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	noLoop();
	background(0);
}
public void draw()
{
	die.show();
	background(0);

}
public void mousePressed()
{

	redraw();
}
class Die //models one single dice cube
{
	Die(int x, int y) //constructor
	{
		int myX = x;
		int myY = y;
		int numDice = 1; //(int)(Math.random*7)

	}
	public void roll()
	{

	}
	public void show()
	{
		fill(255);
		rect(myX, myY, 50, 50);
		if (numDice == 1)
		{
			ellipse(myX+25, myY+25, 10, 10);
		}
		
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
