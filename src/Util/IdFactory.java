package Util;

public class IdFactory {
    private static int carId = 1;
    private static IdFactory idFactory = null;

    private IdFactory() {
    }

    public static String getRegNr() {
        String regNr = "";
        regNr = "AB"+carId;
        carId++;
        return regNr;
    }

    public static IdFactory getInstance() {
        if (idFactory == null) {
            idFactory = new IdFactory();
        }
        return idFactory;
    }

    public String getDynRegNr() {
        String regNr = "";
        regNr = "AB"+carId;
        carId++;
        return regNr;
    }
}
