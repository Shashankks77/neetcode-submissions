class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString(); 
        //5#Hello5#WORLD
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = str.indexOf('#',i); // index of # from i starting
            int length = Integer.parseInt(str.substring(i,j)); //5
            String word = str.substring(j+1,j+1+length);  
            ans.add(word);
            i=j+1+length;
        }
        return ans;
    }
}
