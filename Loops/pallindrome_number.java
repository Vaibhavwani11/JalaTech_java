package Loops;

import java.util.*;
class Palindrome{

    void logic(int num,int i){

        int dup=num;
        int cpy=0;
        int rem=0;
        while(num!=0){

            rem=num%10;
            cpy=cpy*10+rem;

            num=num/10;
        }
        if(cpy==dup)
            System.out.printf("%dth index is palindrome\n",i);

    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Palindrome obj=new Palindrome();

        int []arr=new int[3];

        for(int i=0; i<3; i++){
            System.out.println("Enter number:");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<3; i++){

            obj.logic(arr[i],i);
        }

    }
}
