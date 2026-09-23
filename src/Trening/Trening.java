package Trening;
public class Trening {
    public static void main(String[] args) {
        int integerNumber = 40; // тип переменной - int
        checkMethod((byte)integerNumber);
    }
    // тип параметра метода - byte
    public static void checkMethod(byte importantSmallNumber) {
        System.out.println("Метод работает!");
        System.out.println(importantSmallNumber);
    }
}
