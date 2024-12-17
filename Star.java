package practice_java;

public class Star {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++) { // Outer loop for rows
            for (int j = 1; j <= 4-i+1; j++) { // Inner loop for columns
                System.out.print("*"); // Print stars on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

