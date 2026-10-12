 /**
   * represents piece of clothing
   */
public class Jacket extends Clothing {

  private boolean isLeather; //decides weather it is leather or not

   /**
   * no argument construtor
   */
  public Jacket(){
    super("no name", "black", 35.00);
  }
 /**
   * parameterized construtor(sets name and boolean)
   */
  public Jacket(String name, boolean isLeather){
    super(name,"Mauve", 46.00);
    this.isLeather = isLeather;
  
  double newPrice = 70.00;
  if(isLeather){
  newPrice += 12.30;
  }
setPrice(newPrice);
}
   /**
   * accessor method: isLeather
   */
  public boolean getIsLeather(){
    return isLeather;
  }
   /**
   * mutator method: isLeather
   */
  public void setIsLeather(boolean isLeather){
    this.isLeather = isLeather;
  }
   /**
   * toString() Method Override
   */
  public String toString(){
    String faux = " ";
    if(isLeather){
      faux = "Leather:";
    } else{
      faux = "Leather:";
    }
    return super.toString() +" " + faux + "\nPrice: $" + getPrice();
  }
}