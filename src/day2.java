import java.util.ArrayList;

public class day2 {
    ArrayList<String> moves;
    public day2(ArrayList<String> moves) {
        this.moves = moves;
    }

    //A=Enemy rock B=enemy paper C= enemy scissor
    //X=Ally rock Y=ally papper Z=ally scissor
    //X=loose Y=draw Z=win
    public int calculateScore() {
        int points=0;

        for (String move : moves) {
            switch (move.charAt(2)) {
                case 'X' -> points++;
                case 'Y' -> points += 2;
                case 'Z' -> points += 3;
            }
            switch (move.charAt(0)) {
                case 'A' -> {
                    if (move.charAt(2) == 'X')
                        points += 3;
                    if (move.charAt(2) == 'Y')
                        points += 6;
                }
                case 'B' -> {
                    if (move.charAt(2) == 'Z')
                        points += 6;
                    if (move.charAt(2) == 'Y')
                        points += 3;
                }
                case 'C' -> {
                    if (move.charAt(2) == 'Z')
                        points += 3;
                    if (move.charAt(2) == 'X')
                        points += 6;
                }
            }
        }
        return points;
    }

}
