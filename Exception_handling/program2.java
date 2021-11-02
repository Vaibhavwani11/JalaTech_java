package Exception_handling;

class ArithmeticExceptionTest2 {
    public static void main(String[] args) {
        int a = 0, b = 10 ;
        int c = 0;
        try {
            c = b/a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Exception handled");
        }
        System.out.println("Value of c :"+ c);
    }
}