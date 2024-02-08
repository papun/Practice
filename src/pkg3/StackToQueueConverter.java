package src.pkg3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackToQueueConverter {

    public static Queue<Integer> convertStackToQueue(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        return queue;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);

        Queue<Integer> queue = convertStackToQueue(stack);

        System.out.println("Converted Queue: " + queue);
    }
}