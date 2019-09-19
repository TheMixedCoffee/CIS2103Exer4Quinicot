/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circle;

/**
 *
 * @author quinicotis_cis21035
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    private double radius = 1.0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circ = new Circle();
        System.out.println(circ.toString());
        System.out.println("Area is = " + circ.getArea());
        System.out.println("Circumference is = " + circ.getCircumference());
        Circle cle = new Circle(5);
        System.out.println(cle.toString());
        System.out.println("Area is =" + cle.getArea());
        System.out.println("Circumference is = " + cle.getCircumference());
    }
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        setRadius(radius);
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    
    public String toString(){
        return "Circle[radius = " + this.radius + "]";
    }
}
