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
   * @throws IllegalArgumentException
   */
  public static int rectangle(int height, int width) throws IllegalArgumentException {
    if (height <= 0) {
      throw new IllegalArgumentException("height is not a positive value");
    }

    if (width <= 0) {
      throw new IllegalArgumentException("width is not a positive value");
    }
    return height * width;
  }

  public static int triangle(int height, int base) throws IllegalArgumentException {
    return 0;
  }
}
