package web.model;

public class Car {

    private int id;
    private String model;
    private int productionYear;


    public Car(int id, String model, int productionYear) {
        this.id = id;
        this.model = model;
        this.productionYear = productionYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

}
