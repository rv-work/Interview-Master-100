class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count1=count(s);
        int[] count2=count(t);
        return Arrays.equals(count1,count2);
    }
    int[] count(String s){
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        return count;
    }
}