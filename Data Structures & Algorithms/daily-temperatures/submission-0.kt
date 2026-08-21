class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        var ans = IntArray(temperatures.size){0}

        var stack = ArrayDeque<Int>()

        for(i in 0 until temperatures.size){

            if(!stack.isEmpty()){

              
                while(stack.isNotEmpty() && temperatures[i] >               temperatures[stack.last()]){
                    var previousIndex = stack.removeLast()
                    ans[previousIndex] = i - previousIndex
                }
            }

            stack.addLast(i)

        }


        return ans

    }
}
