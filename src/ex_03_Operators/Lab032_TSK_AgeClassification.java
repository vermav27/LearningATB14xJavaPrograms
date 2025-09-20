package ex_03_Operators;

public class Lab032_TSK_AgeClassification {
    public static void main(String[] args) {

        //Program to classify the age for minor, Adult , Sr. Citizen

        int age = 60;
        String classification = (age <18) ? "Minor" : ( age > 18 && age < 60 ? "Adult" : "Sr. Citizen" );
        System.out.printf("This person is : %s", classification);

    }
}
