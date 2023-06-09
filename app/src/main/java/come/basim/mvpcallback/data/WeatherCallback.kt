package come.basim.mvpcallback.data

import come.basim.mvpcallback.data.WeatherData

interface WeatherCallback {
    fun onWeatherDataFetched(weatherData: WeatherData)
    fun onWeatherDataFetchFailed(errorMessage: String)
}