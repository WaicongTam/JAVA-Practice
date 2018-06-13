import java.util.*;

public class DotGame {
    Scanner bullet = new Scanner(System.in);
    int NOH = 0;

    public int[] setCells () {
        int startloc = (int) (Math.random() * 10);
        int[] Cells = {startloc, startloc + 1, startloc + 2};
        return Cells; 
    }

    public String check (int guess, int[] answer) {
        String result = "Miss";
        for (int cell : answer) {
            if (cell == guess) {
                NOH++;
                result = "Hit";
                break;
            }
        }
        if (NOH == 3) {
            result = "Kill";
        }
        System.out.println(result);
        return result;
    }

    public int getGuess () {
        System.out.print("Please choose your target: ");
        int x = 0;
        x = bullet.nextInt();
        return x;
    }
    
    public void startgame () {
        int NOG = 0;
        boolean isAlive = true;
        String target = "0";
        int[] ship = setCells();
        int guess = 0;
        while (isAlive == true) {
            guess = getGuess();
            target = check(guess, ship);
            NOG++;
            if (target.equals("Kill")) {
                    isAlive = false;
                    bullet.close();
                    System.out.println("You made " + NOG + " guesses.");
                }
        }
    }
}