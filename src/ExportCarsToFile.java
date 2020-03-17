import java.io.*;

public class ExportCarsToFile {

    public void writeToFile(String filename, String filter, Garage garage) throws IOException {
        File fh = new File(filename);

        if (fh.exists()) {
            try (FileWriter fw = new FileWriter(filename)) {
                BufferedWriter bw = new BufferedWriter(fw);
                for(Bil bil: garage.getBiler()) {
                    if(bil.getModel().equals(filter)) {
                        bw.write(bil.bilToCsv());
                        bw.newLine();
                    }
                }

                fw.close();
                bw.close();
            }
        } else {
            throw new FileNotFoundException();
        }
    }

}
