import javax.swing.*;
public class TestPlotf {
public static void main(String[] args) {
PointGraphWriter e = new PointGraphWriter(300,300);
FindDistance c = new FindDistance();
e.setTitle("Grafiku i formules se distances");
e.setAxes(50,210,150, "10", "150");
e.setPoint1(c.DistanceFormula(0));
e.setPoint2(c.DistanceFormula(2));
e.setPoint3(c.DistanceFormula(4));
e.setPoint4(c.DistanceFormula(6));
e.setPoint5(c.DistanceFormula(8));
e.setPoint6(c.DistanceFormula(10));
}
}