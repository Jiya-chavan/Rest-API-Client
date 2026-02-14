// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherAPI {
   public WeatherAPI() {
   }

   public static void main(String[] var0) {
      try {
         String var1 = "https://api.open-meteo.com/v1/forecast?latitude=18.5&longitude=73.8&current_weather=true";
         URL var2 = new URL(var1);
         HttpURLConnection var3 = (HttpURLConnection)var2.openConnection();
         var3.setRequestMethod("GET");
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
         StringBuilder var6 = new StringBuilder();

         String var5;
         while((var5 = var4.readLine()) != null) {
            var6.append(var5);
         }

         var4.close();
         JSONObject var7 = new JSONObject(var6.toString());
         JSONObject var8 = var7.getJSONObject("current_weather");
         double var9 = var8.getDouble("temperature");
         double var11 = var8.getDouble("windspeed");
         int var13 = var8.getInt("is_day");
         System.out.println("Weather Report");
         System.out.println("--------------");
         System.out.println("Temperature : " + var9 + " °C");
         System.out.println("Wind Speed  : " + var11 + " km/h");
         System.out.println("Is Day      : " + (var13 == 1 ? "Yes" : "No"));
      } catch (Exception var14) {
         var14.printStackTrace();
      }

   }
}
