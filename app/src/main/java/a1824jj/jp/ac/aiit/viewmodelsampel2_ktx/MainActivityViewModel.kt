package a1824jj.jp.ac.aiit.viewmodelsampel2_ktx

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {

    private var total:Int = 0

    init {
        total = startingTotal
    }

    fun getTotal() = total

    fun setTotal(input: Int) {
        total += input
    }

}