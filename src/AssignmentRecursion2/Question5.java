package AssignmentRecursion2;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(star("","hello",0));
   }

    public static String star(String processed, String unprocessed, int index){
        if (index == unprocessed.length()){
            System.out.println(processed);
            return processed;
        }
        char ch = unprocessed.charAt(index);
        if (index <= unprocessed.length()-1){
            if (unprocessed.charAt(index) == unprocessed.charAt(index+1)){
                return star(processed + "*", unprocessed,index);
            }
        }
        return star(processed + ch , unprocessed,index +1);
    }
}
