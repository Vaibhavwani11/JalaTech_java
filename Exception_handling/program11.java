package Exception_handling;
import java.io.*;

class Example3
{
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("file.txt");


        BufferedReader br = new BufferedReader(reader);
        String data =null;
        while ((data = br.readLine()) != null)
        {
            System.out.println(data);
        }
        br.close();
    }
}