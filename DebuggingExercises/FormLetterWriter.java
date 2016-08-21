// This class discounts prices by 10%
public class FormLetterWriter
{
   public static void main(String[] args)
   {
      String name1, name2, lname2;
      name1 = "Negri";
      name2 = "Alex";
      lname2 = "Goulding";

      displaySalutation(name1);
      displayLetter();
      displaySalutation(name2, lname2);
      displayLetter();
   }
   public static void displaySalutation(String lastName)
   {
      System.out.println("Dear Mr. or Ms. " + lastName + ",");
   }

   public static void displaySalutation(String firstName, String lastName)
   {
      System.out.println("Dear " + firstName + " " + lastName + ",");
   }
   public static void displayLetter()
   {
      System.out.println("   Thank you for your recent order.\n");
   }
}