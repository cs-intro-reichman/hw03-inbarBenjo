/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String ans = "" + (char) (s.charAt(0)); 
        int lengthS= s.length();
        int i = 1; 
        char sChar = 0 ; 
        Boolean available = false; 

        // Same here, use for.
        while (i < lengthS)
        {
             
            sChar =  (char) s.charAt(i);
            if ( sChar == ' ')
            {
                ans = ans + sChar; 
            }

                else {

                      if (ans.indexOf(sChar) == -1)
                         {    
                
                            ans = ans + sChar;    
                        }
                 }

            i++ ;

        }



      return ans;
    }
}
