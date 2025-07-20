package exception;

public class InputValidation extends RuntimeException {
    public InputValidation(String message) {
        super(message);
    }
}
