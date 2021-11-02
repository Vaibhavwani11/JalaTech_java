package Exception_handling;

class FinallyBlock{

    public static void main(String args[]){
        try{
            int x=21/2;
            System.out.println(x);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed after try or catch");
        }
        System.out.println("rest of the code...");
    }
}