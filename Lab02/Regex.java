/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab02;

/**
 *
 * @author raadr
 */
import java.util.*;

public class Regex{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of values to be taken, followed by Web or Email addresses:");
        int inputsCount = sc.nextInt();

        String s1[] = new String[inputsCount];
        int eC = 0;
        Stack<Integer> webC = new Stack<>();
        Stack<Integer> emailC = new Stack<>();

        for (int i = 0 ; i < inputsCount ; i++){
            s1[i] = sc.next();
        }

        for (int i = 0 ; i < inputsCount ; i++){
            if(s1[i].startsWith("www.") && s1[i].endsWith(".com")){
                String[] check = s1[i].split("\\." );
                char[] c = check[1].toCharArray();
                for(int j = 0 ; j < c.length ; j++){
                    int a = (int) c[j];
                    if((a>=65 && a <=90) || (a>=97 && a<=122) || (a>=48 && a<=57)){                                               //65-90 = A-Z, 97-122 = a-z, 48-57 = 0-9 ASCII 
                    }
                    else{
                        eC++;
                    }
                }
                if (eC==0){
                    webC.push(i);
                }
                else{
                    eC = 0;
                }
            }
            else if(s1[i].matches("^[a-zA-Z-]+[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+")){
                emailC.push(i);
            }
        }
        System.out.print("Email, ");
        for(int i = 0 ; i <= emailC.size() ; i++){
            System.out.println(emailC.pop()+1);
        }
        System.out.print("Web, ");
        for(int i = 0 ; i <= webC.size() ; i++){
            System.out.println(webC.pop()+1);
        }
    }
}