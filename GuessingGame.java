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

	boolean pl1isright = false ;
	boolean pl2isright = false ;
	boolean pl3isright = false ;

	int targetNumber = (int) (math.random()*10) ; 
	System.out.println("I'm thinking of a number between 0 and (...");

	while(true) {
	    system.out.println("Number to guess is" + targetnumber);
	    p1guess();
	    p2guess();
	    p3guess();

	    guessp1 = p1.number();
	    System.out.println ("player 1 guessed " + Guessup1);
	    guessp2 = p2.number();
            System.out.println ("player 2 guessed " + Guessup2);
            guessp3 = p3.number();
   	    System.out.println ("player 3 guessed " + Guessup3);
            if (guessp1 == targetNumber) {
		p1isright = true ;
	    }
	    if (guessp2 == targetNumber) {
		p2isright = true ;
	    }
            if (guessp3 == targetNumber) {
		p3isright = true ;
	    }
	    if (p1isright || p2isright || p3isright) {
		System.out.println("We have a winner");
		System.out.println("Player one got it right?" + p1isright);
                System.out.println("Player two got it right?" + p2isright);
                System.out.println("Player three got it right?" + p3isright);
		System.out.println("The Game is over");
		break;
	    } else {
		System.out.println("Players will have to try again");
	    }
	}
    }
}




