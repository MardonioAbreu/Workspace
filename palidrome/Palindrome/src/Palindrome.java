import java.io.PrintStream;
import java.util.Scanner;
class Palindromo
{
    
    private static final PrintStream OUT = System.out;

    public static boolean isPal(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
            return true; 
        
        if(s.charAt(0) == s.charAt(s.length()-1))
        
        return isPal(s.substring(1, s.length()-1));

        return false;
    }

    public static void main(String[]args)
    {
    	
        OUT.println("Ingrese el texto");
        String string = new Scanner(System.in).nextLine();
        if(isPal(string))
            OUT.println(string + " Es un palindromo");
        else
            OUT.println(string + " No es un palindromo");
    }
}