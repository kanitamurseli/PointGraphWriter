import javax.swing.*;
import java.awt.*;
public class PointGraphWriter extends JPanel {
private int x_position;
private int y_position;
private int length;
private String x_1 = "";
private String y_1 = "";
int h1,h2,h3,h4,h5,h6;
private JFrame my_frame = new JFrame();
public PointGraphWriter(int width, int height) {
my_frame.getContentPane().add(this);
my_frame.setSize(width, height);
my_frame.setVisible(true);
}
public void paintComponent(Graphics pen) {
setAxes(pen);
int paintPoint1 = setPoint1(pen);
int paintPoint2 = setPoint2(1, paintPoint1, h2, pen);
int paintPoint3 = setPoint2(2, paintPoint2, h3, pen);
int paintPoint4 = setPoint2(3, paintPoint3, h4, pen);
int paintPoint5 = setPoint2(4, paintPoint4, h5, pen);
int paintPoint6 = setPoint2(5, paintPoint5, h6, pen);
}
public void setAxes(int x_pos, int y_pos, int axis_length, String x_label, String y_label) {
x_position = x_pos;
y_position = y_pos;
length = axis_length;
x_1 = x_label;
y_1 = y_label;
this.repaint();
}
//metoda per krijimin e boshteve
private void setAxes(Graphics g) {
g.setColor(Color.red);
g.drawLine(x_position, y_position, x_position+length, y_position);
g.drawLine(x_position, y_position, x_position, y_position-length);
g.drawString("0", x_position, y_position+15);
g.drawString("0", x_position-15, y_position);
g.drawString(x_1, x_position+length, y_position+15);
g.drawString(y_1, x_position-20, y_position-length);
}
public void setPoint1(int height) {
h1 = height;
}
private int setPoint1(Graphics g) {
g.setColor(Color.blue);
g.fillOval(x_position-3, y_position-h1-3, 5,5);
return y_position-h1;
}
public void setPoint2(int height) {
h2 = height;
}
public void setPoint3(int height) {
h3 = height;
}
public void setPoint4(int height) {
h4 = height;
}
public void setPoint5(int height) {
h5 = height;
}
public void setPoint6(int height) {
h6 = height;
}
private int setPoint2(int i, int point1, int h, Graphics g) {
g.setColor(Color.blue);
int x_point_position = x_position + i*(length/5);
int y_point_position = y_position - h;
g.fillOval(x_point_position-3, y_point_position-3, 5, 5);
g.drawLine(x_point_position - (length/5), point1, x_point_position, y_point_position);
return y_point_position;
}
public void setTitle(String s) {
my_frame.setTitle(s);
}
}

