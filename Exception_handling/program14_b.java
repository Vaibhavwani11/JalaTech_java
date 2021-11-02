package Exception_handling;

public class program14_b{

    public static void main(String[] args) throws NoSuchMethodException{

        program14_a obj=new program14_a();
        obj.m1();
        try{
            //obj.m2();
        }
        catch(Exception nm){
            //System.out.println(nm.printStackTrace();;
            nm.printStackTrace();
        }
    }
}
