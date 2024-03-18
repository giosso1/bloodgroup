import javax.swing.*;

public class TestPatient {
    public static void main(String[] args){
        BloodType[] bt = {BloodType.A, BloodType.B, BloodType.AB, BloodType.O};
        RhFactor[] rh = {RhFactor.POSITIVE, RhFactor.NEGATIVE};

        Patient p1 = new Patient();
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the patient's id"));
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the patient"));
        int bloodType = JOptionPane.showOptionDialog(null, "What is the blood type of the patient", "Blood Type", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, bt, bt[0]);
        int rhFactor = JOptionPane.showOptionDialog(null, "What is the Rh Factor of the patient", "Rh Factor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, rh, rh[0]);
        Patient p2 = new Patient(id, age, new BloodData(bt[bloodType], rh[rhFactor]));
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the patient's id"));
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the patient"));
        Patient p3 = new Patient(id, age, new BloodData());

        JOptionPane.showMessageDialog(null,"Patient 1: "+p1+"\nPatient 2: "+p2+"\nPatient 3: "+p3);

    }
}
