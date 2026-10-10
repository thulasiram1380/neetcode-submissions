class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++){

            String str = strs[i];
            int[] freq = new int[26];
            for(char ch : str.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder st = new StringBuilder();
            for(int n : freq){
                st.append("#").append(n);
            }
            String res = st.toString();
            map.putIfAbsent(res, new ArrayList<>());
            map.get(res).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
