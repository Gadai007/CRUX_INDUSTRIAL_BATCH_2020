package Lecture14;

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(6);
        for (int i = 0; i < 15 ; i++) {
            stack.push(i);
        }
        try {
            for (int i = 0; i <15 ; i++) {
                stack.pop();
            }
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}
