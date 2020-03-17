public class Bil {
    //Make;Model;Horsepower;MPG_City
    //Acura;MDX;265;17
    //Audi;A4 3.0 4dr;220;20
    String make;
    String model;
    int horsePower;
    int mpgCity;

    public Bil(String make, String model) {
        this.make = make;
        this.model=model;
    }

    public Bil(String make, String model, int horsepower, int mpgCity) {
        this.model = model;
        this.make = make;
        this.horsePower=horsepower;
        this.mpgCity=mpgCity;
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
        msg = msg + model + "," + make;
        return msg;
    }

}
