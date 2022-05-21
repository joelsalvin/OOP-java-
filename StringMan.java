import java.util.Scanner;
public class StringMan{
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("String concatination : " +str1.concat(" (full name)"));
        System.out.println("Length of String = "+str1.length());
        System.out.println("Character at First position  = "+str1.charAt(0));
        System.out.println("Index of character 's': " + str1.indexOf('s'));
        System.out.println("String Contains 'el' sequence :"+str1.contains("el"));
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'el' with 'L' : "+str1.replaceAll("el","L"));
        System.out.println("LOWERCASE : "+str1.toLowerCase());
        System.out.println("UPPERCASE : "+str1.toUpperCase());
}
}