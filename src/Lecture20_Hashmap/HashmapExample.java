package Lecture20_Hashmap;

import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Debayan","Home");
        map.put("Saransh","Birthday Boy");
        map.put("Indranagar","Address");

        //System.out.println(map);

        for (String string: map.keySet()){
            System.out.println(string);
        }

        for(String string : map.values()){
            System.out.println(string);
        }

        System.out.println(map.get("Debayan"));

        System.out.println(frequency("aaabbcc"));
    }

    public static HashMap<Character, Integer> frequency(String str){

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);

            if (!freq.containsKey(ch)){
                freq.put(ch,1);
            }

            else {
                freq.put(ch,freq.get(ch)+1);
            }
        }

        return freq;
    }

    //count all vowels by using hashmap.
}
