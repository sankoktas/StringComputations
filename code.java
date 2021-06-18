/**This program makes string calculations
 * @author (Fikri San Koktas)
 * @version (18 January 2021)*/
import java.util.Scanner;
public class KFS_StringComputations_Main
{
    public static void main (String[] args)
    {
        //objective a
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String name = in.nextLine();
        String uppercaseCharacters = "";
        for (int i=0; i<name.length(); i++)
        {
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) //I found out that this method is used to get uppercase letters 
            {
                uppercaseCharacters += ch;
            }
        }   
        System.out.println(uppercaseCharacters);

        //objective b 
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.print("Enter string: ");
        line = scan.nextLine();
        for(int i = 0; i<line.length(); i+=2)
        {
            System.out.println(line.charAt(i));
        }

        //objective c 
        Scanner a = new Scanner (System.in);
        System.out.print("Enter string: ");
        String s = a.nextLine();
        String res = "";
        for (char c : s.toCharArray()) //this method returns an array of chars after converting a string into sequence of characters
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c== 'I' || c == 'O' || c == 'U') 
            {
                res = res + '_';
            }
            else
                res = res + c;
        }
        System.out.println(res);

        //objective d 
        int count = 0;
        System.out.println("Enter string :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        for (int i=0 ; i<sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+ count);

        //objective e 
        String input = in.nextLine();
        int sum = 0;
        for(int i = 0; i < input.length(); i++)
        {
            char vowel = input.charAt(i);
            if(vowel == 'a'|| vowel == 'e'|| vowel == 'i'||
            vowel == 'o'|| vowel == 'u' || vowel == 'A' || vowel == 'E'|| vowel == 'I' || vowel == 'O' || vowel == 'U')
            {
                sum++;
                System.out.println("position ->"+i); 
            }
        }
        System.out.println(sum);
    }
}
