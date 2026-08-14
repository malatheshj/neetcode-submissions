class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var set = mutableSetOf<Char>()

        var l = 0
        var r = 0
        var length = 0

        while(r < s.length ) {

            if(!set.contains(s[r])){
                set.add(s[r])
                length = Math.max(length, r - l + 1)
                 r++

            }else {
                set.remove(s[l])
                l++
            }
            
        }

        return length

    }
}
