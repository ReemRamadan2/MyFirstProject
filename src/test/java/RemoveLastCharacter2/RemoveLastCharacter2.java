package RemoveLastCharacter2;

public class RemoveLastCharacter2 {

    //method to remove last character
    public String removeLastChar(String s)
    {
//returns the string after removing the last character
        return s.substring(0, s.length() - 1);
    }

    public String removeLastChar2(String s)
    {
//returns the string after removing the last character
        return s.substring(0, s.length() - 2);
    }
}
