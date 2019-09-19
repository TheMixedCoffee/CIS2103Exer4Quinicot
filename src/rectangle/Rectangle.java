/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle;

/**
 *
 * @author quinicotis_cis21035
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    
    private float length = 1.0f;
    private float width = 1.0f;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());
        rect.setLength(10);
        rect.setWidth(5);
        System.out.println(rect.toString());
        System.out.println("Area is:"+ rect.getArea());
        System.out.println("Perimeter is:"+ rect.getPerimeter());
        Rectangle tangle = new Rectangle(3,15);
        System.out.println(tangle.toString());
    }
    
    public Rectangle(){
        
    }
    
    public Rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }
    
    public float getLength(){
        return this.length;
    }
    
    public void setLength(float length){
        this.length = length;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public double getArea(){
        return this.width*this.length;
    }
    
    public double getPerimeter(){
        return 2*(this.width + this.length);
    }
    
    public String toString(){
        return "Rectangle[length=" + this.length + ",width=" + this.width +"]";
    }
}
