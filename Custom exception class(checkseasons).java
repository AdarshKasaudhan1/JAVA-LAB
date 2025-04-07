// Custom exception class
class Checkseasons extends Exception {
    Checkseasons() {
        super("Please give a valid month...!!!");
    }
}

class ext3 {
    public static void Checkmonth(String month) throws Checkseasons {
        if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("dec") || month.equalsIgnoreCase("feb")) {
            System.out.println("Winter season");
        } else if (month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("may")) {
            System.out.println("Summer season");
        } else if (month.equalsIgnoreCase("jun") || month.equalsIgnoreCase("jul") || month.equalsIgnoreCase("aug")) {
            System.out.println("Rainy season");
        } else if (month.equalsIgnoreCase("sept") || month.equalsIgnoreCase("oct") || month.equalsIgnoreCase("nov")) {
            System.out.println("Autumn season");
        } else {
            throw new Checkseasons();
        }
    }

    public static void main(String[] Args) {
        try {
            Checkmonth("jan"); // Test with a valid month
        } catch (Checkseasons e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
