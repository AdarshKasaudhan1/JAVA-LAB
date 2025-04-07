// custom exception class
class InvalidAge extends Exception {
    // custom exception constructor
    InvalidAge(String message) {
        super(message);
    }
}

class Custom {
    // Custom Exception Method
    public static void checkAge(int age) throws InvalidAge {
        if (age > 18) {
            throw new InvalidAge("Age is above 18");
        } else {
            System.out.println("Age is Valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
        } catch (InvalidAge e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
