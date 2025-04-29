//import java.util.Scanner;
//
//public class Today {
//    public static void main(String[] args) {
//        // Create a Scanner object to read input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a string
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//
//        // Reverse the string
//        String reversed = new StringBuilder(input).reverse().toString();
//
//        // Display the reversed string
//        System.out.println("Reversed string: " + reversed);
//
//        // Close the scanner
//        scanner.close();
//    }
//}

//public class Today {
//    public static void main(String[] args) {
//        System.out.println("Numbers from 30 to 60 that are divisible by 4 or 3 but not both:");
//
//        for (int i = 30; i <= 60; i++) {
//            if ((i % 4 == 0) ^ (i % 3 == 0)) { // XOR condition ensures only one is true
//                System.out.println(i);
//            }
//        }
//    }
//}


import java.util.Scanner;

public class Today {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a grade input
        System.out.print("Enter a grade (A-F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        // Convert grade to numeric equivalent
        int numericGrade;
        switch (grade) {
            case 'A': numericGrade = 1; break;
            case 'B': numericGrade = 2; break;
            case 'C': numericGrade = 3; break;
            case 'D': numericGrade = 4; break;
            case 'E': numericGrade = 5; break;
            case 'F': numericGrade = 6; break;
            default:
                System.out.println("Invalid grade entered!");
                scanner.close();
                return;
        }

        // Display the numeric equivalent
        System.out.println("Numeric equivalent: " + numericGrade);

        // Close the scanner
        scanner.close();
    }
}

