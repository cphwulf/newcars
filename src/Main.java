import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "Data/cars1.csv";
        ImportCarsFromFile impCar = new ImportCarsFromFile();
        impCar.importCars(filename);
	// write your code here
    }
}
