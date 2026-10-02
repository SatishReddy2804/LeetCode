class Solution {
    public int reverseDegree(String s) {
        int revdeg=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0;
        for(char ch='a';ch<='z';ch++)
        {
            int idrev=26-i;
            hm.put(ch,idrev);
            i++;
        }
        int product=0;
        for(int j=0;j<s.length();j++)
        {
            product+=(hm.get(s.charAt(j))*(j+1));
            
        }
        return product;
    }
}