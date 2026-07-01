class Solution {
    public boolean isAnagram(String s, String t) {
        int resultArr[] = new int[26];
        if(s.length()==t.length()){
        for(int i=0; i<s.length();i++){
            char chk1 = Character.toLowerCase(s.charAt(i));
            char chk2 = Character.toLowerCase(t.charAt(i));
            resultArr[chk1-'a']++;
            resultArr[chk2-'a']--;
            }
            for(int num: resultArr){
                if(num!=0){
                    return false;
                }
        }
        return true;
        }else{
            return false;
        }
    }
}
