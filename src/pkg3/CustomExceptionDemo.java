package src.pkg3;

class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        System.out.println("Age is invalid");
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            vote(12);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }

    private static void vote(int i) throws InvalidAgeException {
        if (i < 18)
            throw new InvalidAgeException("Invalid age.");
        else
            System.out.println("Valid");
    }
}
