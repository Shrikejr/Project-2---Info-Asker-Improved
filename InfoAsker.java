// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*;
// Single line comment
/* Multi-line comment */
class InfoAsker {

  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static String Zodiac (int month_born, int day_born) {
    String sunSign = "";
    if (month_born == 1) {
      if (day_born < 20) {
        sunSign= "Capricorn";
      } else {
        sunSign= "Aquarius";
      }
    }
    else if (month_born == 2) {
      if (day_born < 19) {
        sunSign= "Aquarius";
      } else {
        sunSign= "Pisces";
      }
    }
      else if (month_born == 3) {
         if (day_born < 21)
            sunSign= "Pisces";
         else
            sunSign= "Aries";
      }
      else if (month_born == 4) {
         if (day_born < 20)
            sunSign= "Aries";
         else
            sunSign= "Taurus";
      }
      else if (month_born == 5) {
         if (day_born < 21)
            sunSign= "Taurus";
         else
            sunSign= "Gemini";
      }
      else if( month_born == 6) {
         if (day_born < 21)
            sunSign= "Gemini";
         else
            sunSign= "Cancer";
      }
      else if (month_born == 7) {
         if (day_born < 23)
            sunSign= "Cancer";
         else
            sunSign= "Leo";
      }
      else if( month_born == 8) {
         if (day_born < 23)
            sunSign= "Leo";
         else
            sunSign= "Virgo";
      }
      else if (month_born == 9) {
         if (day_born < 23)
            sunSign= "Virgo";
         else
            sunSign= "Libra";
      }
      else if (month_born == 10) {
         if (day_born < 23)
            sunSign= "Libra";
         else
            sunSign= "Scorpio";
      }
      else if (month_born == 11) {
         if (day_born < 22)
            sunSign= "scorpio";
         else
            sunSign= "Sagittarius";
      }
      else if (month_born == 12) {
         if (day_born < 22)
            sunSign= "Sagittarius";
         else
            sunSign="Capricorn";
      }
      return sunSign;
    }
  public static void main(String[] args) {

    // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    Scanner user_input = new Scanner(System.in);
    Scanner user_input_name = new Scanner(System.in);
    System.out.println("Basic Info Questionnaire\n\n");
    System.out.println("Enter Your Name (as much as you want!): ");
    String user_name = user_input_name.nextLine();
    int name_length = user_name.length();
    System.out.println("Enter How Old You are: ");
    int user_age = Integer.parseInt(user_input.nextLine());
    System.out.println("Enter Your Primary Pronouns (ex. he/him, she/her, they/them, etc): ");
    String user_pronouns = user_input.nextLine();
    System.out.println("Enter the month you were born in (1-12): ");
    int month_born = Integer.parseInt(user_input.nextLine());
    System.out.println("Enter the day you were born on (1-31): ");
    int day_born = Integer.parseInt(user_input.nextLine());
    /* Took me an embarrassingly long time to figure out how to do this bit in relation to the "Enter Interest Number" loop. At first it was printing "Enter Interest 1" and "Enter Interest 2" at the same time, then processing the response as the first value in the array. Then I did some digging in the Java documentation to find out that I should use Integer.parseInt() */
    System.out.println("Enter How Many Interests You Want To Display: ");
    int interestNumber = Integer.parseInt(user_input.nextLine());

    String arrayOfInterests[] = new String[interestNumber];
    for (int i = 0; i < arrayOfInterests.length; i++) {
      System.out.println("Enter Interest Number " + (i+1) + ": ");
		  arrayOfInterests[i] = user_input.nextLine();
		}
    System.out.println(user_name);
    for (int i = 0; i < name_length; i++) {
		  System.out.print("-");
		}
    System.out.println("\n");
    System.out.println("- " + user_age);
    //I could have just done println for this next bit, but I found it to be more aesthetically pleasing in the output to do it this way.
    System.out.println("- " + user_pronouns + "\n");
    System.out.println("My Sun Sign is " + Zodiac(month_born, day_born));
    System.out.print("I'm Into: " + "\n");
    for (int i = 0; i < arrayOfInterests.length; i++) {
		  System.out.print("  " + arrayOfInterests[i] + "\n");
		}
  }
}
