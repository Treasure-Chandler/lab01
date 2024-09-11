/*
 * Treasure Chandler
 * CS 16000-01 – 02/03, Fall Semester 2024
 * Lab 01
 */

package lab01;

import java.util.Scanner; // needed for the Scanner class

public class NumericTypes {
   /**
    *
    * @param args entered values
    */
   public static void main(String[] args) {
      // variables declaration
      // problems 1 and 2(A):
      byte byteNumber = 127;
      short shortNumber = 127;
      int intNumber = 127;
      long longNumber = 127;
      float floatNumber = 127f;
      double doubleNumber = 127.0;

      String pbmTitle = "For problem 2(A): ";
      String output = "\n\tbyteNumber = " + byteNumber +
                      "\n\tshortNumber = " + shortNumber +
                      "\n\tintNumber = " + intNumber +
                      "\n\tlongNumber = " + longNumber +
                      "\n\tfloatNumber = " + floatNumber +
                      "\n\tdoubleNumber = " + doubleNumber + "\n";
      System.out.println(pbmTitle + output);
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);

      // problem 2(B):
      Scanner keyboardInput = new Scanner(System.in);
      System.out.println("First, please enter the same integer" +
                         " number, 123, six times:");
      byteNumber = keyboardInput.nextByte();
      shortNumber = keyboardInput.nextShort();
      intNumber = keyboardInput.nextInt();
      longNumber = keyboardInput.nextLong();
      floatNumber = keyboardInput.nextFloat();
      doubleNumber = keyboardInput.nextDouble();

      pbmTitle = "For problem 2(B): ";
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);

      // problem 3(A):
      byteNumber = 127;
      shortNumber = 127;
      intNumber = 127;
      longNumber = 127;
      floatNumber = 127.0f;
      doubleNumber = 127;

      pbmTitle = "For problem 3(A): ";
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);
      /*
       * 3(A) Explanation:
       * The output is correct as all of the literals
       * display the value of 127. These literals have
       * gone through changes. They were first
       * initialized with the value of 127, then their
       * values would be what the user would input
       * (for example, 123 from the original prompt),
       * then their value is changed again back to 127,
       * and their values of 127 will be printed to the
       * console. This is mainly because the last value
       * they are changed will be printed to the console.
       */

      // problem 3(B):
      Scanner secondKeyboardInput = new Scanner(System.in);
      System.out.println("Now, enter the same integer number," +
                         " 127, six times:");
      byteNumber = secondKeyboardInput.nextByte();
      shortNumber = secondKeyboardInput.nextShort();
      intNumber = secondKeyboardInput.nextInt();
      longNumber = secondKeyboardInput.nextLong();
      floatNumber = secondKeyboardInput.nextFloat();
      doubleNumber = secondKeyboardInput.nextDouble();

      pbmTitle = "For problem 3(B): ";
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);

      Scanner thirdKeyboardInput = new Scanner(System.in);
      System.out.println("Once again, enter the same integer" +
                         " number, 123, six times:");
      byteNumber = thirdKeyboardInput.nextByte();
      shortNumber = thirdKeyboardInput.nextShort();
      intNumber = thirdKeyboardInput.nextInt();
      longNumber = thirdKeyboardInput.nextLong();
      floatNumber = thirdKeyboardInput.nextFloat();
      doubleNumber = thirdKeyboardInput.nextDouble();

      pbmTitle = "For problem 3(B):";
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);
      /*
       * 3(B) Explanation:
       * My overall experience has been the same experience
       * as problem 3(A). As the literals go through changes,
       * they will always display each change as they are
       * displayed to the console. Due to the fact that the
       * last value the user has to input is 123, that means
       * the literals will display 123 in the console, which
       * means the program is working correctly.
       */

      // problem 4(A):
      intNumber = 127;
      /*
       * Without byte casting, it throws a conversion error,
       * mainly due to the fact that byte is not large enough
       * to be converted to an integer.
       */
      byteNumber = (byte) intNumber;
      /*
       * Without short casting, it throws a conversion error,
       * mainly due to the fact that short is not large enough
       * to be converted to an integer.
       */
      shortNumber = (short) intNumber;
      longNumber = intNumber;
      floatNumber = intNumber;
      doubleNumber = intNumber;

      // problem 4(B):
      Scanner fourthKeyboardInput = new Scanner(System.in);
      System.out.println("Now, simply enter the integer" +
                         " number, 127, one time:");
      intNumber = fourthKeyboardInput.nextInt();
      intNumber = byteNumber;
      intNumber = shortNumber;
      /*
       * Without int casting, it throws a conversion
       * error for the longNumber, floatNumber, and
       * doubleNumber literals, due to the fact that
       * the int data type is not large enough to be
       * converted to a long, float, and double
       */
      intNumber = (int) longNumber;
      intNumber = (int) floatNumber;
      intNumber = (int) doubleNumber;
      /*
       * 4(B) Explanation:
       * Even if the literal intNumber is assigned to
       * different literals, it still has the same behavior
       * when it is displayed in the console.
       */

      pbmTitle = "For problem 4(B):";
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);

      // problem 5:
      intNumber = -128;
      byteNumber = (byte) intNumber;
      shortNumber = (short) intNumber;
      longNumber = intNumber;
      floatNumber = intNumber;
      doubleNumber = intNumber;
      Scanner fifthKeyboardInput = new Scanner(System.in);
      System.out.println("Now, simply enter the integer" +
                         " number, -128, six times:");
      intNumber = fifthKeyboardInput.nextInt();
      byteNumber = fifthKeyboardInput.nextByte();
      shortNumber = fifthKeyboardInput.nextShort();
      longNumber = fifthKeyboardInput.nextLong();
      floatNumber = fifthKeyboardInput.nextFloat();
      doubleNumber = fifthKeyboardInput.nextDouble();

      pbmTitle = "For problem 5(c):";
      displayConsole(pbmTitle, byteNumber, shortNumber,
                     intNumber, longNumber, floatNumber,
                     doubleNumber);
      /*
       * Without byte casting, it throws a conversion
       * error for the byteNumber literal. Without short
       * casting, it throws a conversion error for the
       * shortNumber literal, due to the fact that byte
       * and short are not large enough to be converted
       * to an integer.
       */

      intNumber = 128;
      /*
       * This line is commented out due to the fact that
       * 127 is the limit for the byte data type. Trying
       * to input 128 when it comes time for byteNumber's
       * input will throw an exception, as 128 is out of
       * its range.
       */
      // byteNumber = (byte)intNumber;
      shortNumber = (short) intNumber;
      longNumber = intNumber;
      floatNumber = intNumber;
      doubleNumber = intNumber;
      Scanner sixthKeyboardInput = new Scanner(System.in);
      System.out.println("Now, simply enter the integer" +
                         " number, 128, five times:");
      intNumber = sixthKeyboardInput.nextInt();
      // byteNumber = sixthKeyboardInput.nextByte();
      shortNumber = sixthKeyboardInput.nextShort();
      longNumber = sixthKeyboardInput.nextLong();
      floatNumber = sixthKeyboardInput.nextFloat();
      doubleNumber = sixthKeyboardInput.nextDouble();

      pbmTitle = "For problem 5(a):";
      System.out.println(pbmTitle +
                         "\n\tshortNumber = " + shortNumber +
                         "\n\tintNumber = " + intNumber +
                         "\n\tlongNumber = " + longNumber +
                         "\n\tfloatNumber = " + floatNumber +
                         "\n\tdoubleNumber = " + doubleNumber + "\n");

      intNumber = 32767;
      /*
       * This line is commented out due to the fact that
       * 127 is the limit for the byte data type. Trying
       * to input 32767 when it comes time for byteNumber's
       * input will throw an exception, as 32767 is out of
       * its range.
       */
      // byteNumber = (byte)intNumber;
      shortNumber = (short) intNumber;
      longNumber = intNumber;
      floatNumber = intNumber;
      doubleNumber = intNumber;
      /*
       * Without byte casting, it throws a conversion
       * error for the byteNumber literal. Along with
       * this, without short casting, it throws a
       * conversion error for the shortNumber literal,
       * due to the fact that byte and short are not
       * large enough to be converted to an integer.
       */

      Scanner seventhKeyboardInput = new Scanner(System.in);
      System.out.println("Now, simply enter the integer" +
                         " number, 32767, five times:");
      intNumber = seventhKeyboardInput.nextInt();
      // byteNumber = seventhKeyboardInput.nextByte();
      shortNumber = seventhKeyboardInput.nextShort();
      longNumber = seventhKeyboardInput.nextLong();
      floatNumber = seventhKeyboardInput.nextFloat();
      doubleNumber = seventhKeyboardInput.nextDouble();

      pbmTitle = "For problem 5(e):";
      System.out.println(pbmTitle +
                         "\n\tshortNumber = " + shortNumber +
                         "\n\tintNumber = " + intNumber +
                         "\n\tlongNumber = " + longNumber +
                         "\n\tfloatNumber = " + floatNumber +
                         "\n\tdoubleNumber = " + doubleNumber + "\n");

      intNumber = 2147483647;
      /*
       * The lines for declaring the literals byteNumber and
       * shortNumber are commented out due to the fact that
       * 127 is the limit for the byte data type, and 32767
       * is the limit for the short data type. Trying to input
       * 2147483647 when it comes to byteNumber's or
       * shortNumber's input will throw an exception, as
       * 2147483647 is out of both of their ranges.
       */
      // byteNumber = (byte)intNumber;
      // shortNumber = (short)intNumber;
      longNumber = intNumber;
      floatNumber = intNumber;
      doubleNumber = intNumber;
      /*
       * Without byte casting, it throws a conversion
       * error for the byteNumber literal. Along with
       * this, without short casting, it throws a
       * conversion error for the shortNumber literal,
       * due to the fact that byte and short are not
       * large enough to be converted to an integer.
       */

      Scanner eighthKeyboardInput = new Scanner(System.in);
      System.out.println("Finally, simply enter the integer" +
                         " number, 2147483647, four times:");
      intNumber = eighthKeyboardInput.nextInt();
      // byteNumber = eighthKeyboardInput.nextByte();
      // shortNumber = eighthKeyboardInput.nextShort();
      longNumber = eighthKeyboardInput.nextLong();
      floatNumber = eighthKeyboardInput.nextFloat();
      doubleNumber = eighthKeyboardInput.nextDouble();

      pbmTitle = "For problem 5(i):";
      System.out.println(pbmTitle +
                         "\n\tintNumber = " + intNumber +
                         "\n\tlongNumber = " + longNumber +
                         "\n\tfloatNumber = " + floatNumber +
                         "\n\tdoubleNumber = " + doubleNumber + "\n");

      keyboardInput.close();
      secondKeyboardInput.close();
      thirdKeyboardInput.close();
      fourthKeyboardInput.close();
      fifthKeyboardInput.close();
      sixthKeyboardInput.close();
      seventhKeyboardInput.close();
      eighthKeyboardInput.close();

      // problem 6:
      floatNumber = 69;
      System.out.println("Problem 6 results:" +
                         "\n" + floatNumber);

      floatNumber = 69.0f;
      System.out.println(floatNumber);
      /*
       * Without adding the "f" to the end of floatNumber's
       * value, in this case, 69.0, an error will be thrown
       * stating a double value cannot be converted to a float
       * value
       */

      floatNumber = 69.68f;
      System.out.println(floatNumber + "\n");
      /*
       * Without adding the "f" to the end of floatNumber's
       * value, in this case, 69.68, an error will be thrown
       * stating a double value cannot be converted to a float
       * value
       */

      // problem 7:
      intNumber = 825;
      doubleNumber = 751.0;
      double ratio = intNumber / 751;
      System.out.println("Problem 7 results:" + 
                         "\n" + ratio);
      System.out.printf("%.4f", ratio);

      ratio = intNumber / doubleNumber;
      System.out.println("\n" + ratio);
      System.out.printf("%.3f", ratio);
      System.out.println();
      System.out.println();
      /*
       * Problem 7 experience:
       * When it comes to printing the result "intNumber / 751"
       * in the console, the result will display 1.0 due to the
       * fact that it is technically integer division. Integer
       * division will always return a result of an integer.
       * When the divisor and the dividend end up with a remainer,
       * the decimal in the remainder will be truncated off. The
       * only reason the result has a decimal in the console is because
       * the ratio literal is a double. If it was an integer data type,
       * it would simply display 1 instead of 1.0 in the console. Even
       * when the result is displayed with 4 digits after the decimal point,
       * it will still be one, but with 4 zeroes after the decimal point.
       *
       * Now, when it comes to printing the result "intNumber / doubleNumber"
       * in the console, the result will display a number greater than 1.0
       * due to the fact that it is technically double division. If one literal
       * is being divided by a literal with a double data type, the result will
       * always return as a double, especially when the division will return a
       * result with a remainder. Even when the result is displayed with 3 digits
       * after the decimal point, the result will be the same, but it will be
       * rounded to 3 decimal places; in this case, it will be 1.099.
       */

      // problem 8:
      System.out.println("Problem 8 results:");
      System.out.println('a' + 'b');
      System.out.println(" " + 'a' + 'b');
      System.out.println(" " + ('a' + 'b'));
      System.out.println((" " + 'a' + 'b'));
      System.out.println((" " + 'a') + 'b');
      System.out.println(' ' + 'a' + 'b');
      System.out.println(' ' + ('a' + 'b'));
      System.out.println((' ' + 'a' + 'b'));
      System.out.println((' ' + 'a') + 'b');
      System.out.println();
      /*
       * Problem 8 experience:
       * The reason why some print statements return numbers such as 195
       * and 227 instead of the possible expected result "ab" is because
       * chars are technically another numberic data type. So, when two
       * chars are attempted to be joined together with a +, arithemetic
       * operations occur instead. First, the characters are converted to
       * their respective ASCII values, then those ASCII values are added
       * together. In this case, the ASCII value of the space, also known
       * as ' ', is 32. The ASCII value of 'a' is 97, and the ASCII value
       * of 'b' is 98. So, adding ' ' + 'a' + 'b' = 227, and 'a' + 'b' = 195.
       * 
       * However, the reason why some print statements actually return "ab"
       * is because of the double quotation marks present. The double quotation
       * marks would convert those chars to strings, and the result will be
       * returned as a string instead.
       */

      // problem 9:
      System.out.println("Problem 9 results:");
      System.out.println("These are numbers: " + 
                         intNumber + " and " +
                         doubleNumber);
      System.out.println("These are numbers: " +
                         intNumber + doubleNumber);
      System.out.println("These are numbers: " +
                        (intNumber + doubleNumber) + 
                        "\n");
      /*
       * Problem 9 experience:
       * The intNumber and doubleNumber literals can be manipulated, but under
       * certain circumstances. In concatenation, when they are displayed
       * separately, they display the value they have been assigned with.
       * However, when they are concatenated together without spaces, they will
       * still display their given values as they are. However, when they are
       * "concatenated" within a set of parenthenses, the literals are treated
       * as variables in arithmetic operation, so their values will be added
       * together. In this case. 127 + 127.0 = 254.0
       */

    // problem 10:
    System.out.println("Problem 10 results:");
    System.out.println("Formula1: " +
                      (825 + 751 / intNumber * doubleNumber + 1) +
                      "\nFormula2: " +
                      825 + 751 / intNumber * doubleNumber + 1 +
                      "\nFormula3: " +
                      (825 + 751) / intNumber * (doubleNumber + 1) +
                      "\nFormula4: " +
                      ((825+751) / intNumber * (doubleNumber + 1)) +
                      "\nFormula5: " +
                      ((825 + 751) / intNumber * doubleNumber + 1) + 
                      "\nFormula6: " +
                      (825 + 751) / intNumber * doubleNumber + 1);
    /*
     * Problem 10 experience:
     * When the plain integer numbers 825 and 751 are included
     * in the print statement, the literals intNumber and
     * doubleNumber are then treated as numbers, so each
     * arithmetic operation that occurs in the print statement
     * are treated as basic math, PEMDAS included. Formula2 appears
     * to return the greatest value because of the fact that the
     * operation simply goes from left to right, because there
     * are no parentheses to prioritize.
     */

   } // end of main()

   // problem 2(A):
   /**
    *
    * @param pbm title to present the displayed values
    * @param bN  byte number
    * @param sN  short number
    * @param iN  int number
    * @param fN  float number
    * @param dN  double number
    */
   public static void displayConsole(String pbm, byte bN, short sN,
         int iN, long lN, float fN,
         double dN) {
      String output = "\n\tbyteNumber = " + bN +
                      "\n\tshortNumber = " + sN +
                      "\n\tintNumber = " + iN +
                      "\n\tlongNumber = " + lN +
                      "\n\tfloatNumber = " + fN +
                      "\n\tdoubleNumber = " + dN + "\n";
      System.out.println("From displayConsole():\n" +
                         pbm + output);

   } // end of displayConsole()

} // end of NumericTypes class