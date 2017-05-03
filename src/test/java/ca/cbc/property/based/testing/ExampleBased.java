package ca.cbc.property.based.testing;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class ExampleBased {

  @Test(expectedExceptions = { IllegalArgumentException.class })
  public void positveHeight() {
    Area.rectangle(5, 0);
  }

  @Test(expectedExceptions = { IllegalArgumentException.class })
  public void positiveWidth() {
    Area.rectangle(0, 5);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void negativeWidth() {
    Area.rectangle(5, -5);
  }

  @Test(expectedExceptions = {IllegalArgumentException.class})
  public void negativeHeight() {
    Area.rectangle(-5, 5);
  }

  @Test()
  public void positveWidthAndHeight() { {
    AssertJUnit.assertEquals(Area.rectangle(5, 5), 25);
  }

  @Test()
  public void bigHeight() {
    AssertJUnit.assertEquals(Integer.MAX_VALUE * 5, Area.rectangle(Integer.MAX_VALUE, 5));
  }

  @Test()
  public void bigWidth() {
    AssertJUnit.assertEquals(5 * Integer.MAX_VALUE, Area.rectangle(5, Integer.MAX_VALUE));
  }
}
