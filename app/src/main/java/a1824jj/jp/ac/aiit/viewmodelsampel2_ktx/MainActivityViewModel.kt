package a1824jj.jp.ac.aiit.viewmodelsampel2_ktx

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel(), Observable {

    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
    get() = total

    @Bindable
    val inputText = MutableLiveData<String>()

    init {
        total.value = startingTotal
        inputText.value = ""
    }

    fun getTotal() = total.value!!.toString()

    fun setTotal() {
        val input = inputText.value!!.toInt()
        total.value = (total.value)?.plus(input)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        //@Bindable build error fix
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        //@Bindable build error fix
    }

}