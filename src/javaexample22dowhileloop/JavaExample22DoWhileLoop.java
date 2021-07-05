
package javaexample22dowhileloop;

import java.util.Scanner;


public class JavaExample22DoWhileLoop {

    
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int a=100;
        do{
            
            System.out.print("Enter you number or press 0 to exit: ");
            a=GetInteger(in);
            System.out.println("Your number: "+a);
            
            System.out.println();
        }while(a!=0);
        
        System.out.println("Here is out of Do-While-Loop.");
        in.close();
    }// end main
    private static int GetInteger(Scanner input)
    {
        int a=0;
        try{
            a=input.nextInt();
            return a;
        }catch(Exception e)
        {
            input.nextLine();
            System.out.println(e.toString());
            System.out.print("Re-enter your number: ");
            return GetInteger(input);
        }// end catch
    }// end GetInteger
    
}
