// STAR PATTERN
//    *
//   **
//  ***
// ****
// in this pattern we see that in row 1, there are three spaces first and then a star is printed.
// similarly, for row 2 we have two spaces and then two stars, and in row 3 we have 1 space and three stars printed, and finally in row 4, four stars are printed and no spaces
// so to tackle this problem, first we need to write a for loop to print the spaces, and then one more for loop to print the stars.

public class StarPattern3 {
    public static void main(String[] args){

        printPattern(4);
    }

    private static void printPattern(int x){

        for(int i = 1; i <= x ; i++){               //   this for loop is used to iterate the rows.
            // for loop to print the spaces
            for(int j = x -1; j >= i; j--){         // this loop iterates through the columns starting at x-1, as we want to print one star at the end.
                System.out.print(" ");              // prints spaces in the same line till the condition is true
            }                                       // once the condition is false, then the execution jumps out of the loop
            // for loop for printing stars
            for(int k = 1; k <= i; k++){        // this loop iterates through the columns
                System.out.print("x");          // prints a star on the same line till the condition is true.
            }
            System.out.println();           // once the condition for the loop is false, comes out to the outer loop and prints a new line. increments i.
        }
    }
}
