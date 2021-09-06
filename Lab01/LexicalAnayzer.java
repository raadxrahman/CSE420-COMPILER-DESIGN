/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

import java.util.*;
import java.io.*;
/**
 *
 * @author raadr
 */
public class LexicalAnayzer {
    public static void main(String[] args) throws FileNotFoundException {

        String s;

        ArrayList<String> keyInput = new ArrayList<>(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", 
                "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", 
                "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", 
                "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));
        
        ArrayList<String> idInput = new ArrayList<>(Arrays.asList("A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", 
                "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"));
        
        ArrayList<String> mathOpInput = new ArrayList<>(Arrays.asList("+", "-", "/", "%", "=", "*", "++", "--"));
        
        ArrayList<String> logOpInput = new ArrayList<>(Arrays.asList(">", "<", ">=", "<=", "||", "&&", "^", "|", "&", "!"));
        
        ArrayList<String> othersInput = new ArrayList<>(Arrays.asList(",", ";", "(", ")", "{", "}", "[", "]"));


        Set<String> keyOutput = new HashSet<>();
        Set<String> idOutput = new HashSet<>();
        Set<String> mathOpOutput = new HashSet<>();
        Set<String> logOpOutput = new HashSet<>();
        Set<String> numValuesOutput = new HashSet<>();
        Set<String> othersOutput = new HashSet<>();


        Scanner sc = new Scanner(new File("F:\\Raad\\BRAC\\BRAC\\Semester 8\\CSE420\\Lab\\Lab01\\mavenproject1\\src\\main\\java\\Lab01\\Values.txt"));

        while (sc.hasNextLine()) {

            s = sc.nextLine();
            String [] splStr = s.split(" ");


            for (String elem : splStr) {
                if (keyInput.contains(elem)) {
                    keyOutput.add(elem);
                } else if (idInput.contains(elem)) {
                    idOutput.add(elem);
                } else if (mathOpInput.contains(elem)) {
                    mathOpOutput.add(elem);
                } else if (logOpInput.contains(elem)) {
                    logOpOutput.add(elem);
                } else if (othersInput.contains(elem)) {
                    othersOutput.add(elem);
                } else if (isAnInt(elem)) {
                    numValuesOutput.add(elem);
                } else if (isADouble(elem)) {
                    numValuesOutput.add(elem);
                }
            }

        }

        System.out.print("Keywords: ");
        keyOutput.forEach(elemKeywords -> {
            System.out.print(elemKeywords + ", ");
        });
        System.out.println();

        System.out.print("Identifiers: ");
        idOutput.forEach(elemIdentifiers -> {
            System.out.print(elemIdentifiers + ", ");
        });
        System.out.println();

        System.out.print("Math Operators: ");
        mathOpOutput.forEach(elemMathOperators -> {
            System.out.print(elemMathOperators + ", ");
        });
        System.out.println();

        System.out.print("Logical Operators: ");
        logOpOutput.forEach(elemLogOperators -> {
            System.out.print(elemLogOperators + ", ");
        });
        System.out.println();

        System.out.print("Numerical Values: ");
        numValuesOutput.forEach(elemNumValues -> {
            System.out.print(elemNumValues + ", ");
        });
        System.out.println();

        System.out.print("Others: ");
        othersOutput.forEach(elemOthers -> {
            System.out.print(elemOthers + " ");
        });
        System.out.println();
    }

    public static boolean isAnInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isADouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
