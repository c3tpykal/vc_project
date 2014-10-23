/**
 * Contains the game mechanics.
 *
 * Contains the game mechanics.
 */
public class Engine {

    private int[] fruits = {1, 2, 3};
    private boolean gameIsOn = true;

    /**
     * Constructs an "engine" and calls the loop-method.
     *
     * Constructs an "engine" and calls the loop-method.
     **/
    public Engine() {
        loop();
    }

    public void loop() {

        while(gameIsOn) {

            gameIsOn = false;
        }
    }
}
