class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            String sort = sortString(word);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(word);
        }
        
        return convertToList(map);
    }
    
    private List<List<String>> convertToList( Map<String, List<String>> map){
        List<List<String>> results = new ArrayList<>();
        for(List<String> anagrams : map.values()){
            results.add(anagrams);
        }
        return results;
    }
    
    private String sortString(String word){
        char [] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}