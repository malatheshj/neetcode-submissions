class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var length = 0
        var l = 0
        var r = 0
        var maxFreq = 0

        var count = IntArray(26)

        while(r < s.length){

            var index = s[r] - 'A'
            count[index]++

            maxFreq = Math.max(maxFreq, count[index])

            var replacememt = (r - l + 1) - maxFreq

            if(replacememt > k){
                 count[s[l] - 'A']--
                 l++
            }
             r++

            length = Math.max(length, r - l )
        }

        return length 

    }
}
