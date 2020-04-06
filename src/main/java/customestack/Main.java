package customestack;

public class Main {

    public static void main(String[] args) {
        CustomeStack customeStack=new CustomeStack();
        customeStack.push(1);
        customeStack.push(2);
        customeStack.push(3);
        customeStack.push(4);
        customeStack.push(5);
        System.out.println("Before pop() = "+customeStack.size());
        customeStack.pop();
        customeStack.pop();
        customeStack.pop();
        System.out.println("after pop()= "+customeStack.size());
    }
}
