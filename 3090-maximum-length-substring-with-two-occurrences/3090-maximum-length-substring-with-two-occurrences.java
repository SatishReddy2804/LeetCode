class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int max=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch)>2)
            {
                char c=s.charAt(l);
                hm.put(c,hm.get(c)-1);
                if(hm.get(c)==0)
                {
                    hm.remove(c);
                }
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}