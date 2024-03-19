public class BloodData {
    private BloodType bloodType;
    private RhFactor rhFactor;

    //default constructor, OPositive
    public BloodData(){
        this.bloodType = BloodType.O;
        this.rhFactor = RhFactor.POSITIVE;
    }
    //constructor, 2 parameters BloodType, RhFactor
    public BloodData(BloodType bloodType, RhFactor rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    //getters and setters
    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public RhFactor getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(RhFactor rhFactor) {
        this.rhFactor = rhFactor;
    }

    //toString
    public String toString(){
        return bloodType+" "+rhFactor;
    }
}