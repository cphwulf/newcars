import javax.crypto.spec.PSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner ms = new Scanner(System.in);
        String filename = "Data/cars1.csv";
        ImportCarsFromFile impCar = new ImportCarsFromFile();
        Garage garage = new Garage("Kurts biler");
        System.out.println("Size: " + garage.getSizeOfGarage());
        impCar.importCars(filename,garage);
        System.out.println("Size: " + garage.getSizeOfGarage());
        for( Bil bil : garage.getBiler()) {
            System.out.println("MODEL: " + bil.getModel());
        }
        ExportCarsToFile exportCarsToFile = new ExportCarsToFile();
        for (Bil b : garage.getBiler()) {
            System.out.println(b.bilToCsv());
        }
        ms.nextInt();

        exportCarsToFile.writeToFile("Data/Volvocars.csv","Volvo",garage);

	// write your code here
    }
}
