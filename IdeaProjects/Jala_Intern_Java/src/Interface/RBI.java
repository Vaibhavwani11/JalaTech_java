package Interface;

interface RBI {

    void goldLoan();
}
class SBI implements RBI{

    public void goldLoan(){

        System.out.println("Facility available");
    }
    public static void main(String[] args) {

        SBI obj=new SBI();
        obj.goldLoan();

    }
}
