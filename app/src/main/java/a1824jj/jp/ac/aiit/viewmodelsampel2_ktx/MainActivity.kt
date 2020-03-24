package a1824jj.jp.ac.aiit.viewmodelsampel2_ktx

import a1824jj.jp.ac.aiit.viewmodelsampel2_ktx.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.apply {
            resultTextView.text = viewModel.getTotal().toString()
            addButton.setOnClickListener{
                viewModel.setTotal(inputEditText.text.toString().toInt())
                resultTextView.text = viewModel.getTotal().toString()
            }
        }

    }
}
