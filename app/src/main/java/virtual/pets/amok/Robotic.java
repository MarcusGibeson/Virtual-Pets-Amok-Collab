package virtual.pets.amok;

public class Robotic {
    private String name;
    private int oil;
    private int charge;
    private boolean repair;
    private boolean clean;

    public  Robotic(String name, int oil, int charge ){
        this.name = name;
        this.oil = oil;
        this.charge = charge;

    }
    
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getOil() {
        return oil;
    }



    public void setOil(int oil) {
        this.oil = oil;
    }



    public int getCharge() {
        return charge;
    }



    public void setCharge(int charge) {
        this.charge = charge;
    }



    public boolean isRepair() {
        return repair;
    }



    public void setRepair(boolean repair) {
        this.repair = repair;
    }



    public boolean isClean() {
        return clean;
    }



    public void setClean(boolean clean) {
        this.clean = clean;
    }




}
