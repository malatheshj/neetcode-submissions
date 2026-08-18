class Solution {
    fun isValid(s: String): Boolean {

        val stack = ArrayDeque<Char>()

        val map = mapOf(
                ')' to '(',
                '}' to '{',
                ']' to '[')

        for(c in s){
            if (!map.containsKey(c)) {
                stack.addLast(c)
            }else {
                if (stack.isEmpty() || stack.last() != map[c]) {
                    return false
                }

                stack.removeLast()
            }
        }

        return stack.isEmpty()


    }
}
