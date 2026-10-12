 /**
   * Represents a piece of clothing
   */
public class Pants extends Clothing {

  private int pantsSize; //pants size
  private int pantsLength; // pants length

   /**
   * No argument construtor
   */
  public Pants(){
    super("no name","purple", 24.00);
    
  }
 /**
   * Parameterized constructor(sets, nme, size, and length of pants)
   */
  public Pants(String name, int pantsSize, int pantsLength){
    super(name,"light wash",24.00 + (pantsSize * 0.10));
    this.pantsSize = pantsSize;
      this.pantsLength = pantsLength;
  }
 /**
   *accessor method: pants size
   */
  public int getPantsSize(){
    return pantsSize;
  }
 /**
   * mutator method: pants size
   */
  public void setPantsSize(int pantsSize){
    this.pantsSize = pantsSize;
  }
   /**
   * accessor method: pants length
   */
  public int getPantsLength(){
    return pantsLength;
  }
   /**
   * mutator method"pants length
   */
  public void setPantsLength(int pantsLength){
    this.pantsLength = pantsLength;
  }
   /**
   * toString() Method Override
   */
  public String toString() {
    return super.toString() + " (Pants Size:" + pantsSize + ", Pants Length:" + pantsLength +")" + "\nPrice: $" + getPrice();
  }
  
}