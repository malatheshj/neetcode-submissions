class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        var map = mutableMapOf<Int, Int>()

        var result = mutableListOf<Int>()

        val buckets = Array(nums.size+1) {mutableListOf<Int>()}


        for(num in nums ){
            map.put(num, map.getOrDefault(num,0)+1)
        }

        for( (k,v) in map){

            buckets[v].add(k)
        }

        for(i in buckets.size - 1 downTo 0){

            for (num in buckets[i]) {
                result.add(num)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }

        return result.toIntArray()

    }
}
