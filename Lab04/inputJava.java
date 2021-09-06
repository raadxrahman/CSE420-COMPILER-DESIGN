/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author raadr
 */
public class inputJava {
    int x, y;

    public int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public double add() {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(subtract(10, 5));
        inputJava a = new inputJava();
        System.out.println(a.add(20, 10));
    }
}
