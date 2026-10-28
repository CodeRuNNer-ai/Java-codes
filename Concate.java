import java.util.*;
public class Concate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fName = sc.next();
        String lName = sc.next();
        String fullName = fName + " " + lName;
        System.out.println("Hello " + fullName);

        //STRINGS METHODS 
        System.out.println(fullName.length()); //Returns Th length of string

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i)); //Returns the character at the specified index
        }
         System.out.println(fullName.charAt(4)); //Return Value at position n

        String N1 = "Tony";
        String N2 = "Stark";
        if(N1.compareTo(N2) == 0){   //Compares two strings based on Unicode value of each character in the strings
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


                      //SUBSTRING IN JAVA
        String sentence = "I am Ironman";
        String name = sentence.substring(5);
        String cutName = sentence.substring(5, 8);
        System.out.println(name);
        System.out.println(cutName);
    }
}