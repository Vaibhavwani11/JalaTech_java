package Exception_handling;

import java.util.Scanner;

class InputMismatchExceptionExample
{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Integer else get InputMismatchException:");
        int x=sc.nextInt(); //try to enter

        System.out.println("Entered value= "+x);
    }
}