// STAR PATTERN
// *
// **
// ***
// ****
// ****
// ***
// **
// *
// for printing this pattern we will use the same logic as in the StarPattern1 problem and combine them both.


public class StarPattern2 {
    public static void main(String[] args){

        printPattern(4);
    }

    // Method to print
    // *
    // **
    // ***
    // ****
    // ****
    // ***
    // **
    // *
    private static void printPattern(int x){
        for(int i = 1; i <= x; i++){                    // first we start with a for loop to iterate through the rows
            for( int j = 1; j <= i; j++){               // then a nested for loop to iterate through columns
                System.out.print("*");                  // if condition j <= i is true, then prints a star on the line
            }
            System.out.println();                   // once the condition becomes false for nested loop, execution comes out to outer loop and prints a new line
                                                    // value of i is incremented. once this condition also fails, the execution breaks out of the for loop.
        }
        // by the end of this loop we have
        // *
        // **
        // ***
        // ****

        for(int i = 1; i <= x; i++){        // we then enter another for loop that iterates through the rows.
            for(int j = x; j >= i; j--){    // a for loop that iterates through the columns with value starting in reverse.
                System.out.print("*");      // if the condition j >= i is true, it prints a star on the line.
            }
            System.out.println();       // when the condition fails for the inner for loop, the execution comes to the outer for loop and prints a new line
                                        // and then increments the value of i.
        }
        // by the end of this loop we have,
        // *
        // **
        // ***
        // ****
        // ****
        // ***
        // **
        // *
    }
}
