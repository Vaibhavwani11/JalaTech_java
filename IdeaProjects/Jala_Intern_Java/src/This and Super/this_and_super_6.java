class this_and_super_6 {
    void eat(){System.out.println("eating...");}  
}  
class New extends this_and_super_6{ 
void eat(){System.out.println("eating bread...");}
void work(){  
super.eat();
this.eat();    
}  
}  
class TestSuperAndThis{  
public static void main(String args[]){  
New d=new New();  
d.work();  
}}  

