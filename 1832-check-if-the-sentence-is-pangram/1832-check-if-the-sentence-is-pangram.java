class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<sentence.length();i++)
        {
            hm.put(sentence.charAt(i),hm.getOrDefault(sentence.charAt(i),0)+1);
        }
        for(char c='a';c<='z';c++)
        {
            if(!hm.containsKey(c)||hm.get(c)==0)
            {
                return false;
            }
        }
        return true;
    }
}
