class A{  
    void msg(){System.out.println("Hello");}  
  } 

  class eight2{  
    public static void main(String args[]){  
     A obj = new A();//Compile Time Error  
     obj.msg();//Compile Time Error  
    }  
  }  