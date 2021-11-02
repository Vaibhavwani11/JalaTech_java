package Exception_handling;

class ArrayIndexOutOfBoundException{

    public static void main(String[] args) {

        String[] arr = {"Vaibhav","Kunal","Mahesh","Shubham"};

        for(int i=0; i<=arr.length;i++) {

            System.out.println(arr[i]);
        }

    }

}