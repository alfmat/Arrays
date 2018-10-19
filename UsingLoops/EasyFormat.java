import java.text.DecimalFormat;

/**
 *  @author Gary Litvin
 *  @version 1.3, 3/30/06
 *
 *  Appendix to:
 * 
 *  <i>Java Methods A and AB: Object-Oriented Programming and Data Structures</i>
 *  (Skylight Publishing 2006, ISBN 0-9727055-7-0)
 *
 *  EasyFormat puts a right-justified char, String,
 *  or number into a string.
 *
 *  <xmp>
 *  Example:
 *  =======
 *                                                                       Output:
 *  System.out.println("[" + EasyFormat.format('A', 5)        + "]"); // [    A]
 *  System.out.println("[" + EasyFormat.format("ABC", 5)      + "]"); // [  ABC]
 *  System.out.println("[" + EasyFormat.format("ABCDEF", 5)   + "]"); // [ABCDEF]
 *  System.out.println("[" + EasyFormat.format(567, 5)        + "]"); // [  567]
 *  System.out.println("[" + EasyFormat.format(-567, 5)       + "]"); // [ -567]
 *  System.out.println("[" + EasyFormat.format(56.789, 5, 1)  + "]"); // [ 56.8]
 *  System.out.println("[" + EasyFormat.format(-56.789, 5, 1) + "]"); // [-56.8]
 *  System.out.println("[" + EasyFormat.format(56.789, 5, 3)  + "]"); // [56.789]
 *  </xmp>
 */
public class EasyFormat
{
  /**
   *  Returns <code>s</code> padded with spaces on the left to make
   *  a string of a given width (if <code>s.length() < width</code>).
   *  @param width the (minimal) width of the returned string.
   *  @return s if s.length > width;
   *  otherwise returns s padded with spaces on the left.
   */
  public static String format(String s, int width)
  {
    int padding = width - s.length();
    if (padding > 0)
      s = spaces.substring(0, padding) + s;
    return s;
  }

  /**
   *  Returns <code>ch</code> padded with spaces on the left to make
   *  a string of a given width.
   *  @param width the (minimal) width of the returned string.
   *  @return format(String.valueOf(ch), width).
   */
  public static String format(char ch, int width)
  {
    return format(String.valueOf(ch), width);
  }

  /**
   *  Returns <code>m</code> padded with spaces on the left to make
   *  a string of a given width.
   *  @param width the (minimal) width of the returned string.
   *  @return format(String.valueOf(m), width).
   */
  public static String format(int m, int width)
  {
    return format(String.valueOf(m), width);
  }

  /**
   *  Returns <code>x</code> padded with spaces on the left to make
   *  a string of a given width.
   *  @param width the (minimal) width of the returned string.
   *  @return format(String.valueOf(x), width).
   */
  public static String format(double x, int width)
  {
    return format(String.valueOf(x), width);
  }

  /**
   *  Converts <code>x</code> into a string using
   *  a DecimalFormat with the specified precision.  Returns the resulting
   *  string, padded with spaces on the left to make
   *  a string of a given width.
   *  @param width the (minimal) width of the returned string.
   *  @return the formatted and padded string.
   */
  public static String format(double x, int width, int precision)
  {
    DecimalFormat df;
    if (precision > 0)
      df = new DecimalFormat("0." + zeroes.substring(0, precision));
    else
      df = new DecimalFormat("0");

    return format(df.format(x), width);
  }

  private static final String spaces = 
    "                                                                        ";
  private static final String zeroes = 
    "0000000000000000";
}