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
     * @param args      entered values
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

        Scanner fourthKeyboardInput = new Scanner(System.in);
        System.out.println("Once again, enter the same integer" + 
                           " number, 123, six times:");
        byteNumber = fourthKeyboardInput.nextByte();
        shortNumber = fourthKeyboardInput.nextShort();
        intNumber = fourthKeyboardInput.nextInt();
        longNumber = fourthKeyboardInput.nextLong();
        floatNumber = fourthKeyboardInput.nextFloat();
        doubleNumber = fourthKeyboardInput.nextDouble();

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
        /* Without byte casting, it throws a conversion error,
         * mainly due to the fact that byte is not large enough
         * to be converted to an integer.
        */
        byteNumber = (byte)intNumber;
        /* Without short casting, it throws a conversion error,
         * mainly due to the fact that short is not large enough
         * to be converted to an integer.
         */
        shortNumber = (short)intNumber;
        longNumber = intNumber;
        floatNumber = intNumber;
        doubleNumber = intNumber;

        // problem 4(B):
        Scanner fifthKeyboardInput = new Scanner(System.in);

        System.out.println("Now, simply enter the integer" +
                           " number, 127, one time:");
        intNumber = fifthKeyboardInput.nextInt();

        intNumber = byteNumber;
        intNumber = shortNumber;
        /* Without int casting, it throws a conversion
         * error for the longNumber, floatNumber, and
         * doubleNumber literals, due to the fact that
         * the int data type is not large enough to be
         * converted to a long, float, and double
        */
        intNumber = (int)longNumber;
        intNumber = (int)floatNumber;
        intNumber = (int)doubleNumber;
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
        byteNumber = (byte)intNumber;
        shortNumber = (short)intNumber;
        longNumber = intNumber;
        floatNumber = intNumber;
        doubleNumber = intNumber;
        Scanner sixthKeyboardInput = new Scanner(System.in);
        System.out.println("Now, simply enter the integer" + 
                           " number, -128, six times:");
        intNumber = sixthKeyboardInput.nextInt();
        byteNumber = sixthKeyboardInput.nextByte();
        shortNumber = sixthKeyboardInput.nextShort();
        longNumber = sixthKeyboardInput.nextLong();
        floatNumber = sixthKeyboardInput.nextFloat();
        doubleNumber = sixthKeyboardInput.nextDouble();
        
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
        shortNumber = (short)intNumber;
        longNumber = intNumber;
        floatNumber = intNumber;
        doubleNumber = intNumber;
        Scanner seventhKeyboardInput = new Scanner(System.in);
        System.out.println("Now, simply enter the integer" + 
                           " number, 128, five times:");
        intNumber = seventhKeyboardInput.nextInt();
        // byteNumber = seventhKeyboardInput.nextByte();
        shortNumber = seventhKeyboardInput.nextShort();
        longNumber = seventhKeyboardInput.nextLong();
        floatNumber = seventhKeyboardInput.nextFloat();
        doubleNumber = seventhKeyboardInput.nextDouble();

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
        shortNumber = (short)intNumber;
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
        System.out.println("Now, simply enter the integer" + 
                           " number, 32767, five times:");
        intNumber = eighthKeyboardInput.nextInt();
        // byteNumber = eighthKeyboardInput.nextByte();
        shortNumber = eighthKeyboardInput.nextShort();
        longNumber = eighthKeyboardInput.nextLong();
        floatNumber = eighthKeyboardInput.nextFloat();
        doubleNumber = eighthKeyboardInput.nextDouble();

        pbmTitle = "For problem 5(e):";
        System.out.println(pbmTitle  +
                           "\n\tshortNumber = " + shortNumber +
                           "\n\tintNumber = " + intNumber +
                           "\n\tlongNumber = " + longNumber +
                           "\n\tfloatNumber = " + floatNumber +
                           "\n\tdoubleNumber = " + doubleNumber + "\n");

        keyboardInput.close();
        secondKeyboardInput.close();
        fourthKeyboardInput.close();
        fifthKeyboardInput.close();
        sixthKeyboardInput.close();
        seventhKeyboardInput.close();
        eighthKeyboardInput.close();

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