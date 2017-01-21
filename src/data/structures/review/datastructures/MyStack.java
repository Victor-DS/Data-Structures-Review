/*
 * The MIT License
 *
 * Copyright 2017 Victor Santiago.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package data.structures.review.datastructures;

import data.structures.review.datastructures.interfaces.Node;
import data.structures.review.datastructures.interfaces.Stack;

/**
 *
 * @author Victor Santiago
 */
public class MyStack<T> implements Stack<T> {
    
    private Node<T> head;
    private int size;

    public MyStack() {
        size = 0;
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head != null;
    }

    @Override
    public void push(T item) {
        size++;

        Node newHead = new MyNode(item);
        newHead.setNext(head);
        
        head = newHead;
    }

    @Override
    public T pop() {
        size--;

        T item = head.getData();        
        head = head.getNext();
        
        return item;
    }

    @Override
    public T peek() {
        return head.getData();
    }

    @Override
    public int size() {
        return size;
    }
    
}
