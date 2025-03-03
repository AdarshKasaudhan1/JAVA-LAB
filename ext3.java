//custom exception :using message
/*class Checkseasons extends Exception{// custom exception class 01
    Checkseasons(){
        super ("please give valid month...!!!");
    }
}
class ext3 {
        public static void Checkmonth(String month) throws Checkseasons{
            if(month =="jan"|| month == "dec"|| month =="feb"){
                System.out.println("winter season");
            }
            else if (month == "Mar"||month =="Apr"||month=="May"){
                System.out.println("summer season");
            }
            else if (month == "jun"||month =="jul"||month =="aug"){
                System.out.println("Rainy season");
            }
            else if (month == "sept"||month =="oct"||month =="nov"){
                System.out.println("Autumn season");
            }
            else{
                throw new Checkseasons();
            }
        }
        public static void main(String[]Args){
            try{
             Checkmonth("jan");
            }
            catch(Checkseasons e){
                System.out.println("caught exception: "+e.getMessage());
            }
        }
}*/
class Checkseasons extends Exception { // custom exception class 01
    Checkseasons() {
        super("please give valid month...!!!");
    }
}

class ext3 {
    public static void Checkmonth(String month) throws Checkseasons {
        if (month.equals("jan") || month.equals("dec") || month.equals("feb")) {
            System.out.println("winter season");
        } else if (month.equals("Mar") || month.equals("Apr") || month.equals("May")) {
            System.out.println("summer season");
        } else if (month.equals("jun") || month.equals("jul") || month.equals("aug")) {
            System.out.println("Rainy season");
        } else if (month.equals("sept") || month.equals("oct") || month.equals("nov")) {
            System.out.println("Autumn season");
        } else {
            throw new Checkseasons();
        }
    }

    public static void main(String[] Args) {
        try {
            Checkmonth("jan");
        } catch (Checkseasons e) {
            System.out.println("caught exception: " + e.getMessage());
        }
    }
}

