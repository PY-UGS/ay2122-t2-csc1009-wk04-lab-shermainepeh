package Lab4_Q2;

public class Modelling_Stacks {
    public static void main(String[] args) {
        StacksOfIntegers stack = new StacksOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
