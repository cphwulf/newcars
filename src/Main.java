import javax.crypto.spec.PSource;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "Data/cars1.csv";
        ImportCarsFromFile impCar = new ImportCarsFromFile();
        Garage garage = new Garage("Kurts biler");
        System.out.println("Size: " + garage.getSizeOfGarage());
        impCar.importCars(filename,garage);
        System.out.println("Size: " + garage.getSizeOfGarage());
        for( Bil bil : garage.getBiler()) {
            System.out.println("MODEL: " + bil.getModel());
        }
	// write your code here
    }
}
