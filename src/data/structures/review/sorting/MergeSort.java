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
package data.structures.review.sorting;

import java.util.ArrayList;

/**
 *
 * @author Victor Santiago
 */
public class MergeSort {
    
    public static ArrayList<Integer> sort(ArrayList<Integer> unsortedArray) {
        if(unsortedArray.size() <= 1) 
            return unsortedArray;
        
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        for(int i = 0; i < unsortedArray.size(); i++) {
            if(i < (unsortedArray.size()/2)) {
                left.add(unsortedArray.get(i));
            } else {
                right.add(unsortedArray.get(i));
            }
        }
        
        left = sort(left);
        right = sort(right);
        
        return merge(left, right);
    }
    
    private static ArrayList<Integer> merge(ArrayList<Integer> left, 
            ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        
        while(!left.isEmpty() && !right.isEmpty()) {
            if(left.get(0) <= right.get(0)) {
                result.add(left.remove(0));
            } else {
                result.add(right.remove(0));
            }
        }
        
        while(!left.isEmpty())
            result.add(left.remove(0));
        
        while(!right.isEmpty())
            result.add(right.remove(0));
        
        return result;
    }
    
}