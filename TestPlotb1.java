public class TestPlotb1 {
public static void main(String[] args) {
PointGraphWriter e = new PointGraphWriter(300,300);
e.setTitle("Graph of y=x*x+2*x+1");
e.setAxes(50,200, 150, "10", "150");
e.setPoint1(1);
e.setPoint2(9);
e.setPoint3(25);
e.setPoint4(49);
e.setPoint5(81);
e.setPoint6(121);
}
}