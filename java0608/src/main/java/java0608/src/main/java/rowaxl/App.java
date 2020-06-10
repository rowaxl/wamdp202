package java0608.src.main.java.rowaxl;

import java.util.Scanner;

import java0608.src.Access3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        Access3 ac = new Access3();
        ac.name = name;

        ac.printAccess();
        scan.close();
    }
}
