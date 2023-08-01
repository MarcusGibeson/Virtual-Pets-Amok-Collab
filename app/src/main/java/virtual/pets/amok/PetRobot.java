package virtual.pets.amok;

public class PetRobot extends Pet{
    private int oil;
    private int charge;
    private boolean repair;
    private boolean clean;

    public PetRobot(int oil, int charge) {
        this.name = name;
        this.oil = oil;
        this.charge = charge;
        this.petId = petId;
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

    //method for clean and repair
public boolean needClean(int oil,boolean clean){
    this.oil = oil;
    this.clean = clean;
    if(oil<=20){
        clean = false;
        return clean;
    }
    clean = true;
    return clean;
}
public boolean needRepair(int charge,boolean repair){
    this.charge = charge;
    this.repair = repair;
    if(charge<=20){
        repair = false;
        return repair;
    }
    repair = true;
    return repair;
}

@Override
public String toString(){
    return (getOil()+""+ isClean()+""+getCharge()+" "+ isRepair()+"Still coding");
}

}
