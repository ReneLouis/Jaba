// Truth table for the logical operators.

class LogicalOpTable {
    public static void main (String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = q = true;
        System.out.print(p + "\t" + q + "\t" + (p&q) + "\t");
        System.out.println((p|q) + "\t" + (p^q) + "\t" + !p);

        q = false;
        System.out.print(p + "\t" + q + "\t" + (p&q) + "\t");
        System.out.println((p|q) + "\t" + (p^q) + "\t" + !p);

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t" + (p&q) + "\t");
        System.out.println((p|q) + "\t" + (p^q) + "\t" + !p);

        q = false;
        System.out.print(p + "\t" + q + "\t" + (p&q) + "\t");
        System.out.println((p|q) + "\t" + (p^q) + "\t" + !p + "\n");
    }
}