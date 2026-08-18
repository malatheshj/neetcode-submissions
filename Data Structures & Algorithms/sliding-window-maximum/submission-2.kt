class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {

        var l = 0
        var r = 0

        var ans = mutableListOf<Int>()

        var deque = ArrayDeque<Int>() 

        while(r < nums.size){

            while (deque.isNotEmpty() && nums[r] > nums[deque.last()]) {
                 deque.removeLast()
            }

            deque.addLast(r)
           
            if (deque.first() < l) {
                deque.removeFirst()
            }

            if(r - l + 1 == k){
            
                ans.add(nums[deque.first()])
                 l++

            }

            r++
        }

        return ans.toIntArray()


    }
}
