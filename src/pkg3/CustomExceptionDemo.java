package src.pkg3;

class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) throws InvalidAgeException {
        try {
            vote(12);
        } catch (InvalidAgeException e) {
            throw new InvalidAgeException(e.getLocalizedMessage());
        }
    }

    private static void vote(int i) throws InvalidAgeException {
        if (i < 18)
            throw new InvalidAgeException("Invalid age.");
        else
            System.out.println("Valid");
    }
}
