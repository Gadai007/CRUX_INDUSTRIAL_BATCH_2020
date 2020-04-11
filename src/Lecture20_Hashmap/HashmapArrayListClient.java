package Lecture20_Hashmap;

public class HashmapArrayListClient {
    public static void main(String[] args) {

        HashmapArrayList<String,String> map = new HashmapArrayList<>();

        map.add("mango", "mast");
        map.add("apple", "theek");
        map.add("orange","bekaar");

        System.out.println(map.get("apple"));
        System.out.println(map.get("mango"));
        System.out.println(map.get("orange"));
    }
}
