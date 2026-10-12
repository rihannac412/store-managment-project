 /**
   * Represents a piece of clothng
   */
public class Shirt extends Clothing {
   private String size; // size of shirt

   /**
   * No Argument Constructor
   */
  public Shirt(){
    super("no name", "white", 4.0);
  }

   /**
   * Parameterized Constructor
   */
  public Shirt(String name, String size){
    super(name, "brown", 45.00);
    this.size = size;
  }
 /**
   * Parameterized Constructor(sets name)
   */
  public Shirt(String name){
    super(name,"white",4.0);
  }
   /**
   *accessor method: size
   */
  public String getSize(){
    return size;
  }
   /**
   * mutator emthod:size
   */
  public void setSize(String size){
    this.size = size;
  }
   /**
   * toString() Method Override
   */
   public String toString() {
    return super.toString() + "(Size:" + size + ")" + "\nPrice: $" + getPrice();
   }
}