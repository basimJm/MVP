package come.basim.mvpcallback.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import come.basim.mvpcallback.R
import come.basim.mvpcallback.data.WeatherData
import come.basim.mvpcallback.databinding.ActivityMainBinding
import come.basim.mvpcallback.presenter.WeatherPresenter

class MainActivity : AppCompatActivity(), WeatherView {

    private lateinit var presenter: WeatherPresenter
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        presenter = WeatherPresenter(this)

        initListener()


    }

    fun initListener() {
        binding.getButton.setOnClickListener {
            presenter.fetchWeatherData()
        }
    }

    override fun displayWeatherData(weatherData: WeatherData) {
        binding.tvWeather.text = weatherData.condition
        binding.tvWeather2.text = weatherData.temperature.toString()
    }

    override fun displayError(errorMessage: String) {
        Toast.makeText(this, "errorMessage", Toast.LENGTH_SHORT).show()
    }
}