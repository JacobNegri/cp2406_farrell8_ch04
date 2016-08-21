// This class discounts prices by 10%
public class Billing
{
   final static double TAX = 0.08;
   public static void main(String[] args)
   {
      double bill;

      bill = computeBill(42.00)
      System.out.println("The total for a photobook that costs $42.00 is $" + bill);

      bill = computeBill(19.99, 3);
      System.out.println("The total for three photobooks that cost $19.99 is $" + bill);

      bill = computeBill(12.50, 8, 20.00);
      System.out.println("The total for eight photobooks that cost $12.50 with a $20 coupon is $" + bill);
   }

   public static double computeBill(double price)
   {
      double bill = price + (price * TAX);
      return bill;
   }

   public static double computeBill(double price, int quantity)
   {
      double bill = price * quantity;
      bill = bill + (bill * TAX);
      return bill;
   }
   public static double computeBill(double price, int quantity, double coupon)
   {
      double bill = price * quantity;
      bill = bill - coupon;
      bill = bill + (bill * TAX);
      return bill;
   }
}