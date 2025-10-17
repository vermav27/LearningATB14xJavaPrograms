package ex_25_CollectionFramework;

import java.util.*;

public class Lab202_ArrayListInputUsingScanner {
    public static void main(String[] args) {

        List age = new ArrayList();
        List name = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String continueInput = "Y";

        while(continueInput.equalsIgnoreCase("Y")){


            System.out.print("Enter Name : ");
            name.add(sc.next());

            System.out.print("Enter Age : ");
            age.add(sc.next());


            System.out.print("Wants to enter another record : ");
            continueInput = sc.next();

            if(!continueInput.equalsIgnoreCase("Y")){
                break;
            }

        }

        for(Object o:name){
            System.out.println(o);
        }

        for(Object o:age){
            System.out.println(o);
        }

    }
}
