// STAR PATTERN
// *                    ****
// **                   ***
// ***                  **
// ****                 *
// we will use the concepts of nested for loops.
// things to remember, the for loop for rows will always stay constant as it will increase from 1 to the number given as argument.
// the number of stars printed in a row is dependent on the nested for loop's condition.

public class StarPattern1 {
    public static void main(String[] args){

        printPattern(4);
        printPatternReverse(4);
    }

    // Method to print the star pattern
    // *
    // **
    // ***
    // ****
   private static void printPattern(int x){
        for(int i = 1; i <= x; i++){            // this for loop will iterate rows
            for(int j = 1; j <= i; j++){        // this for loop will iterate columns.
                System.out.print("*");          // when i = 1 and j = 1, a star is printed on the line,then when j = 2, the condition becomes false as j is not less than equal to i
                                                // so the execution breaks out of the loop and goes into the outer for loop
            }
            System.out.println();               // it just moves the cursor to the next line. then again i is incremented to 2 and the loops execute
        }
   }

    // Method to print the star pattern in reverse order
    // ****
    // ***
    // **
    // *
    private static void printPatternReverse(int x){
        for(int i = 1 ; i <= x; i++){           // this loop iterates the rows, and starts from the number provided to us and then increments each time
            for(int j = x ; j >= i; j--){       // this for loop iterates columns
                System.out.print("*");          // when i = 1 and j = 4, then a star is printed, then j is decremented to 3, and prints one more start on the same line.
                                                // then j is decremented to 2 and j is still greater than equal to i, so one more start is printed. and then decrements to 1
                                                // and prints one more star on the same line. then the execution breaks out of the loop as the condition becomes false.
            }
            System.out.println();               // this loop prints a new line, and then increments the value of i.
        }
    }

}
