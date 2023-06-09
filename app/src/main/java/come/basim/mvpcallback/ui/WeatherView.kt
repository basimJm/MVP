package come.basim.mvpcallback.ui

import come.basim.mvpcallback.data.WeatherData

interface WeatherView {
    fun displayWeatherData(weatherData: WeatherData)
    fun displayError(errorMessage: String)
}
