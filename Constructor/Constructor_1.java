public class Constructor_1 {
    String name;
    int age;
    Constructor_1()
    {
        System.out.println("Constructor Called");
    }
    Constructor_1(String name)
    {
        this.name=name;
    } 
    Constructor_1(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Constructor_1 x=new Constructor_1();
        Constructor_1 y=new Constructor_1("Deepak");
        Constructor_1 z=new Constructor_1("Deepak",22);
        System.out.println("Name:"+x.name+" Age:"+x.age);
        System.out.println("Name:"+y.name+" Age:"+y.age);
        System.out.println("Name:"+z.name+" Age:"+z.age);


    }
    
}
