package HashMap;

import uss.Set_Uss.Student;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Hashmap is an Separate Interface
//Key's are Unique but
//Values are same

public class Mapclass {
    public static void main(String[] args) {
        Map hh = new HashMap();

        hh.put(1,"Devendra");
        hh.put(2,"Rakesh");
        hh.put(3,"Akhilesh");
        hh.put(4,"Rohan");

        System.out.println(hh);

        //Only Key are Return.
        System.out.println(hh.keySet());

        //Only Values are Return.
        System.out.println(hh.values());

//        for(Object keyy: hh.keySet()){
//            System.out.println(keyy);
//        }

        //Its returns both key and value print..
        for(Object val: hh.entrySet())
        {
            System.out.println(val);
        }

        //HashMap Access Using Keys
        System.out.println(hh.get(1));

        //Its returns boolean Form(Element present or Not)
        System.out.println(hh.containsKey(2));

        System.out.println(hh.containsValue("Yogesh"));

        //Remove Particular key return value
        System.out.println(hh.remove(2));

        //Removing Boolean from
        System.out.println(hh.remove(2,"Rakesh"));
        System.out.println(hh);


        Map mm = new HashMap();
        mm.put(5,"Mayur");
        mm.put(7,"Prashant");
        mm.put(8,"Viresh");
        mm.put(9,"Dangya");

        System.out.println(mm);

        mm.putAll(hh);
        System.out.println(mm);

        Iterator tt = mm.entrySet().iterator();
        while (tt.hasNext()){
            System.out.println(tt.next());
        }


    }
}
