class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl){
            return false;
        }
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(char ch : s.toCharArray()){
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!hmap.containsKey(ch)){
                return false;
            }
            hmap.put(ch,hmap.get(ch)-1);
            if(hmap.get(ch)==0){
                hmap.remove(ch);
            }
        }
        return hmap.isEmpty();


    }
}
