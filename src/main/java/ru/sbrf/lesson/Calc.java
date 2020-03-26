package ru.sbrf.lesson;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int devide(int a, int b){
        return a / b;
    }

    public short diftypes(byte p1, short p2){
        short a;
        a = (short) (p1 + p2);
        return a;
    }

    public long multipllong(int p1, long p2){
        return p1 * p2;
    }

    public boolean isCharA(char p1){
        String s = "A";
        if(p1 == s.charAt(0)){
            return true;
        }
        else {
            return false;
        }
    }

    public int getMaxNumber(int p1, int p2){
        if (p1 > p2) return p1;
        else{
            return p2;
        }
    }

    public short promot(short a, short b){
        return (short) (a + b);
    }

}
