class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;

        while(r < s.length()){
            char ch = s.charAt(r);

            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max = Math.max(r-l+1, max);
            r++;
        }
        return max;
    }
}
