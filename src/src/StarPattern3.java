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
        printPatternReverse(4);
    }

    private static void printPattern(int x){

        for(int i = 1; i <= x ; i++){               //   this for loop is used to iterate the rows.
            // for loop to print the spaces
            for(int j = x -1; j >= i; j--){         // this loop iterates through the columns starting at x-1, as we want to print one star at the end.
                System.out.print(" ");              // prints spaces in the same line till the condition is true
            }                                       // once the condition is false, then the execution jumps out of the loop
            // for loop for printing stars
            for(int k = 1; k <= i; k++){        // this loop iterates through the columns
                System.out.print("*");          // prints a star on the same line till the condition is true.
            }
            System.out.println();           // once the condition for the loop is false, comes out to the outer loop and prints a new line. increments i.
        }
    }

    // Method to print the pattern in reverse
    // ****
    // ***
    // **
    // *

    private static void printPatternReverse(int x){
        for(int i = 1; i <= x; i++){            // this for loop iterates through the rows
            // for loop to print the spaces
            for(int k = 2; k <= i; k++){        // this loop iterates through the columns and prints out spaces.
                System.out.print(" ");          // til the condition is true, prints spaces.
            }
            // for loop for printing stars
            for(int j = x; j >= i; j--){        // this for loop iterates through the columns
                System.out.print("*");          // the value of j starts from x say 4, then the condition j >= i is checked ( 4>= 1) so it prints a star on the line
                                                // then j is decremented to 3, condition is checked, and star is printed and so on.
            }
            System.out.println();               // when the condition fails, the execution breaks out of the inner loop, and prints a new line. Increments i by 1.
        }
    }
}
