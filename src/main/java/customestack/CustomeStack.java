package customestack;

public class CustomeStack {
    private Integer[] stack = new Integer[10];
    private int index = 0;

    public void push(Integer value) {
        stack[index] = value;
        index += 1;
    }

    public void pop() {
        stack[index] = 0;
        index--;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null && stack[i] != 0) {
                count += 1;

            }

        }


        return count;
    }
}
