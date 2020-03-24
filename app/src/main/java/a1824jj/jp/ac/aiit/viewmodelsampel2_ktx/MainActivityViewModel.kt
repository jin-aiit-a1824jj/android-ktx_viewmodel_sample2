package a1824jj.jp.ac.aiit.viewmodelsampel2_ktx

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {

    private var total = MutableLiveData<Int>()

    val totalData: LiveData<Int>
    get() = total

    init {
        total.value = startingTotal
    }

    fun getTotal() = total.value

    fun setTotal(input: Int) {
        total.value = (total.value)?.plus(input)
    }

}