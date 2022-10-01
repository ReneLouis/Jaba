// Program that reads a character from the keyboard.

class KbIn {
    public static void main(String[] args) 
        throws java.io.IOException { // Necessary to handle input erros.
        char ch;
        
        System.out.print("Press a key followed by ENTER:\t");
        ch = (char) System.in.read(); // read the character entered.
        System.out.println("Your key is:\t" + ch);
    }
}