class Solution {
    fun isValid(s: String): Boolean {

       var stack = ArrayDeque<Char>()

       var map = mapOf(')' to '(' , '}' to '{' , ']' to '[')

       for(c in s){

            if(map.containsKey(c)){
                //close bracket

                if(stack.isEmpty() || stack.last() != map[c]){
                    return false
                }
                stack.removeLast()
                


            }else {
                // opem bracker 

                stack.addLast(c)

            }
            
       }

       return stack.isEmpty()


    }
}
