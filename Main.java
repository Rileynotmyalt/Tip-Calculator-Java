import java.util.Scanner;

class Main {
  /** Calculates Total Price given a percent added tip */
  public static double tipCalculator(double price,double percentTip) {
    return price * (1 + percentTip);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true){
      System.out.print("Price: ");
      double price = scan.nextDouble();
      System.out.print("Tip Percent: ");
      double tip = scan.nextDouble() / 100;
      System.out.println("Total: $" + tipCalculator(price,tip) + "\n");
    }
  }
}