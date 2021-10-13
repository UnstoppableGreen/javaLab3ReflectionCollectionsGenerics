package lab1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class collect {
	void createMAP(){
		System.out.println("MAP");
		HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("Vanya", "21.02.1997");
        myHashMap.put("Kate", "12.04.1991");
        myHashMap.put("Lena", "19.01.1991");
        System.out.println("The value for 'Lena' is " + myHashMap.get("Lena"));
        System.out.println("Do we have a value '12.10.1971': " + myHashMap.containsValue("12.04.1991"));
	}
	
	void createSET(){
		System.out.println("SET");
		HashSet<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("Set contain '1': " + myHashSet.contains(1));
        System.out.println("Set contain '4': " + myHashSet.contains(4));
	}
	
	void createLIST(){
		System.out.println("LIST");
		ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Hello!");
        myArrayList.add("Anna!");
        System.out.println("Before deletion:");
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.print(myArrayList.get(i));
        System.out.println();
        myArrayList.remove(0);
        System.out.println("After removal:");
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i));
	}
}
