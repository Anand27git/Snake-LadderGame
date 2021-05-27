public class SnakeLadder {

	public static final int NO_PLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;

	public static void main(String[] args) {
	System.out.println("Welcome to the SnakeLadder Game");


	int position=0;
	int newPosition=0;
	int winPosition=100;

	while (position<=winPosition) {
	int diceroll = (int) (Math.random()*6)+1;
	int checkOption =(int) (Math.random()*3);
	System.out.println(" Dice is : "+ diceroll);

	switch(checkOption)
	{
	case NO_PLAY :
		newPosition = 0;
		break;
	case LADDER :
		newPosition =diceroll;
		break;
	case SNAKE :
		newPosition = -diceroll;
		break;
	}
	position=position+newPosition;
	if (position<0) {
		position = 0;
		 }
	if (position>100){
	position=newPosition;
	}
	System.out.println("Your are now at "+position+"th"+position);
	}
     }
}
