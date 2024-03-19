import javax.swing.*;

public class TestBloodData {
    public static void main(String[] args) {
        //get info from user, BloodType and RhFactor
        BloodType[] bt = {BloodType.A, BloodType.B, BloodType.AB, BloodType.O};
        RhFactor[] rh = {RhFactor.POSITIVE, RhFactor.NEGATIVE};
        int bloodType = JOptionPane.showOptionDialog(null, "What is the blood type", "Blood Type", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, bt, bt[0]);
        int rhFactor = JOptionPane.showOptionDialog(null, "What is the Rh Factor", "Rh Factor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, rh, rh[0]);

        //create two BloodData objects, display them
        BloodData b1 = new BloodData();
        BloodData b2 = new BloodData(bt[bloodType], rh[rhFactor]);
        JOptionPane.showMessageDialog(null, "Blood Data 1: "+b1+"\nBlood Data 2: "+b2);

        //set BloodData b1 to have the same data as b2
        //display them
        b1.setBloodType(b2.getBloodType());
        b1.setRhFactor(b2.getRhFactor());
        JOptionPane.showMessageDialog(null, "Blood Data 1: "+b1+"\nBlood Data 2: "+b2);

    }
}
