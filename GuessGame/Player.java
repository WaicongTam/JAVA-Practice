public class Player {
    int number = 0;//Start guessing. Declare a variable to save the try.
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("My guess is " + number);
    }
}