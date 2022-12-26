 package workshop;

import java.util.ArrayList;
import java.util.LinkedList;

public boolean wasCorrectlyAnswered() {
        if (getCurrentPlayer(currentPlayer).inPenaltyBox) {
            if (isGettingOutOfPenaltyBox) {
                getCurrentPlayer(currentPlayer).goldCoins();
                boolean winner = didPlayerWin();
                updatePlayer();

                return winner;

            } else {
                updatePlayer();
                return true;
            }

        } else {

            getCurrentPlayer(currentPlayer).goldCoins();

            boolean winner = didPlayerWin();
            currentPlayer++;
            if (currentPlayer == players.size()) currentPlayer = 0;

            return winner;
        }
    }

    public void updatePlayer(){
        currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
    }


    public boolean wrongAnswer() {
        System.out.println("Question was incorrectly answered");
        System.out.println(getCurrentPlayer(currentPlayer).getName() + " was sent to the penalty box");
        getCurrentPlayer(currentPlayer).inPenaltyBox = true;

        updatePlayer();
        return true;
    }

    private boolean didPlayerWin() {
        return !(getCurrentPlayer(currentPlayer).purses == 6);
    }

}
