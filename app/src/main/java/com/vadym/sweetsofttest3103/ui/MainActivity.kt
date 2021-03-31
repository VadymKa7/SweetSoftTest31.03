package com.vadym.sweetsofttest3103.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.vadym.sweetsofttest3103.R
import com.vadym.sweetsofttest3103.di.impl.injectViewModel
import com.vadym.sweetsofttest3103.ui.adapter.WeatherAdapter
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         AndroidInjection.inject(this)
        mainViewModel = injectViewModel(viewModelFactory)

        mainViewModel.idName = "san"
        recycler_view.layoutManager = LinearLayoutManager(this)
            mainViewModel.newsList.observe(this, Observer { list ->
                recycler_view.adapter = WeatherAdapter(list)
            })
    }
}