public class Patient {
    private int id;
    private int age;
    private BloodData bd;

    public Patient(){
        id=0;
        age=0;
        bd=new BloodData();
    }
    public Patient(int id, int age, BloodData bd){
        this.id=id;
        this.age=age;
        this.bd=bd;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBd() {
        return bd;
    }

    public String toString(){
        return "ID: "+id+" Age: "+age+" Blood Data: "+bd;
    }
}
