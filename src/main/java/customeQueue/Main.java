package customeQueue;

public class Main {
    public static void main(String[] args) {
        CustomeQueue customeQueue=new CustomeQueue();
        customeQueue.enque(1);
        customeQueue.enque(2);
        customeQueue.enque(3);
        customeQueue.enque(4);

        System.out.println("Size "+customeQueue.size());

        customeQueue.deque();
        customeQueue.deque();
        customeQueue.deque();
        customeQueue.deque();

        System.out.println("Size "+customeQueue.size());
    }




}
