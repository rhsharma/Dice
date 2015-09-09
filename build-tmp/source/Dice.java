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

Die one;

public void setup()
{
	size(300, 300);
	noLoop();
	background(0);
}
public void draw()
{
	background(255);
	one = new Die(25, 25);
	one.roll();
	one.show();
}


public void mousePressed()
{
	redraw();
}


class Die //models one single dice cube
{
	int myX, myY, numDice;
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;
		numDice = ((int)(Math.random()*6)+1);
	}


	public void roll()
	{
		numDice = ((int)(Math.random()*6)+1);
	}


	public void show()
	{
		fill(0);
		rect(myX, myY, 50, 50, 7);
		fill(255);
		if (numDice == 1)
		{
			ellipse(myX+25, myY+25, 10, 10);
		}
		else if (numDice == 2)
		{
			ellipse(myX+12, myY+12, 10, 10);
			ellipse(myX+38, myY+38, 10, 10);
		}
		else if (numDice == 3)
		{
			ellipse(myX+12, myY+12, 10, 10);
			ellipse(myX+38, myY+38, 10, 10);
			ellipse(myX+25, myY+25, 10, 10);
		}
		else if (numDice == 4)
		{
			ellipse(myX+12, myY+12, 10, 10);
			ellipse(myX+12, myY+38, 10, 10);
			ellipse(myX+38, myY+38, 10, 10);
			ellipse(myX+38, myY+12, 10, 10);
		}
		else if (numDice == 5)
		{
			ellipse(myX+12, myY+12, 10, 10);
			ellipse(myX+12, myY+38, 10, 10);
			ellipse(myX+38, myY+38, 10, 10);
			ellipse(myX+38, myY+12, 10, 10);
			ellipse(myX+25, myY+25, 10, 10);         //Middle
		}
		else
		{
			ellipse(myX+12, myY+12, 10, 10);
			ellipse(myX+12, myY+38, 10, 10);
			ellipse(myX+38, myY+38, 10, 10);
			ellipse(myX+38, myY+12, 10, 10);
			ellipse(myX+25, myY+12, 10, 10); 
			ellipse(myX+25, myY+38, 10, 10); 
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
