class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        var s1a = IntArray(26)
        var s2a = IntArray(26)

        var l = 0
        var r = 0

        for(i in 0 .. s1.length - 1){
            var index = s1[i] - 'a'
            s1a[index]++
        }

        while(r < s2.length){
            
            var index = s2[r] - 'a'
            s2a[index]++

            if(r - l + 1 > s1.length){
                s2a[s2[l] - 'a']--
                l++
            }

           

            if(s1a.contentEquals(s2a)){
                return true 
            }

             r++
        
        }

        return false



    }
}
