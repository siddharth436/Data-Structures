package geeksforgeeks;
import java.util.*;



import java.util.*; 

public class spliterator { 
    public static void main(String[] args) 
    { 
  
        // create an LinkedList which going to 
        // contains a list of numbers 
        LinkedList<Shape> shapes = new LinkedList<Shape>(); 
  
        // Add different shape to linkedlist 
        shapes.add(new Shape("Circle", 234)); 
        shapes.add(new Shape("Square", 225)); 
        shapes.add(new Shape("Cone", 543)); 
        shapes.add(new Shape("Rectangle", 342)); 
  
        // create Spliterator of LinkedList 
        // using spliterator() method 
        Spliterator<Shape> spliter = shapes.spliterator(); 
  
        // print result from Spliterator 
        System.out.println("list of Shapes:"); 
  
        // forEachRemaining method of Spliterator 
        spliter.forEachRemaining((Value) -> printDetails(Value)); 
    } 
  
    // print details 
    public static void printDetails(Shape s) 
    { 
        System.out.println("************************"); 
        System.out.println("Shape Name : " + s.shapename); 
        System.out.println("Shape Area : " + s.area); 
    } 
} 
  
// create a shape class 
class Shape { 
  
    // shape class has two attributes 
    String shapename; 
    int area; 
  
    public Shape(String shapename, int area) 
    { 
        super(); 
        this.shapename = shapename; 
        this.area = area; 
    } 
} 


