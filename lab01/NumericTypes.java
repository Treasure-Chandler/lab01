/*
 * Treasure Chandler
 * CS 16000-01 – 02/03, Fall Semester 2024
 * Lab 01
 */

 package lab01;

 import java.util.Scanner; //needed for the Scanner class 

 public class NumericTypes {
     /**
      * 
      * @param args      entered values
      */
     public static void main(String[] args) {
         // variables declaration
         // problems 1 and 2(A):
         byte byteNumber = 127; // a literal is a value that is written into
         short shortNumber = 127; // the code of a program
         int intNumber = 127;
         long longNumber = 127;
         float floatNumber = 127f;
         double doubleNumber = 127.0;
         String pbmTitle = "For problem 2(A): "; // string literal

         // problem 2(A):
         String output = "\n\tbyteNumber = " + byteNumber +
                         "\n\tshortNumber = " + shortNumber +
                         "\n\tintNumber = " + intNumber +
                         "\n\tlongNumber = " + longNumber +
                         "\n\tfloatNumber = " + floatNumber +
                         "\n\tdoubleNumber = " + doubleNumber + "\n";

        System.out.println(pbmTitle + output);

        displayConsole(pbmTitle, byteNumber, shortNumber, intNumber, longNumber, floatNumber, doubleNumber);

        // problem 2(B):
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Please enter the same integer number, 123, six times:");
        byteNumber = keyboardInput.nextByte();
        shortNumber = keyboardInput.nextShort();
        intNumber = keyboardInput.nextInt();
        longNumber = keyboardInput.nextLong();
        floatNumber = keyboardInput.nextFloat();
        doubleNumber = keyboardInput.nextDouble();
        keyboardInput.close();

        pbmTitle = "For problem 2(B): ";
        String secondOutput = "\n\tbyteNumber = " + byteNumber +
                              "\n\tshortNumber = " + shortNumber +
                              "\n\tintNumber = " + intNumber +
                              "\n\tlongNumber = " + longNumber +
                              "\n\tfloatNumber = " + floatNumber +
                              "\n\tdoubleNumber = " + doubleNumber + "\n";
        System.out.println(pbmTitle + secondOutput);

        displayConsole(pbmTitle, byteNumber, shortNumber, intNumber, longNumber, floatNumber, doubleNumber);
 
     } // end of main()

     // problem 2(A):
     /**
      * 
      * @param pbm      title to present the displayed values
      * @param bN       byte number
      * @param sN       short number
      * @param iN       int number
      * @param fN       float number
      * @param dN       double number
      */
     public static void displayConsole(String pbm, byte bN, short sN, int iN, long lN, float fN, double dN) {
        String output = "\n\tbyteNumber = " + bN +
                        "\n\tshortNumber = " + sN +
                        "\n\tintNumber = " + iN +
                        "\n\tlongNumber = " + lN + 
                        "\n\tfloatNumber = " + fN +
                        "\n\tdoubleNumber = " + dN;
        System.out.println("From displayConsole():\n" +
                           pbm + output);

     } // end of displayConsole()

 } // end of NumericTypes class