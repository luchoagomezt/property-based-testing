package ca.cbc.property.based.testing;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import junit.framework.TestCase;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assume.assumeTrue;
import static org.junit.rules.ExpectedException.none;

import org.junit.runner.RunWith;

/**
 * Unit test for Area.
 */
@RunWith(JUnitQuickcheck.class)
public class PropertyBasedTest extends TestCase {

  @Rule
  public ExpectedException thrown = none();

  @Property(trials = 150, shrink = true)
  public void rectangleNonPositiveHeightOrWidth(int height, int width) {
    assumeTrue(height <= 0 || width <= 0);

    thrown.expect(IllegalArgumentException.class);
    assertEquals(height * width, Area.rectangle(height, width));
  }

  @Property
  public void rectanglePositiveHeightAndWidth(int height, int width) {
    assumeTrue(height > 0 && width > 0);
    assertEquals(height * width, Area.rectangle(height, width));
  }

  @Property
  public void trianglePositiveHeightAndWidth(int height, int base) {
    assumeTrue(height > 0 && base > 0);
    assertEquals((height * base) / 2, Area.triangle(height, base));
  }

  @Property
  public void triangleNonPositiveHeightOrBase(int height, int base) {
    assumeTrue(height <= 0 || base <= 0);

    thrown.expect(IllegalArgumentException.class);
    assertEquals((height * base) / 2, Area.triangle(height, base));
  }
}
