import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class circleTest {

    circle circle = new circle ();
    double radius = 3;

    @Test
    public void testArea() {
        double area = circle.area(radius);
        assertEquals (area, 28.27,0.1);
            }

     @Test
    public void testPerimeter(){
        double circumference = circle.circumference(radius);
        assertEquals(circumference,18.85,0.1);
     }


}
