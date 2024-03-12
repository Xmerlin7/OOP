public class Circle {
    private double radius;
    private String color;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }
    public double getArea(){
        return ( Math.PI * radius * radius);
    }

    public double getCircumuference(){
        return ( Math.PI * 2 * radius);
    }
    @Override
    public String toString() {
        
        return ("Circle{" + "radius =" + radius + ", clolor = " + color + '}');
    }
}
