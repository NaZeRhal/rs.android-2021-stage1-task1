package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val list = mutableListOf<Int>()
        var copyArray = sadArray
        while (true) {
            val initSize = copyArray.size
            copyArray.indices.forEach { i ->
                list += copyArray[i]
                if (list.size > 2) {
                    val s = list.size - 1
                    if (list[s - 2] + list[s] < list[s - 1]) {
                        list.removeAt(s - 1)
                    }
                }
            }
            copyArray = list.toIntArray()
            list.clear()
            if (initSize == copyArray.size) {
                break
            }
        }
        return copyArray
    }
}
