Die one;

void setup()
{
	size(300, 300);
	noLoop();
	background(0);
}
void draw()
{
	background(255);
	for (int j = 30; j <250; j+=60)
	{
		for (int i = 30; i <250; i+=60)
		{
		one = new Die(i, j);
		one.roll();
		one.show();
		}
	}
}


void mousePressed()
{
	redraw();
}


class Die //models one single dice cube
{
	int myX, myY, numDice;
	Die(int i, int j) //constructor
	{
		myX = i;
		myY = j;
		//numDice = ((int)(Math.random()*6)+1);
	}


	void roll()
	{
		numDice = ((int)(Math.random()*6)+1);
	}


	void show()
	{
		fill(0, 75, (int)(Math.random()*255));
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
			ellipse(myX+25, myY+25, 10, 10);        //Middle
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
//michaela rocks