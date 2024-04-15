import Vikingel.Point;
import Vikingel.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrinagleTest {
    @Test
    public void testPerim(){
        Triangle tr = new Triangle(new Point(0, 0), new Point(3, 4), new Point(0, 4));
        Assertions.assertEquals(12, tr.perimeter());
        Point zero = new Point(0, 0);
        Triangle tr2 = new Triangle(zero, zero, zero);
        Assertions.assertEquals(0, tr2.perimeter());
    }
}
