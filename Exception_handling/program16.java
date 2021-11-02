package Exception_handling;

import java.io.*;

class NumberFormatExceptionExample
{
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));

        System.out.println("Enter Integer else get NumberFormatException:");
        int x=Integer.parseInt(br.readLine()); //try to enter

        System.out.println("Entered value= "+x);
    }
}