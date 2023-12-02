package org.ivanpatiuk;

public class MyClass {
    public int fooSum(int x, boolean increaseX, int y, boolean increaseY) {
        if(increaseX) {
            x++;
        } else {
            x -= y % 2;
        }
        if(increaseY) {
            y++;
        } else {
            y += x % 2; // modified -= to +=
        }
        return x + y;
    }
}