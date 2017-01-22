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
package data.structures.review.search;

/**
 *
 * @author Victor Santiago
 */
public class BinarySearch {
    
    public static int search(int value, int[] vector) {
        return binarySearch(value, vector, 0, vector.length);
    }
    
    private static int binarySearch(int value, int[] vector, 
            int startIndex, int endIndex) {
        if(startIndex > (vector.length-1) || endIndex < startIndex) return -1;
        
        int middleIndex = (endIndex + startIndex) / 2;
        int middleValue = vector[middleIndex];
        
        if(middleValue == value) 
            return middleIndex;
        else if(middleValue > value)
            return binarySearch(value, vector, startIndex, middleIndex-1);
        else if(middleValue < value)
            return binarySearch(value, vector, middleIndex+1, endIndex);
        
        return -1;
    }
    
}
