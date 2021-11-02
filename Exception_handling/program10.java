package Exception_handling;

class ClassNotFoundExample {
    public static void main(String args[]) {
        try {
            Class.forName("Bag.pencil");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}