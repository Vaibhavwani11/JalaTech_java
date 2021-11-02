package Exception_handling;

class Example{

    void fun(){
        System.out.println("IN FUN");
    }
}
class NullPointerExceptionDemo{

    public static void main(String[] args) {

        Example obj=null; //NullPointerxception
        obj.fun();
    }
}
