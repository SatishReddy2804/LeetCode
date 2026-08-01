class Solution {    
    public boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            if(isPalindrome(s))
            {
                return s;
            }
        }
        return "";
    }
}