package Abstract_Class;

class AbstractClass extends SBI{
    public static void main(String[] args) {

        SBI obj=new SBI();
        obj.SBI_Interest();
    }
}
abstract class RBI{

    void InterestRate(){
        System.out.println("Ideal Insterest rate from RBI");
    }
    abstract void goldLoan();
}
class SBI extends RBI{

    void SBI_Interest() {

        RBI obj = new SBI();
        obj.InterestRate();
    }
    void goldLoan(){

        System.out.println("Gold loan available");
    }
}