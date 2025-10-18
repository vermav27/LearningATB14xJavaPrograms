package ex_25_CollectionFramework.D_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab216_MapStoredInList {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        m1.put("name","Vineet");
        m1.put("roll no",1);
        m1.put("phone",89658965);

        Map m2 = new HashMap();
        m2.put("name","Kunal");
        m2.put("roll no",2);
        m2.put("phone",89654125);

        Map m3 = new HashMap();
        m3.put("name","Ankita");
        m3.put("roll no",3);
        m3.put("phone",89118965);

        List l1 = new ArrayList();
        l1.add(m1);
        l1.add(m2);
        l1.add(m3);

        System.out.println(l1);

    }
}
