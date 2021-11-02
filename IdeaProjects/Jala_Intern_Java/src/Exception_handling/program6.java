package Exception_handling;

class CustomException extends Exception {
    String message;
    CustomException(String str) {
        message = str;
    }
    public String toString() {
        return ("Custom Exception Occurred : " + message);
    }
}
class MainException {
    public static void main(String args[]) {
        try {
            throw new CustomException("This is a custom message given by vaibhav:exception occured brother");
        }
        catch(CustomException e) {
            System.out.println(e);
        }
    }
}