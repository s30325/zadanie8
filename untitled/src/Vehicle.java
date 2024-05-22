abstract class Vehicle {
    private String make;
    private String model;
    private int year;


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public double calculateFuelEfficiency(){
        return 0;

    }


    public String getMarka() {
        return make;
    }

    public void setMarka(String marka) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return year;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.year = year;
    }



}
