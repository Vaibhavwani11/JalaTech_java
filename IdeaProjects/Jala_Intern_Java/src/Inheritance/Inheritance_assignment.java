package Inheritance;

class InheritanceCode{

    public static void main(String[] args) {

        A obj1=new A();
        obj1.m1();
        obj1.m2();
        obj1.fun(); //fun of class A
        System.out.println(obj1.a+" "+obj1.b+" "+obj1.k+"\n");

        B obj2=new B();
        obj2.b1();
        obj2.b2();
        obj2.fun(); //fun of class B
        System.out.println(obj2.x+" "+obj2.y+" "+obj2.k+"\n");

        C obj3=new C();
        obj3.c1();
        obj3.c2();
        obj3.fun(); //fun of class C
        System.out.println(obj3.m+" "+obj3.n+" "+obj3.k+"\n");

        A ref1=new B();
        ref1.fun();  //method of class B
        System.out.println(ref1.k); //variable of class A

        A ref2=new C();
        ref2.fun(); //method of class C
        System.out.println(ref2.k);//variable of class A

    }
}
class A{

    int a=10,b=11;
    static int k=110;

    void m1(){
        System.out.println("In m1 of A");
    }
    void m2(){
        System.out.println("In m2 of A");
    }
    void fun(){
        System.out.println("fun by A");
        System.out.println(k);
    }
}
class B extends A{

    int x=21,y=22;
    static int k=220;

    void b1(){
        System.out.println("In b1 of A");
    }
    void b2(){
        System.out.println("In b2 of A");
    }
    void fun(){
        System.out.println("fun by B");
        System.out.println(k);
    }
}
class C extends B{

    int m=31,n=32;
    static int k=330;

    void c1(){
        System.out.println("In c1 of A");
    }
    void c2(){
        System.out.println("In c2 of A");
    }
    void fun(){
        System.out.println("fun by C");
        System.out.println(k);
    }

}
