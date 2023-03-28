public class TestPlot {
public static void main(String[] args) {
PointGraphWriter e = new PointGraphWriter(300,300);
e.setTitle("Graph of y = x*x");
e.setAxes(50, 110, 90, "5", "30");
int scale_factor = 3;
e.setPoint1(0 * scale_factor);
e.setPoint2(1 * scale_factor);
e.setPoint3(4 * scale_factor);
e.setPoint4(9 * scale_factor);
e.setPoint5(16 * scale_factor);
e.setPoint6(25 * scale_factor);
}
}
