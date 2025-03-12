import java.io.FileWriter;
import java.io.IOException;

class cardetailsfile {
    public static void main(String[] args) {
        try {
            FileWriter ak = new FileWriter("Car_details.txt");

            ak.write("Car:1 Name: Maruti Suzuki Model: Alto K10 Color: Red Number Plate: KA01AB1234 Country: India Price: ₹4.23 Lakh\n"+
            "Car:2 Name: Maruti Suzuki Model: S-Presso Color: Blue Number Plate: KA02CD5678 Country: India Price: ₹4.26 Lakh\n"+
            "Car:3 Name: Maruti Suzuki Model: Eeco Color: White Number Plate: KA03EF9012 Country: India Price: ₹5.44 Lakh\n"+
            "Car:4 Name: Maruti Suzuki Model: Wagon R Color: Silver Number Plate: KA04GH3456 Country: India Price: ₹5.64 Lakh\n"+
            "Car:5 Name: Maruti Suzuki Model: Celerio Color: Green Number Plate: KA05IJ7890 Country: India Price: ₹5.64 Lakh\n"+
            "Car:6 Name: Maruti Suzuki Model: Ignis Color: Yellow Number Plate: KA06KL1234 Country: India Price: ₹5.85 Lakh\n"+
            "Car:7 Name: Maruti Suzuki Model: Swift Color: Black Number Plate: KA07MN5678 Country: India Price: ₹6.49 Lakh\n"+
            "Car:8 Name: Maruti Suzuki Model: Dzire Color: Grey Number Plate: KA08OP9012 Country: India Price: ₹6.84 Lakh\n"+
            "Car:9 Name: Maruti Suzuki Model: Baleno Color: Orange Number Plate: KA09QR3456 Country: India Price: ₹6.70 Lakh\n"+
            "Car:10 Name: Maruti Suzuki Model: Brezza Color: Brown Number Plate: KA10ST7890 Country: India Price: ₹8.69 Lakh\n"
            );

            ak.close();
            System.out.println("File is created");
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }
    }
}
