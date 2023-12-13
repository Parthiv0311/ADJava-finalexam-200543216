package com.georgiancollege.test2;

import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiResponse {
    private User[] users;

    public User[] getUsers() {

        return users;
    }

    // Method to fetch and parse JSON from a remote URL
    public static User[] fetchJsonFromUrl(String urlString) {
        Gson gson = new Gson();
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            try (InputStreamReader reader = new InputStreamReader(con.getInputStream())) {
                ApiResponse response = gson.fromJson(reader, ApiResponse.class);
                return response.getUsers();
            } finally {
                con.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}