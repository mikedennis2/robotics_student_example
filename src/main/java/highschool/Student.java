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


}
