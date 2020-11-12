package highschool;

import java.time.LocalDate;

public class CristoRey {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("The current day is: " + today);
        
        String student_a_name = "Mike";
        int student_a_age = 25;
        int student_a_credit_hours = 15;

        String student_b_name = "Francois";
        int student_b_age = 28;
        int student_b_credit_hours = 12;

        double rate_per_credit_hour = 550.75;

        double student_a_fees = Student.calculateAttenceCost(rate_per_credit_hour, student_a_credit_hours);
        double student_b_fees = student_b_credit_hours * rate_per_credit_hour;

        System.out.println("Student a's name is: " + student_a_name + " and he is " + student_a_age + ".");
        System.out.println("Student a's total cost of attendance is: $" + student_a_fees + ".");

        System.out.println("Student b's name is: " + student_b_name + " and he is " + student_b_age + ".");
        System.out.println("Student b's total cost of attendance is: $" + student_b_fees + ".");
        }
}


