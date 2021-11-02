package Java_basics;

class DataTypes {

    static int x=20; //global
    public static void main(String[] args) {

        int x=10; //local
        boolean b=true;
        char ch='V';
        float f=12.45f;
        double d=343.43134;

        System.out.println(x+", "+b+", "+ch+", "+f+", "+d);
        fun();
    }
    static void fun(){
        System.out.println(x); //global will be printed
    }
}
