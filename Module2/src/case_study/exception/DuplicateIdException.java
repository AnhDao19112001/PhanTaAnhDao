package case_study.exception;

public class DuplicateIdException extends Exception {
    public DuplicateIdException(String message) {
        super(message);
    }
}
