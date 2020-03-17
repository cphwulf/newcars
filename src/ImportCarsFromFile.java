import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportCarsFromFile {
    public void importCars(String filname) throws FileNotFoundException{
        //Make;Model;Horsepower;MPG_City
        //Acura (0);MDX (1);265 (2);17 (3)
        //Audi;A4 3.0 4dr;220;20

        File file = new File(filname);
        String line = "";
        String[] lineArr = null;
        if (file.exists()) {
            Scanner ms = new Scanner(file);
            while(ms.hasNextLine()) {
                //læse linje for linje
                line = ms.nextLine();
                //split på karakteren ";"
                lineArr=line.split(";");
                System.out.println("Make: "+ lineArr[0]+ " Model: " + lineArr[1]);
            }
        } else {
            throw new FileNotFoundException();
        }


    }
}
