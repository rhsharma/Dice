void setup()
{
	noLoop();
	background(0);
}
void draw()
{
	die.show();
	background(0);

}
void mousePressed()
{

	redraw();
}
class Die //models one single dice cube
{
	Die(int x, int y) //constructor
	{
		int myX = x;
		int myY = y;
		int rdmDice = (int)(Math.random*7)
		int numDice;

	}
	void roll()
	{
		if (rdmDice == 1)
		{
			numDice = 1;
		}
		else if ()
	}
	void show()
	{
		fill(255);
		rect(myX, myY, 50, 50);
		if (numDice == 1)
		{
			ellipse(myX+25, myY+25, 10, 10);
		}
		
	}
}
