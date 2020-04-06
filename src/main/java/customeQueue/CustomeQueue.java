package customeQueue;

import java.util.Arrays;

public class CustomeQueue {
    private int[] queue = new int[10];
    private int index = 0;
    private int index0=0;

    public void enque(Integer value) {
        queue[index] = value;
        index += 1;
    }

    public void deque() {
        queue[index0] = 0;
        index0+=1 ;

    }

    public int size() {
        int count = 0;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] != 0) {
                count += 1;
            }
        }

        return count;
    }
}
