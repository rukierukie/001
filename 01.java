public class Cylinder extends Circle {
  private double hight,

public Cylinder() {
  super():
  height = 1.0;
}
public Cylinder(double radius, double h) {
  super(radius);
  this.height = h;
}

public double getHeight(){
  return height;
}  
public void setHeight(double h) {
  this.height = h;
}
public double getArea() {
  return 2*PI*getRadius()*height +
2*super.getArea();
}

public double getVolume() {
   return super.getArea()*height
}


public String toString() {
    return "Cylinder of radius" = " + 
getRadius() + " height = " + height
  }

}






  
