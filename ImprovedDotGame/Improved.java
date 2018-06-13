import java.util.*;

public class Improved {
    Scanner bullet = new Scanner(System.in);
    ArrayList<Integer> LocCells = new ArrayList<Integer>();

    public void setCells () {
        int startloc = (int) (Math.random() * 7);
        for (int i = 0; i <= 2; i++) {
            LocCells.add((startloc + i));
        } 
    }

    public String check (int guess) {
        String result = "Miss";
        int index = LocCells.indexOf(guess);
        if (index >= 0) {
            LocCells.remove(index);
            if (LocCells.isEmpty()) {
                result = "Kill";
            } else {
                result = "Hit";
            }
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
        int guess = 0;
        setCells();
        while (isAlive == true) {
            guess = getGuess();
            target = check(guess);
            NOG++;
            if (target.equals("Kill")) {
                    isAlive = false;
                    bullet.close();
                    System.out.println("You made " + NOG + " guesses.");
                }
        }
    }
}