import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;


public class WeatherAPI {
    public static void main(String[] args) {

        try {
            String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=18.5&longitude=73.8&current_weather=true";

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();

            // READ BLOCK
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // PARSE JSON
            JSONObject json = new JSONObject(response.toString());
            JSONObject currentWeather = json.getJSONObject("current_weather");

            double temperature = currentWeather.getDouble("temperature");
            double windSpeed = currentWeather.getDouble("windspeed");
            int isDay = currentWeather.getInt("is_day");

            // STRUCTURED OUTPUT
            System.out.println("Weather Report");
            System.out.println("--------------");
            System.out.println("Temperature : " + temperature + " °C");
            System.out.println("Wind Speed  : " + windSpeed + " km/h");
            System.out.println("Is Day      : " + (isDay == 1 ? "Yes" : "No"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

