package org.example.task2;

public class IntStack {
    private int[] stack;
    private int top;

    public IntStack() {
        stack = new int[10];
        top = 0;
    }

    public void push(int value) {
        if (top == stack.length) {
            System.out.println("Стек переповнений!");
            return;
        }
        stack[top] = value;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек порожній!");
            return 0; // або будь-яке значення за замовчуванням
        }
        top--;
        return stack[top];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек порожній!");
            return 0;
        }
        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void clear() {
        top = 0;
    }

    @Override
    public String toString() {
        String result = "IntStack: [";
        for (int i = 0; i < top; i++) {
            result += stack[i];
            if (i < top - 1) result += ", ";
        }
        return result + "]";
    }
}