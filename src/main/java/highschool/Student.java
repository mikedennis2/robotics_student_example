package highschool;

public class Student {

    String name;
    int age;
    int credit_hours;

    public Student(){

    }


    public Student(String name, int age, int credit_hours){

        this.name = name;
        this.age = age;
        this.credit_hours = credit_hours;
     

    }

    // We need to define the function below and use it in CristoRey.java
    public static double calculateAttenceCost(double cost_per_ch, int ch_quantity){
        return cost_per_ch * ch_quantity;
    }


    // TODO: #1 define the attendance cost calculation on a per student basis


    /* #TODO: #2 create a way to print one sentence giving the a Student's name and age 
    Ex. "Mike is 25 years old" */


    /* #TODO: #3 create a way to print the number of credits a student is taking and the cost 
    Ex. "Mike is taking 15 credits for a total cost of ____" */
}
