package Lecture14;

public class StackClient {
    public static void main(String[] args) {
        OriginalStack stack = new OriginalStack();

        for (int i = 0; i < 10 ; i++) {
            stack.push(i);
        }
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println(stack.pop());
            }
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}
