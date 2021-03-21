package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String emptyString = "";

        int numOp = sc.nextInt();
        Stack<String> stack = new Stack<String>();
        stack.push(emptyString);

        for (int i=0; i<numOp; i++){
            int caseNum = sc.nextInt();

            switch(caseNum){
                case 1:
                    String append = sc.next();
                    emptyString += append;
                    stack.push(emptyString);
                    break;
                case 2:
                    int del = sc.nextInt();
                    emptyString = emptyString.substring(0,emptyString.length()-del);
                    stack.push(emptyString);
                    break;
                case 3:
                    int k = sc.nextInt();
                    System.out.println(emptyString.charAt(k-1));
                    break;
                case 4:
                    stack.pop();
                    emptyString = stack.peek();
                    break;
            }
        }
        sc.close();
    }
}
