class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        var stack = ArrayDeque<Int>()


        for(s in tokens){
            if (s == "+" || s == "-" || s == "*" || s == "/"){
              
               var right = stack.removeLast()
               var left = stack.removeLast()


               var result = when(s){
                "+" -> left + right
                "-" -> left - right
                "*" -> left * right
                "/" -> left / right
                else -> 0
               }

               stack.addLast(result)
                            
                
                
            }else {
                 stack.addLast(s.toInt())
            }
        }

        return  stack.last()

    }
}
