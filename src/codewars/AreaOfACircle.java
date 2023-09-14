package codewars;

/*  Complete the function which will return the area of a circle with the given radius.
    Returned value is expected to be accurate up to tolerance of 0.01.
    If the radius is not positive, throw IllegalArgumentException.
      Example:
        Circle.area(43.2673);     // returns 5881.248  (± 0.01)
        Circle.area(68);          // returns 14526.724 (± 0.01)
        Circle.area(0);           // throws IllegalArgumentException
        Circle.area(-1);          // throws IllegalArgumentException     */
public class AreaOfACircle {
    public static void main(String[] args) {
        System.out.println(area(43.2673));

    }
    private static double area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

}
