class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create the hashmap for store the sorted string and in value store the other anagram in list
        HashMap<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            char arr[] = s.toCharArray();
            Arrays.sort(arr);

            String str1 = new String(arr);

            if(! map.containsKey(str1)){
                map.put(str1,new ArrayList<String>());
            }
            map.get(str1).add(s);
        }
        return new ArrayList<>(map.values());
    }
}