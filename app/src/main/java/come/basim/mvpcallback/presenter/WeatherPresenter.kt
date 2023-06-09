package come.basim.mvpcallback.presenter

import come.basim.mvpcallback.data.WeatherCallback
import come.basim.mvpcallback.data.WeatherData
import come.basim.mvpcallback.data.WeatherModel
import come.basim.mvpcallback.ui.WeatherView

class WeatherPresenter(private val view: WeatherView, ): WeatherCallback {

    private val model = WeatherModel()
    fun fetchWeatherData() {
        model.fetchWeatherData(this)
    }

    override fun onWeatherDataFetched(weatherData: WeatherData) {
        view.displayWeatherData(weatherData)
    }

    override fun onWeatherDataFetchFailed(errorMessage: String) {
        view.displayError(errorMessage)
    }
}