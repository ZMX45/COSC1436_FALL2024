import java.util.Arrays;
public class StringLab
{
    public static void main(String [] args)
    {
     String greeting = "Welcome to the Java String Lab!";
     String str = "java string lab!";
     
     System.out.println("String length is: " + greeting.length());

     System.out.println("Character at index 7 is: " + greeting.charAt(7));

     System.out.println(greeting.substring(15,19));

     System.out.println(greeting.toUpperCase());

     System.out.println(greeting.toLowerCase());

     System.out.println(greeting.indexOf("Java"));

     System.out.println(greeting.contains("Lab"));

     System.out.println(greeting.replace("Java","Java Programming"));

     String[] sgreeting = greeting.split(" ");
     System.out.println(Arrays.toString(sgreeting));

     System.out.println(greeting.trim());

     System.out.println(greeting.equals(str));
     System.out.println(greeting.equalsIgnoreCase(str));

     StringBuilder str2 = new StringBuilder("StringBuilder lab");

     str2.append("-Learning Java");

     System.out.println(str2);

     str2.insert(17," is fun ");

     System.out.println(str2);

     str2.delete(26,34);

     System.out.println(str2);

     str2.reverse();
     System.out.println(str2);

     StringBuffer str3 = new StringBuffer("Multithreading Lab");

     str3.append("-Learning Java");

     System.out.println(str3);

     str3.insert(18," is fun");

     System.out.println(str3);

     str3.delete(26,34);

     System.out.println(str3);

     str3.reverse();

     System.out.println(str3);


    }
}
