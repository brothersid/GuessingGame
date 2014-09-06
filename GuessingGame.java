public class GuessingGame {
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
	p1 = new Player () ;
	p2 = new Player () ;
	p3 = new Player () ;

	int Guessup1 = 0 ;
	int Guessup2 = 0 ;
	int Guessup3 = 0 ;

	boolean Pl1isright = false ;
	boolean Pl2isright = false ;
	boolean Pl3isright = false ;

	int targetNumber = (int) (Math.random()*10) ; 
	System.out.println("I'm thinking of a number between 0 and 9...");

	while(true) {
	    System.out.println("Number to guess is" + targetnumber);
	    p1guess();
	    p2guess();
	    p3guess();

	    p1guess = p1.number();
	    System.out.println ("Player 1 guessed " + Guessup1);
	    p2guess  = p2.number();
            System.out.println ("Player 2 guessed " + Guessup2);
            p3guess = p3.number();
   	    System.out.println ("Player 3 guessed " + Guessup3);
            if (p1guess == targetNumber) {
		p1isright = true ;
	    }
	    if (p2guessp == targetNumber) {
		p2isright = true ;
	    }
            if (p3guess == targetNumber) {
		p3isright = true ;
	    }
	    if (p1isright || p2isright || p3isright) {
		System.out.println("We have a winner");
		System.out.println("Player one got it right?" + P1isright);
                System.out.println("Player two got it right?" + P2isright);
                System.out.println("Player three got it right?" + P3isright);
		System.out.println("The Game is over");
		break;
	    } else {
		System.out.println("Players will have to try again");
	    }
	}
    }
}




