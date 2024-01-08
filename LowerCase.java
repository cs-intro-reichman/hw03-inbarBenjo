/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

  
    public static String lowerCase(String s) 
    {
        String ans= "";
        if ( s.charAt(0) >= 65 && s.charAt(0) < 91)
        {
             ans = "" + (char) (s.charAt(0) + 32);
        }
        else {

              ans = "" + (char) (s.charAt(0));
        }
        
        int i = 1;  
        while ( i < s.length())
        {
            char ch = s.charAt(i);       
            if (ch == ' ')
            {
                if ( (s.charAt(i+1) >= 65 ) && (s.charAt(i+1) < 91) )
                {
                     ans = ans + ch + (char) (s.charAt(i+1) + 32);
                }
                else 
                {
                    ans = ans + ch + s.charAt(i+1); 
                }
                   i ++ ; 
                
            }
                else {

                      if ((ch >= 65 ) && (ch < 91 ))
                       {
                         ans = ans + (char) (s.charAt(i) + 32); 
                       } 
                       else 
                        {
                            ans = ans + ch ; 
                        }
                     }
            i ++ ; 
        }

        return ans;
    }
}