package userDefinedException;

public class InvalidAgeException extends Throwable{

    //Constructor
    InvalidAgeException (String message){
        super(message);
    }
}
