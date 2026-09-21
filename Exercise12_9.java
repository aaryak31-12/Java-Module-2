import java.util.Scanner;

public class Exercise12_9 {

    public static void main(String[] args) {

        //creating a Scanner objects for user input
        Scanner input = new Scanner(System.in);

        //asking the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();

        try {
            // calling the method and displaying the decimal value
            System.out.println("The decimal value is " +
                    bin2Dec(binaryString));
        }
        catch (BinaryFormatException ex) {
        // displaying this if the string is not a binary number
            System.out.println("Not a binary number");
        }
    }



    public static int bin2Dec(String binaryString)
            throws BinaryFormatException {

        // variable to store the decimal value
        int decimal = 0;

            for (int i = 0; i < binaryString.length(); i++) {

            // checking if the current character is not 0 or 1
            if (binaryString.charAt(i) != '0' &&
                    binaryString.charAt(i) != '1') {

                // throwing the exception if the string is not binary
                throw new BinaryFormatException();
            }

            // multiplying the current decimal to 2
            decimal = decimal * 2;

            // adding 1 if the current binary digit is 1
            if (binaryString.charAt(i) == '1') {
                decimal = decimal + 1;
            }
        }

        //returning the converted decimal value
        return decimal;
    }
}


class BinaryFormatException extends Exception {





}