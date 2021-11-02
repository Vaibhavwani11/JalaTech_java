package Exception_handling;

class Data {

    public void fun() {

        System.out.println("IN FUN");
    }
}
class Demo extends Data {

    public static void main(String[] args) throws NoSuchFieldException {

        Data d = new Data();
        d.fun();
        //d.bar();
    }
}