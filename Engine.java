/**
 * Contains the game mechanics.
 *
 * Contains the game mechanics.
 */
public class Engine {

    /**
     * Contains the fruits as integer values.
     *
     * Contains the fruits as integer values.
     */
    private int[] fruits = {1, 2, 3};

    /**
     * Acts as a check to the loop.
     *
     * Acts as a check to the loop.
     */
    private boolean gameIsOn = true;

    /**
     * Constructs an "engine" and calls the loop-method.
     *
     * Constructs an "engine" and calls the loop-method.
     */
    public Engine() {
        loop();
    }

    /**
     * Generates a random number between 0 and 2.
     *
     * Generates a random number between 0 and 2 representing a fruit.
     *
     * @return Random integer from 0 to 2. Represents a fruit.
     */
    public int randomize() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);

        return randomInt;
    }

    /**
     * Checks player's input.
     *
     * Checks player's input. Enter (or anything else than 'q') continues
     * the game. 'q' ends the game.
     */
    public void playerInput() {
        String input = (new java.util.Scanner(System.in)).nextLine();

        if (input == "q") {
            gameIsOn = false;
        }
     }

    /**
     * Checks if the victory condition is true.
     *
     * Checks if the victory condition is true.
     * All three slots must've the same value to win.
     *
     * @param rolls Array containing the slots' values.
     * @return A boolean. True if victory.
     */
    public boolean win(int[] rolls) {
        boolean value = false;

        for (int i = 0; i < rolls.length - 1; i++) {

            if (rolls[i] != rolls[i + 1]) {
                value = false; // ei tarvita koska alustettu metodin alussa
            // System.out.println("Not the same!" +
            // rolls[i] + "" + rolls[i+1] + value);
                return value; // break; rikkois silmukan ilman
                              //  ylimääräistä returniar
            } else {
                value = true;
//          System.out.println("Is the same"  + rolls[i] + "" +
                                rolls[i+1] + value);
            }
        }

        return value;
    }

    /**
     * Contains the greeting message and how to play the game.
     *
     * Contains the greeting message and how to play the game.
     */
    public void intro() {
        Graphics.draw(fruits[0], fruits[1], fruits[2]);

        System.out.println("Hello player!");
        System.out.println("How to play: press Enter!");
        System.out.println("To exit: input q");
        playerInput();
    }

    /**
     * Contains the game loop.
     *
     * Contains the game loop. Game continues until player wins or
     * ends the game by entering 'q'.
     */
    public void loop() {
        gameIsOn = true;

        // beginning messages, drawing the board the first time
        // and start the first round
        intro();

        while (gameIsOn) {

            // randomizes the fruits
            for (int i = 0; i < fruits.length; i++) {
                fruits[i] = randomize();
            }

            // draws the "machine"
            Graphics.draw(fruits[0], fruits[1], fruits[2]);

            // win check
            gameIsOn = !win(fruits);

            // status messages
            if (gameIsOn) {
                System.out.println("Bad luck! Try again!");
                // player's input
                playerInput();
            } else {
                System.out.println("DING DING DING");
                System.out.println("You win!");
            }
        }
    }
}
