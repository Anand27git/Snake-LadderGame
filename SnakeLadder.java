public class SnakeLadder {

	public static final int NO_PLAY = 0 ;
	public static final int LADDER = 1 ;
	public static final int SNAKE = 2 ;

	public static void main(String[] args) {
	System.out.println("Welcome to the SnakeLadder Game");
	
	int player1_position=0;
	int player2_position=0;
	int newPosition=0;
	int winPosition=100;
	int count1=0;
	int count2=0;
	int currentPlayer=1;
	int checkOption;
	while (true) {
		if(currentPlayer==1) {
		System.out.println("now player-1's turn");
		count1++;
	int diceroll = (int) (Math.random()*6)+1;
	checkOption =(int) (Math.random()*3);
	System.out.println(" Dice is : "+ diceroll);

	switch(checkOption) {
	case NO_PLAY :
		newPosition = 0;
		break;
	case LADDER :
		newPosition = diceroll;
		break;
	case SNAKE :
		newPosition = -diceroll;
		break;
	}
	player1_position=player1_position+newPosition;
	if (player1_position<0) {
		player1_position = 0;
		 }
	if (player1_position>100){
	player1_position=newPosition;
	}
	System.out.println("now Player-1 at"+player1_position+"th"+player1_position);
	if(player1_position==100){
		break;
	}
	}
	else {
		count2++;
		System.out.println("now player-2's turn");
		int diceroll =(int) (Math.random()*6)+1;
		checkOption =(int) (Math.random()*3);

	switch(checkOption) {

	        case NO_PLAY :
                newPosition = 0;
                	break;
        	case LADDER :
                newPosition = diceroll;
                	break;
        	case SNAKE :
                newPosition = -diceroll;
                	break;
        }
        player2_position=player2_position+newPosition;
        if (player2_position<0) {
                player2_position = 0;
                 }
        if (player2_position>100){
        player2_position=newPosition;
        }
        System.out.println("now Player-2 at"+player2_position+"th"+player2_position);
	if(player2_position==100){
		break; 
	}
}

	if(checkOption==1) {
	System.out.println("ohh, You got ladder. Now play Again");
	}
	else {
		if(currentPlayer==1) {
		currentPlayer = 2;
		}
		else {
		currentPlayer = 1;
		}
	}
}
	if(player1_position==100) {
	System.out.println("\n Congratulation Player-1 you are win! \n after dice rolled " + count1+"times.");
	} else {
	System.out.println("\n Congratulation player-2 you are win! \n after dice rolled" +count2+" times." );
	}
    }
}
