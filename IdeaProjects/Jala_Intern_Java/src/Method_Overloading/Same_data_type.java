package Method_Overloading;

class Overloading{

    public static void main(String[] args) {

        Overloading obj=new Overloading();
        obj.add(10,20);
        obj.add(10,20,30);
    }
    void add(int x,int y){

        System.out.println(x+y);
    }
    void add(int x,int y,int z){

        System.out.println(x+y+z);
    }
}
