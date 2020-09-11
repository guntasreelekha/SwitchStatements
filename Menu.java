package Switches1;

import java.io.IOException;

public class Menu {
    public static void main(String args[]) throws IOException {
        char choice;
        do {
            System.out.println("Help on:  ");
            System.out.println("1.  if");
            System.out.println("2.  switch");
            System.out.println("3.  while");
            System.out.println("4.  do while");
            System.out.println("5. for");
            System.out.println("choose one :");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("case constant:");
                System.out.println("statement sequence");
                System.out.println("break;");
                System.out.println("//.....");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '4':
                System.out.println("Do while:\n");
                System.out.println("do {");
                System.out.println("statements;");
                System.out.println("}while(condition);");
                break;
            case '5':
                System.out.println("For :\n");
                System.out.println("for(initialization; condition; iteration)");
                System.out.println("statements;");
                break;
            default:
                System.out.println(" the no choice");
                break;
        }
    }
}
