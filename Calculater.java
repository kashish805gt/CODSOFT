import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
             Scanner sc = new  Scanner(System.in);

    System.out.println("Enter Number of subject");
   int n = sc.nextInt();

int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = (double) total / n;

        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
