import Vikingel.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testDistance(){
Point a=new Point(0,0);
        Point b=new Point(5,0);
        Assertions.assertEquals(5, a.distanceTo(b));
        Assertions.assertEquals(5, b.distanceTo(a));
        Assertions.assertEquals(0, a.distanceTo(a));
        Assertions.assertEquals(0, b.distanceTo(b));
        Point c=new Point(2.5,0);
        Assertions.assertEquals(a.distanceTo(b),a.distanceTo(c)+c.distanceTo(b));
    }
}
