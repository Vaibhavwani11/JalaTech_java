class eight1{  
    private int data=40;  
    private void msg(){System.out.println("Hello java");}  
     
      
     
     public static void main(String args[]){  
       eight1 obj=new eight1();  
       System.out.println(obj.data);//Compile Time Error  
       obj.msg();//Compile Time Error  
       }  
    
}