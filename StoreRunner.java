import java.util.Scanner; // used for user input

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    //helps decide which message the user sees
    boolean didBuyItem = false;

    System.out.println("Welcome to my Clothing Store! Looking for anything today?");
    System.out.println("1. Shirt");
    System.out.println("2. Pants");
    System.out.println("3.Jacket");
    System.out.println("> ");
    int userSelection = input.nextInt();
    
// User wants to buy a shirt:
    if(userSelection == 1){
      System.out.println("What is the name of the Shirt?");
      System.out.println("> "); //stylish input??
      input.nextLine(); //Helps prevent bugs
      String name = input.nextLine();
      
      System.out.println("What size are you looking for?");
      System.out.println("> "); // stylish input
      String size = input.nextLine(); //Helps prevent bugs

      // makes shirt
      System.out.println();
      Shirt c = new Shirt(name, size);
      System.out.println("Heres your shirt");
      System.out.println();//blank space
      System.out.println(c);
//helps decide which message the user sees
      didBuyItem = true;
    }
//User wants to buy pants:
    if (userSelection == 2){
      System.out.println("What is the name of the pants?");
      System.out.println("> "); // stylish input
      input.nextLine(); //Helps prevent bugs
      String name = input.nextLine(); //Helps prevent bugs
      
      System.out.println("What is the size?");
      System.out.println("> "); //stylish input
      int waist = input.nextInt(); //Helps prevent bugs
      
      System.out.println("What is the length?");
      System.out.println("> "); //stylsih input
      int length = input.nextInt(); //Helps prevent bugs

      //makes pants
      System.out.println(); //blank space
      Pants p = new Pants(name, waist, length);
      System.out.println("Here is your pants:");
      System.out.println(p);
      //helps decide which message the user sees
      didBuyItem = true;
    }
//User wants to buy a jacket:
    if (userSelection == 3){
      System.out.println("Whats the name of the Jacket?");
      System.out.println("> "); //stylish input
      input.nextLine(); //Helps prevent bugs
      String name = input.nextLine(); //Helps prevent bugs
      
      System.out.println("Is the jakcet leather?");
      System.out.println("> "); //stylish input
      int leather = input.nextInt();
      boolean isLeather = (leather == 1);

      // makes jacket
      System.out.println();//blank space
      Jacket j = new Jacket(name, isLeather);
      System.out.println("Heres your jacket");
      System.out.println(j);
      
      //helps decide which message the user sees
      didBuyItem = true;
    }

    System.out.println();//blank space

    // Last part of interaction saying to come again based on if they bought something or not
    if(didBuyItem){
      System.out.println("Thank you, Please come agian!");
    } else{
      System.out.println("Thanks for looking around. Come again!");
    }
    

    // Closes the Scanner object
    input.close();
    
  }
}