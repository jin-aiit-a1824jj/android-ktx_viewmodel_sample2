package a1824jj.jp.ac.aiit.viewmodelsampel2_ktx

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var total:Int = 0

    fun getTotal() = total

    fun setTotal(input: Int) {
        total += input
    }

}