package ex_11_Arrays;

public class Lab114_ArrayExample {

    public static void main(String[] args) {

        int[] marks = {45,45,65,59,53};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean[] isMarried = {true,false,false,false};
        System.out.println(isMarried[2]);

        String name = "Pramod";
        String[] nameSplit = name.split("");

        for(String s : nameSplit){
            System.out.println(s);
        }


    }


}
