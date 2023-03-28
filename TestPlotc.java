import javax.swing.*;
public class TestPlotc {
public static void main(String[] args) {
String input1 = JOptionPane.showInputDialog("Type the maximum value of the x axis: ");
String input2 = JOptionPane.showInputDialog("Type the maximum value of the y axis: ");
int x_axis = new Integer(input1).intValue();
int y_axis = new Integer(input2).intValue();
PointGraphWriter e = new PointGraphWriter(300, 300);
String point1 = JOptionPane.showInputDialog("Type the y coordinate of the first point: ");
int y_point1 = new Integer(point1).intValue();
String point2 = JOptionPane.showInputDialog("Type the y coordinate of the second point: ");
int y_point2 = new Integer(point2).intValue();
String point3 = JOptionPane.showInputDialog("Type the y coordinate of the third point: ");
int y_point3 = new Integer(point3).intValue();
String point4 = JOptionPane.showInputDialog("Type the y coordinate of the fourth point: ");
int y_point4 = new Integer(point4).intValue();
String point5 = JOptionPane.showInputDialog("Type the y coordinate of the fifth point: ");
int y_point5 = new Integer(point5).intValue();
String point6 = JOptionPane.showInputDialog("Type the y coordinate of the sixth point: ");
int y_point6 = new Integer(point6).intValue();
e.setTitle("Grafiku juaj");
e.setAxes(30, 150, y_axis, input1, input2);
e.setPoint1(y_point1);
e.setPoint2(y_point2);
e.setPoint3(y_point3);
e.setPoint4(y_point4);
e.setPoint5(y_point5);
e.setPoint6(y_point6);
}
}
