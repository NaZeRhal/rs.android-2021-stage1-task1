package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val out = arrayListOf<String>()
        val brackets = arrayOf('<', '(', '[', '>', ')', ']')
        var count: Int
        var index: Int

        for (i in 0..inputString.lastIndex) {
            for (bracket in 0 until brackets.size / 2) when (inputString[i]) {
                brackets[bracket] -> {
                    index = i + 1
                    count = 0
                    loop@ for (j in i..inputString.lastIndex) {
                        if (inputString[j] == brackets[bracket]) count += 1
                        if (inputString[j] == brackets[bracket + (brackets.size / 2)]) {
                            count -= 1
                            if (count == 0) {
                                out.add(inputString.substring(index until j))
                                break@loop
                            }
                        }
                    }
                }
            }
        }
        return out.toTypedArray()
    }
}
