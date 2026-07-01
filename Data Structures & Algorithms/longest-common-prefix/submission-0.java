class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; //bat
        for(int i=0; i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){ //bag!=bat //
                prefix = prefix.substring(0,prefix.length()-1); //ba

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}