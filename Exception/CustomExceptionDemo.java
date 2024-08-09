package Exception;

public class CustomExceptionDemo {

    public static class CustomException extends Exception {

        public CustomException(String message) {
            super(message);
        }
    }

    public static void validateNumber(int number) throws CustomException {
        if (number <= 0) {
            throw new CustomException("Number must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        try {
            validateNumber(0); // This will trigger the custom exception
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

}
