
 interface Polygon {
    String getType();
}
class Triangle implements Polygon {

    @Override
    public String getType() {
        return "Triangle";
    }
}

 class Square implements Polygon {

     @Override
     public String getType() {
         return "Square";
     }
 }

 class Pentagon implements Polygon {

     @Override
     public String getType() {
         return "Pentagon";
     }
 }

  class PolygonFactory {
     public Polygon getPolygon(int numberOfSides) {
         if(numberOfSides == 3) {
             return new Triangle();
         }
         if(numberOfSides == 4) {
             return new Square();
         }
         if(numberOfSides == 5) {
             return new Pentagon();
         }
         return null;
     }
 }

public class MainClass {

    public static void main(String[] args) {
        PolygonFactory polygonFactory = new PolygonFactory();
        System.out.println(polygonFactory.getPolygon(3).getType());
        System.out.println(polygonFactory.getPolygon(4).getType());
        System.out.println(polygonFactory.getPolygon(5).getType());
    }
}
