import java.util.*;

class PigLatin
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    
    String out = pigLatinize(str);
    System.out.print(out);
  }
  public static String pigLatinize(String str)
  {
    int i = 0;
    String word = "";
    String output = "";
    
    str = str + " ";
    
    while(i < str.length())
    {
      if (str.substring(i, i + 1).compareTo(" ") == 0)
      {
        output += translate(word);
        word = "";
      }
      else
      {
        word += str.substring(i, i+1);
      }
      i++;
    }
    return output;
  }
  public static String translate(String word)
  {
    
    if (word.length() >= 1 &&
        (word.startsWith("a")||
        word.startsWith("e")||
        word.startsWith("i")||
        word.startsWith("o")||
        word.startsWith("u"))&&
        (word.endsWith(".") ||
        word.endsWith(",") ||
        word.endsWith("!") ||
        word.endsWith("?")))
    {
      System.out.print(word.substring(0, word.length() - 1) + "ay" + word.substring(word.length() - 1) + " ");
    }
    
    else if(word.length() >= 1 && 
        word.endsWith(".") ||
        word.endsWith(",") ||
        word.endsWith("!") ||
        word.endsWith("?"))
      System.out.print(word.substring(1, word.length() - 1) + word.substring(0,1) + "ay" + word.substring(word.length() - 1) + " ");
    
    else if (word.length() >= 1 &&
             word.startsWith("a")||
             word.startsWith("e")||
             word.startsWith("i")||
             word.startsWith("o")||
             word.startsWith("u"))
    {
      System.out.print(word + "ay ");
    }
    else
      System.out.print(word.substring(1) + word.substring(0, 1) + "ay ");
    
    return "";
  }
}