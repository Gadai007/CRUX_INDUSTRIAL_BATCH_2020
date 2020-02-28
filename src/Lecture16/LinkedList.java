package Lecture16;

import Lecture3.Array;

public class LinkedList {

    private Node head;

    private Node tail;

    private int size = 0;

    public class Node{

        int value;
        Node next; // Stores the node type values and stores the value of next node.

        public Node(int value){
            this.value = value;
        }

    }

    public void insertfirst(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }



    public void insertatlast(int value){
        if (size == 0){
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteatfirst(){
        if (size == 0){
            return  -1;
        }
        int value = head.value;

        head = head.next;
        size--;
        return value;
    }

    public int deleteLast(){
        if (size < 2){
           return deleteatfirst();
        }

//        Node temp = head;

//         while (temp.next != tail){
//             temp = temp.next;
//         }
         Node temp = get(size-2);
         int value = temp.next.value;
         temp.next = null;
         tail = temp;
         size--;
         return value;
    }


    public Node get(int index){
        Node temp = head;

        for (int i = 0; i <index ; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public void insertinbetween(int index, int value){
        if (index ==0){
             insertfirst(value);
             return;
        }
        if (index == size){
            insertatlast(value);
            return;
        }
        Node temp = get(index-1);
        Node node =new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }


    public int deleteinbetween(int index){
        if (index ==0){
           return deleteatfirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node temp = get(index-1);
        temp.next = temp.next.next;
        size--;
        return temp.next.value;
    }


    public void duplicate(){
        Node temp = head;

        while (temp.next != null){
            if (temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else {
                temp = temp.next;
            }
            tail = temp;
        }
    }


    public Node find(int element){
        Node temp = head;

        while (temp.next != null){
            if (temp.value == element){
                return temp;
            }
            else {
                temp = temp.next;
            }
        }
        return null;
    }


    public void reverse(){
        reverse(head);
    }

    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public LinkedList merge(LinkedList L1, LinkedList L2){
        LinkedList newlist = new LinkedList();
        Node First = L1.head;
        Node Second = L2.head;
        while (First != null && Second != null){
            if (First.value < Second.value){
                newlist.insertatlast(First.value);
                First = First.next;
            }
            else {
                newlist.insertatlast(Second.value);
                Second = Second.next;
            }
        }
        while (First != null){
            newlist.insertatlast(First.value);
            First = First.next;
        }
        while ( Second != null){
            newlist.insertatlast(Second.value);
            Second = Second.next;
        }
        return newlist;
    }


    public LinkedList oddeven(LinkedList L1){
      LinkedList odd = new LinkedList();
      LinkedList even = new LinkedList();
      LinkedList total = new LinkedList();

      Node temp = L1.head;
      while (temp != null){
          if (temp.value % 2 == 0){
              even.insertatlast(temp.value);
          }
          else {
              odd.insertatlast(temp.value);
          }
          temp = temp.next;
      }
      total = total.merge(odd,even);  // odd.tail.next = even.head;
      return total;                     // odd.tail = even.tail;    return odd;
    }

    public void oddsum1(LinkedList L1){
        Node odd_head = null;
        Node odd_tail = null;
        Node even_head = null;
        Node even_tail = null;

        Node temp = head;

        while (temp != null){
            if (temp.value % 2 == 0){
                if (even_head == null){
                    even_head = temp;
                    even_tail = temp;
                }
                else {
                    even_tail.next = temp;
                    even_tail = temp;
                }
            }
            else {
                if (odd_head == null){
                    odd_head = temp;
                    odd_tail = temp;
                }
                else {
                    odd_tail.next = temp;
                    odd_tail = temp;
                }
            }
            temp = temp.next;
        }
        odd_tail.next= even_head;
        head = odd_head;
        tail = even_tail;
        tail.next = null;

        L1.display();
    }

    public void mid(LinkedList L1){
        Node temp1 = head;
        Node temp2 = head;

        while (temp2.next != null & temp2.next.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        System.out.println(temp1.value);
    }

    public Node midnode(){
        Node temp1 = head;
        Node temp2 = head;

        while (temp2.next != null & temp2.next.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        return temp1;
    }

    public LinkedList mergesort(LinkedList L1){
        if (L1.size == 1){
            return L1;
        }
        Node mid = L1.midnode();

        LinkedList First = new LinkedList();
        First.head = L1.head;
        First.tail = mid;
        First.size = (L1.size+1)/2;

        LinkedList Second = new LinkedList();
        Second.head = mid.next;
        Second.tail = L1.tail;
        Second.size = (L1.size + 1)/2;

        mid.next = null;

        First = mergesort(First);
        Second = mergesort(Second);

        return merge(First,Second);
    }

    public int kthlast(int k){
        System.out.println("ghghj");
        this.display();
        Node slow = this.head;
        Node fast = this.head;

        for (int i = 0; i <k ; i++) {
            fast = fast.next;
        }
        while (fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }
        return slow.value;
    }
}
