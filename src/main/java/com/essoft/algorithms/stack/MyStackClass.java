package com.essoft.algorithms.stack;

public class MyStackClass<T> {

    private T[] stackArray;

    private int top;

    public MyStackClass() {
        stackArray = (T[]) new Object[1];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    public T peek() {
        if (isEmpty()) {
            System.err.println("Stack is empty, cannot peek");
        }

        return stackArray[top];
    }

    public void push(T item) {
        if (isFull()) {
            resize(2 * stackArray.length);
        }

        stackArray[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            System.err.println("Stack is empty, cannot pop");
            return null;
        }

        T item = stackArray[top];

        stackArray[top] = null;
        top--;

        if (top > 0 && top == stackArray.length / 4) {
            resize(stackArray.length / 2);
        }

        return item;
    }

    private void resize(int newSize) {
        T[] transferArray = (T[]) new Object[newSize];
        System.arraycopy(stackArray, 0, transferArray, 0, top + 1);
        stackArray = transferArray;
    }

    public void printStack() {
        for (T element : stackArray) {
            System.out.println(element);
        }
    }
}