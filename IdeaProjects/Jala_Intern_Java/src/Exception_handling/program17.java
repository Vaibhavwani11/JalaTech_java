package Exception_handling;

class StringIndexDemo {

    public static void main(String[] args) {

        String str = "VaibhavWani";
        System.out.println("Length of the String: "+str.length());

        for(int i=0; i<str.length(); i++) {

            System.out.print(str.charAt(i)+" ");
        }

        System.out.println(str.charAt(40)); //exception
    }
}