package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        return (b - (bill.sum() - bill[k]) / 2).let {
            if (it == 0) "Bon Appetit" else "$it"
        }
    }
}
