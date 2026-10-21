class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Frequency> pq=new PriorityQueue<>((a,b)->b.val-a.val);
        StringBuilder sb=new StringBuilder();
        for(char c:hm.keySet())
        {
            pq.add(new Frequency(c,hm.get(c)));
        }
        while(!pq.isEmpty())
        {
            Frequency top=pq.poll();
            char c=top.ch;
            int count=top.val;
            while(count-->0)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
class Frequency
{
    char ch;
    int val;
    Frequency(char ch,int val)
    {
        this.ch=ch;
        this.val=val;
    }
}