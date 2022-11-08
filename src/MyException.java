public class MyException extends RuntimeException{
    public MyException() {
        System.out.println(getMessage());
    }
}
