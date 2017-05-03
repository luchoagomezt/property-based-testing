package ca.cbc.property.based.testing;

/**
 * This class calculates areas
 *
 */
public class Area {
  /**
   * Calculates the area of a rectangle.
   * 
   * @param height height of the triangle
   * @param width width of the triangle
   * @return area of the rectangle
   */
  public static int rectangle(int height, int width) throws IllegalArgumentException {
    if (height < 0) {
      throw new IllegalArgumentException("height is negative");
    }

    if (width < 0) {
      throw new IllegalArgumentException("width is negative");
    }
    return 0;
  }

  public static int triangle(int height, int base) throws IllegalArgumentException {
    return 0;
  }
}
