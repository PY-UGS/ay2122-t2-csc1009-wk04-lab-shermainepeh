package Lab4_Q2;

public class StacksOfIntegers {
    private int elements[];
    private int size;

    public StacksOfIntegers() {
        this.elements = new int[16];
    }

    public StacksOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public boolean empty() {
        if (this.size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        return this.elements[getSize()];
    }

    public void push(int value) {
        this.size += 1;
        this.elements[this.size - 1] = value;
    }

        public int pop() {
        this.size--;
        return elements[this.size];
    }

    public int getSize() {
        return this.size;
    }
}