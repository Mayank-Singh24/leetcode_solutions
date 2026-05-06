class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c,0) + 1);
        }
        for(int j = 0; j < t.length(); j++){
            char c1 = t.charAt(j);
            if(!mapS.containsKey(c1)){
                return false;
            }
            mapS.put(c1, mapS.get(c1) - 1);
            if(mapS.get(c1) < 0){
                return false;
            }
        }
        return true;
    }
}