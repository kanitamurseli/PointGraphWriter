import javax.swing.*;
public class FindDistance {
String input1 = JOptionPane.showInputDialog("Type the value for the initial velocity: ");
String input2 = JOptionPane.showInputDialog("Type the value for the acceleration: ");
int V0 = new Integer(input1).intValue();
int a = new Integer(input2).intValue();
public int DistanceFormula(int time) {
int Distance = V0*time + ((a*time*time)/2);
return Distance;
}
}
