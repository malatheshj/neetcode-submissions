class MinStack() {

    var queue1 = ArrayDeque<Int>()
    var minStack = ArrayDeque<Int>()


    fun push(`val`: Int) {
        queue1.addLast(`val`)

        if(minStack.isEmpty()){
            minStack.addLast(`val`)
        }else {
            minStack.addLast(Math.min(`val`, minStack.last()))
        }
    }

    fun pop() {
        queue1.removeLast()
        minStack.removeLast()

    }

    fun top(): Int {
       return queue1.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}
