package exceptionhandling;

//unchecked exception extends RunTimeException class - compiler will not force to handle immedeatly
//checked exception extends Exception class - compiler will force to handle immedeatly
public class InsuffientBalanceAmountException extends Exception{

    public InsuffientBalanceAmountException(String message){
        super(message);
    }
}

