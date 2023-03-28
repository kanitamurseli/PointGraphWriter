import java.util.*;
import javax.swing.*;
public class TestPlotd {
public static void main(String[] args) {
PointGraphWriter e = new PointGraphWriter(300,300);
JOptionPane.showMessageDialog(null, "Klikoni OK qe te shkruani tempreaturat maksimale te 6 diteve te kaluara!");
String dita1 = JOptionPane.showInputDialog("Temperatura maksimale e dites se pare: ");
String dita2 = JOptionPane.showInputDialog("Temperatura maksimale e dites se dyte: ");
String dita3 = JOptionPane.showInputDialog("Temperatura maksimale e dites se trete: ");
String dita4 = JOptionPane.showInputDialog("Temperatura maksimale e dites se katert: ");
String dita5 = JOptionPane.showInputDialog("Temperatura maksimale e dites se peste: ");
String dita6 = JOptionPane.showInputDialog("Temperatura maksimale e dites se gjashte: ");
int temp1 = new Integer(dita1).intValue();
int temp2 = new Integer(dita2).intValue();
int temp3 = new Integer(dita3).intValue();
int temp4 = new Integer(dita4).intValue();
int temp5 = new Integer(dita5).intValue();
int temp6 = new Integer(dita6).intValue();
e.setTitle("Grafiku i temperaturave maksimale");
e.setAxes(50, 120, 80, "6", "40");
e.setPoint1(2*temp1);
e.setPoint2(2*temp2);
e.setPoint3(2*temp3);
e.setPoint4(2*temp4);
e.setPoint5(2*temp5);
e.setPoint6(2*temp6);
}
}
