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
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//import java.net.URL;

public class DFA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pc = 0;
        while (sc.hasNext()) {
            s = sc.next().toLowerCase();
            int n = s.charAt(0);
            int p = 0;
            System.out.println(s.substring(4));
            String s2 = s.substring(4);
            if (s.length() > 8 && s.startsWith("www.") && s2.contains(".")) {
                for (int i = 4; i < s.length(); i++) {
                    int t = s.charAt(i);

                    if (s.length() > i + 1) {
                        p = s.charAt(i + 1);
                    }                   
                    if ((int) (s.charAt(4)) == 46) {
                        pc++;
                        System.out.println("Web Address_a Invaild, " + pc);
                        break;
                    } else if ((t > 96 && t < 123) || (t > 47 && t < 58)) {
                        continue;
                    } else if (t == 46) {
                        if (p == 46) {
                            pc++;
                            System.out.println("Web Address_b Invalid, " + pc);
                            break;
                        } else {
                            int lastin = s.lastIndexOf(".");
                            String g = s.substring(i + 1);
                            if (s.length() > lastin && g.length() >= 2) {
                                pc++;
                                System.out.println("Valid web address_x, " + pc);
                                break;
                            } else {
                                pc++;
                                System.out.println("Invalid web address_c, " + pc);
                                break;
                            }
                        }
                    } else if (t == 64) {
                        pc++;
                        System.out.println("Invalid web address or email id_x, " + pc);
                        break;
                    }
                }
            } else if (s.contains("@") && s.contains(".")) {
                if ((n > 96 && n < 123)) {
                    for (int i = 0; i < s.length(); i++) {
                        int t = s.charAt(i);
                        if (s.length() > i + 1) {
                            p = s.charAt(i + 1);
                        }
                        if ((t > 96 && t < 123) || (t > 47 && t < 58) || (t == 46)) {
                            continue;
                        } else if (t == 64) {
                            if (p == 46 || p == 64) {
                                pc++;
                                System.out.println("Invalid email id_a, " + pc);
                                break;
                            } else {
                                String g = s.substring(i + 1);
                                if (g.contains(".")) {
                                    pc++;
                                    System.out.println("Valid email id, " + pc);
                                } else {
                                    pc++;
                                    System.out.println("Invalid email id_b, "+ pc);
                                }
                            }
                        }
                    }
                } else {
                    pc++;
                    System.out.println("Invalid email id_c, " + pc);
                }
            } else if (s.endsWith(".com") || s.endsWith(".org") || s.endsWith(".bd") || s.endsWith(".com.bd")) {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    int t = s.charAt(i);
                    if (t == 64) {
                        count++;
                    }
                }
                if (count == 0) {
                    pc++;
                    System.out.println("Invalid web address_d, " + pc);
                }
            } else {
                pc++;
                System.out.println("Invalid web address or email id_y, " + pc);
            }
        }
    }
}

