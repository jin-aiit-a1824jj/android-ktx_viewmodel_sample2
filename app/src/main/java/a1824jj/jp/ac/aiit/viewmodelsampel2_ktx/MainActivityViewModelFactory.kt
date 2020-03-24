package a1824jj.jp.ac.aiit.viewmodelsampel2_ktx

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainActivityViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknow View Model Class")
    }
}