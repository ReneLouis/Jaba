// Show square root of 1 to 99 and the rounding error.

class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        System.out.println("x+\t+sqrt(x)+\t+Rounding error");

        for (num = 1 ; num<100 ; num++) {
            sroot = Math.sqrt(num);
            rerr = num - (sroot * sroot);   // Rounding error
            System.out.println(num + "\t" + sroot + "\t" + rerr);
        }
    }
}