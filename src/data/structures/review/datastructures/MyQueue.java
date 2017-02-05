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
import data.structures.review.datastructures.interfaces.Queue;
import java.util.NoSuchElementException;

/**
 *
 * @author Victor Santiago
 */
public class MyQueue<T> implements Queue<T> {
    
    private int size;
    private Node<T> first, last;

    public MyQueue() {
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        size++;
        
        if(first == null) {
            last = new MyNode(element);
            first = last;
        } else {
            last.setNext(new MyNode(element));
            last = last.getNext();
        }
    }

    @Override
    public T first() throws NoSuchElementException {
        return first.getData();
    }

    @Override
    public T dequeue() throws NoSuchElementException {
        size--;
        
        if(first != null) {
            T element = first.getData();
            first = first.getNext();
            
            return element;
        }
        
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }
    
}
