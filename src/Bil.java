import Util.IdFactory;
public class Bil {
    //Make;Model;Horsepower;MPG_City
    //Acura;MDX;265;17
    //Audi;A4 3.0 4dr;220;20
    static int regId=0;
    String make;
    String model;
    int horsePower;
    int mpgCity;
    String regNr;

    public Bil(String make, String model) {
        this.make = make;
        this.model=model;
        //this.doRegId();
        //this.regNr = IdFactory.getRegNr();
        //IdFactory idFactory = new IdFactory();
        IdFactory idFactory = IdFactory.getInstance();
        this.regNr = idFactory.getDynRegNr();
    }

    public Bil(String make, String model, int horsepower, int mpgCity) {
        this.model = model;
        this.make = make;
        this.horsePower=horsepower;
        this.mpgCity=mpgCity;
        this.doRegId();
    }

    public void doRegId() {
        String regNr = "";
        regId++;
        this.regNr = "AB" + regId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMpgCity() {
        return mpgCity;
    }

    public String bilToCsv() {
        String msg = "";
        msg = msg + model + "," + make + "," + regNr;
        return msg;
    }

}
