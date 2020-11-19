public class NestingLoops {
    /*
    1- Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.
    2- Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?
    3- Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().)
    4- Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?
    */

    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        /*
        1- Look at the first set of nested loops ("CN"). Which variable changes faster? Is it the variable controlled by the outer loop (c) or the variable controlled by the inner loop (n)? Answer in a comment.
        1- Answer:
                Variable "n" changes faster. This variable is controlled by the inner loop.
        */
        for (char c = 'A'; c <= 'E'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println("\n");
        /*
        2- Change the order of the loops so that the "c" loop is on the inside and the "n" loop is on the outside. How does the output change?
        2- Answer:
                The same amount of values are obtained but the order now would be different. Now it will go through the sequence of letters A, B, C, D and E, 3 times.
        */
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        /*
        3- Look at the second set of nested loops ("AB"). Change the print() statement to println(). How does the output change? (Then change it back to print().).
        3- Answer:
                The println () statement added a new line, then each a-b pair will be on a new line.
        */
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            /*
            4- Add a System.out.println() statement after the close brace of the inner loop (the "b" loop), but still inside the outer loop. How does the output change?
            4- Answer:
                    Now it is going to print a(i)-b(0)  a(i)-b(1) ... a(i)-b(i-1) by every line.
                    a(0)-b(0)  a(0)-b(1) ... a(0)-b(i)
                    a(1)-b(0)  a(1)-b(1) ... a(1)-b(i)
                    ...
                    a(i)-b(0)  a(i)-b(1) ... a(i)-b(i)
            */
            System.out.println();
        }
        System.out.println("\n");
    }
}
