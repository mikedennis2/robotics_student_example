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

        //String student_a_name = "Mike";
        // int student_a_age = 25;
        // int student_a_credit_hours = 15;

        // String student_b_name = "Francois";
        // int student_b_age = 28;
        // int student_b_credit_hours = 12;

        double rate_per_credit_hour = 550.75;

        // How can we replace this code with the static method in Student.java?
        double student_a_fees = a.credit_hours * rate_per_credit_hour;
        double student_b_fees =  b.credit_hours * rate_per_credit_hour;

        // We have some repeated lines of code. Can we simplify this??
        System.out.println("Student a's name is: " + a.name + " and he is " + a.age + ".");
        System.out.println("Student a's total cost of attendance is: $" + student_a_fees + ".");

        System.out.println("Student b's name is: " + b.name + " and he is " + b.age + ".");
        System.out.println("Student b's total cost of attendance is: $" + student_b_fees + ".");
        
        }
}


