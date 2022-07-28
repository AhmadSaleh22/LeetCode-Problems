class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        if(s==null || t==null)
        return false;
        
        int arr [] = new int[26];
        for(int i = 0 ; i < t.length() ; i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        for (int i : arr){
            if(i !=0 )
                return false;
        }
        return true;
    }
}