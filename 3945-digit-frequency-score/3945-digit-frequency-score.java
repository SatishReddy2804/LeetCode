class Solution {
    public int digitFrequencyScore(int n) {
        int temp=n;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(temp>0)
        {
            int digit=temp%10;
            hm.put(digit,hm.getOrDefault(digit,0)+1);
            temp/=10;
        }
        int sum=0;
        for(int i:hm.keySet())
        {
            sum+=i*hm.get(i);
        }
        return sum;
    }
}