package ca.cbc.property.based.testing;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class ExampleBased {

  @Test()
  public void areaNonZeroHeight() {
    AssertJUnit.assertEquals(Area.rectangle(5, 0), 0);
  }

  @Test()
  public void testAreaNonZeroWidth() {
    AssertJUnit.assertEquals(Area.rectangle(0, 5), 0);
  }

  @Test()
  public void testAreaNonZeroWidthAndHeight() {
    AssertJUnit.assertEquals(Area.rectangle(5, 5), 25);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testAreaNegativeWidth() {
    Area.rectangle(5, -5);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void testAreaNegativeHeight() {
    Area.rectangle(-5, 5);
  }

  @Test()
  public void testAreaBigInteger() {
    AssertJUnit.assertEquals(Integer.MAX_VALUE * 5, Area.rectangle(Integer.MAX_VALUE, 5));
  }
}
