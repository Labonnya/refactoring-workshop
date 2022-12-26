package workshop;

import java.util.ArrayList;
import java.util.LinkedList;


public class TriviaGame {
    ArrayList<Player> players = new ArrayList();

    Questions ques = new Questions();

    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;


    public boolean add(String playerName) {


        players.add(new Player(playerName));

        System.out.println(playerName + " was added");
        System.out.println("They are player number " + players.size());
        return true;
    }

    public Player getCurrentPlayer(int currentPlayer)
    {
        return players.get(currentPlayer);
    }

    public void roll(int roll) {

        System.out.println(getCurrentPlayer(currentPlayer).getName() + " is the current player");
        System.out.println("They have rolled a " + roll);

        if (getCurrentPlayer(currentPlayer).inPenalty()) {

            isGettingOutOfPenaltyBox = getCurrentPlayer(currentPlayer).gettingOutOfPenaltyBox(roll);

        } else {

            getCurrentPlayer(currentPlayer).setPlaces(roll);
            getCurrentPlayer(currentPlayer).newPositionCategory();
            Questions();
        }

    }
 
  
    wasCorrectlyAnswered() ; 
    wrongAnswer();

   
