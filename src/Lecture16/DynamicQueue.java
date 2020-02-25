package Lecture16;

import Lecture14.CircularQueue;

public class DynamicQueue extends CircularQueue {
    @Override
    public boolean isFull() {
        int[] data = new int[2*ar.length];

        for (int i = 0; i <ar.length ; i++) {
            data[i] = ar[(front+i)%ar.length];
        }
        front = 0;
        ar = data;
        end = size;
        return super.isFull();
    }
}
