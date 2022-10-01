/* Simple game to guess the letter generated by programme.
This uses the IF statement.
 */

class Guess {
    public static void main (String[] args)
        throws java.io.IOException {    // handle input errors

        char ch, answer = 'K';

        System.out.println("I am thining of a letter between A and Z.");
        System.out.print("Can you guess which one?\t");

        ch = (char) System.in.read();   // Read a char entered by the user.

        if (ch == answer) System.out.print("Correct! Well played.");
        else {
            System.out.print("...Nope, you are too ");
            if (ch < answer) System.out.print("low.");
            else System.out.print("high.");
        }

    }
}