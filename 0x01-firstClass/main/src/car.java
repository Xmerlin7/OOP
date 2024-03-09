public class car {
    String carName;
    int maxSpeed;
    float price;
    int model;

    /* setter function */
    public void setCarName(String carName) {
        this.carName = carName;
    }
     
    //? Getter function */
    public String getCarName() {
        return carName;
    }

    void setModel(int m){
        if (m >= 2015)
            model = m;
        else
            System.out.println("sory, we don't accept that model");
            
    }
}
