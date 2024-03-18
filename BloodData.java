public class BloodData {
    private BloodType bloodType;
    private RhFactor rhFactor;

    public BloodData(){
        this.bloodType = BloodType.O;
        this.rhFactor = RhFactor.POSITIVE;
    }
    public BloodData(BloodType bloodType, RhFactor rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

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

    public String toString(){
        return bloodType+" "+rhFactor;
    }
}