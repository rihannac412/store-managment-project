/**
*Represents a clothing store
*/

public class Clothing {

  private String name; //name of the clothing piece
  private String color; //the color of the piece
  private double price; //the price of the piece

  /**
  *First no argument constructor 
  */
  public Clothing(){
  this("no name", "black", 0.0);
  }
  
 /**
   * First parameterized constructor
   */
  public Clothing(String name,String color,double price){
    this.name = name;
    this.color = color;
    this.price = price;
  }
  
 /**
   * accessor method: name
   */
  public String getName(){
    return name;
  }
   /**
   * mutator method: name
   */
  public void setName(String name){
    this.name = name;
  }
 /**
   * accessor method: color
   */
  public String getColor(){
    return color;
  }
 /**
   * mutator emthod: color
   */
  public void setColor(){
    this.color = color;
  }
   /**
   * accessor method: price
   */
   public double getPrice() {
    return price;
  }

  /**
   * Mutator Method: price
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * toString() Method Override
   */
  public String toString() {
    return name + " " + color;
  }
 
}