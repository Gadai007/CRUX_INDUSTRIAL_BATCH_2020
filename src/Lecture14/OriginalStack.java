package Lecture14;

public class OriginalStack {
   private int DEFAULT_SIZE = 10;

   private  int[] ar;

   private int top ;

   public OriginalStack(){
       this.ar = new int[DEFAULT_SIZE];
       this.top = 0;
   }
   public boolean isFull(){
       return top == ar.length;
   }
   public void push(int element){
       if (isFull()){
           return;
       }
       ar[top++] = element;
   }
   public boolean isEmpty(){
       return  top ==0;
   }
   public int pop() throws Exception{
       if (isEmpty()){                             // System.out.println("khali he be");
           throw new Exception("Khali he be");     // return -1;
       }
       int temp= ar[top -1];
       top--;
       return temp;
   }
   public int top(){
       return ar[top -1];
   }
}
