/*
    This program is a finance manager that will track personal expenses
    - adding expenses
    - Categorizing them
    - calculating total expenses
    - generating reports
 */
import java.util.Scanner;
public class Finance {

    public static void main(String[] args) {

        System.out.print("Enter Your Name: ");
        Scanner in = new Scanner(System.in);
        String yourName = in.next();


        System.out.println("Your Name is: " + yourName);

    }
}
