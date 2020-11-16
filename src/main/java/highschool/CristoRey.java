package highschool;

import java.time.LocalDate;

public class CristoRey {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("The current day is: " + today);
        
        Student a = new Student();
        
        a.name = "Mike";
        a.age = 25;
        a.credit_hours = 15;

        Student b = new Student( "Francios", 28, 12);

        // String student_a_name = "Mike";
        // int student_a_age = 25;
        // int student_a_credit_hours = 15;

        // String student_b_name = "Francois";
        // int student_b_age = 28;
        // int student_b_credit_hours = 12;

        double rate_per_credit_hour = 550.75;

        // How can we define this attendance cost calculation differently?? Maybe on a per student basis.
        double student_a_fees = Student.calculateAttenceCost(rate_per_credit_hour, a.credit_hours);
        double student_b_fees = Student.calculateAttenceCost(rate_per_credit_hour, b.credit_hours);

        // We repeated the same lines of code for students a and b. Is there a better way??
        System.out.println("Student a's name is: " + a.name + " and he is " + a.age + ".");
        System.out.println("Student a's total cost of attendance is: $" + student_a_fees + ".");

        System.out.println("Student b's name is: " + b.name + " and he is " + b.age + ".");
        System.out.println("Student b's total cost of attendance is: $" + student_b_fees + ".");
        
        }
}


