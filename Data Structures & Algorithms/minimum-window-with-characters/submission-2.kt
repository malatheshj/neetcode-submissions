class Solution {
    fun minWindow(s: String, t: String): String {
        
        var l = 0
        var r = 0
        var ans = ""
        var have = 0
        var need = t.length

        var s1 = IntArray(52)
        var t1 = IntArray(52)

        for(i in t.indices){
            var index = if(t[i] in 'a' .. 'z'){
                    t[i] - 'a' + 26
            }else {
                t[i] - 'A' 
            }
            t1[index]++
        }

        while(r < s.length){

            var index = if(s[r] in 'a' .. 'z'){
                s[r] - 'a' + 26
            }else {
                 s[r] - 'A'
            }
            s1[index]++

            if(s1[index] <= t1[index]){
                have++
            }

            while(have == need){
                if(r-l+1 < ans.length || ans.isEmpty()){
                    ans = s.substring(l, r+1)
                }

                var leftIndex = if(s[l] in 'a' .. 'z'){
                s[l] - 'a' + 26
                }else {
                 s[l] - 'A'
                }
                s1[leftIndex]--

                if(s1[leftIndex] < t1[leftIndex]){
                    have--
                }
                l++

            }

            r++
        }

        return ans


       }  
    }

