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
import java.io.File;
//import java.util.Arrays;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(new File("F:\\Raad\\BRAC\\BRAC\\Semester 8\\CSE420\\Lab\\Lab01\\mavenproject1\\src\\main\\java\\Lab04\\input.txt"));
        
        System.out.println("Methods : ");
        
        while(sc.hasNext()){
            
            String firstLine = sc.nextLine();
            String secondLine = sc.next();
            
            if(firstLine.contains("(") && !firstLine.contains("[") && secondLine.contains("{")){  
                
                String [] a1 = firstLine.split("\\(");
//                System.out.println("a1 = " + Arrays.toString(firstLine.split("\\(")));
                
                String [] a2 = a1[0].split("\\ ");
//                System.out.println("a2 = " + Arrays.toString(a1[0].split("\\ ")));
                
                int a2length = a2.length;        
                
//                System.out.println(a2[a2length-1]);
//                System.out.println(a1[1]);
                
                System.out.println(a2[a2length-1] + "(" + a1[1] + ", return type :  " + a2[a2length-2]);
            
            }  
        }
    }
}
