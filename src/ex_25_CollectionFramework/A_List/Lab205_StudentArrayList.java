package ex_25_CollectionFramework.A_List;

import java.util.ArrayList;

public class Lab205_StudentArrayList {
    public static void main(String[] args) {

        Lab204_studentClass s1 = new Lab204_studentClass("Vineet",23);
        Lab204_studentClass s2 = new Lab204_studentClass("Kunal",21);
        Lab204_studentClass s3 = new Lab204_studentClass("Ankita",24);
        Lab204_studentClass s4 = new Lab204_studentClass("Saroj",26);

        ArrayList studentInfo = new ArrayList();
        // Here we can use Vector , Stack , Linklist - No problem in that
        studentInfo.add(s1);
        studentInfo.add(s2);
        studentInfo.add(s3);
        studentInfo.add(s4);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        s4.printDetails();

        System.out.println(studentInfo);

        System.out.println(studentInfo.get(0));

    }
}
