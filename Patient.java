public class Patient {
    private int id;
    private int age;
    private BloodData bd;

    //default constructor, ID=0, Age=0, BloodData= OPositive
    public Patient(){
        id=0;
        age=0;
        bd=new BloodData();
    }
    //constructor, 3 parameters, id, age, BloodData
    public Patient(int id, int age, BloodData bd){
        this.id=id;
        this.age=age;
        this.bd=bd;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBd() {
        return bd;
    }

    //toString
    public String toString(){
        return "ID: "+id+" Age: "+age+" Blood Data: "+bd;
    }
}
