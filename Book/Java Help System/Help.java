/* Help system that displays the sytax for Java control statements.

 */

class Help {
    public static void main (String[] args)
        throws java.io.IOException {

        // Display the program menu:
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");

        // Read user selection:

        char choice;
        choice = (char) System.in.read();

        switch(choice) {
            case '1':
                System.out.println("The if\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;\n");
                break;
            case '2':
                System.out.println("The traditional switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("}\n");
                break;
            default:
                System.out.print("Selection " + choice + " not found.");
        }
    }
}