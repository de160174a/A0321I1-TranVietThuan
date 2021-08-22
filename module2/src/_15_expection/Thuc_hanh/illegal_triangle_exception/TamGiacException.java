package _15_expection.Thuc_hanh.illegal_triangle_exception;

public class TamGiacException extends Exception {
    public TamGiacException(String message){
        super(message);
    }
    public TamGiacException(){
        super("Invalid");
    }
}