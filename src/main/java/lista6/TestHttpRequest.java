package lista6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestHttpRequest {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            StringBuffer response = new StringBuffer();
            System.out.println("Podaj nazwę miasta");
            StringBuilder urlBuilder = new StringBuilder();
            urlBuilder.append("http://api.openweathermap.org/data/2.5/weather?q=");
            String miasto = input.nextLine();
            if(miasto.equals("end")){
                break;
            }
            urlBuilder.append(miasto);
            urlBuilder.append("&appid=6332aab10b9961f758664c2a0a24095c");
            String url = urlBuilder.toString();
            try {
                URL obj = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
                connection.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                String json = response.toString();
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                WeatherStation weatherStation = gson.fromJson(json, WeatherStation.class);
                System.out.println(weatherStation);
            } catch (MalformedURLException e) {
                System.out.println("bad url");
            } catch (IOException e) {
                System.out.println("Connection failed");
            }

        }
    }
}
