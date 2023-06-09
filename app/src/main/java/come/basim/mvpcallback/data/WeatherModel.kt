package come.basim.mvpcallback.data

class WeatherModel {
    fun fetchWeatherData(callback: WeatherCallback) {
        val weatherData = WeatherData("Sunny", "25.0")
        callback.onWeatherDataFetched(weatherData)
    }
}