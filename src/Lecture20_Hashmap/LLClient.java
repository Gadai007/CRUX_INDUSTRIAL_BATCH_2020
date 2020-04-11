package Lecture20_Hashmap;

public class LLClient {
    public static void main(String[] args) {

        HashmapLinkedList map = new HashmapLinkedList();
        map.put("Debayan", "Java Class");
        map.put("Shubham","Quarantine");

        System.out.println(map.get("Shubham"));

    }
}
