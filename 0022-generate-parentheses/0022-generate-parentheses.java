class Solution {
    public List<String> rec(int o,int c,int n,List<String> li,StringBuffer sb)
    {
        if(o+c==2*n)
        {
            li.add(sb.toString());
            return li;
        }
        if(o<n)
        {
            sb.append("(");
            rec(o+1,c,n,li,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o)
        {
            sb.append(")");
            rec(o,c+1,n,li,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return li;
    }
    public List<String> generateParenthesis(int n) {
        List<String> li=new ArrayList<>();
        return rec(0,0,n,li,new StringBuffer());
    }
}