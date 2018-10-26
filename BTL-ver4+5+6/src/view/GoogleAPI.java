package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QUANG
 */

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;

public class GoogleAPI {
    public static String getAPI(String sl, String tl, String text) throws JSONException {
        if (text.length() < 1) {
            return "";
        }
        StringBuilder content = new StringBuilder();
        try {
            String urlText = "https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + sl + "&tl=" + tl + "&dt=t&q=" + text;
            URL url = new URL(urlText);

            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection(); // kn moi
            // thanh trinh duyet
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
//       
            return "";
        }

//        Use one line
//        String result=content.toString().split("\\\"", -1)[1];
        // cat JSON
        JSONArray json = new JSONArray(content.toString());
        JSONArray jsonResult = (JSONArray) json.get(0);

        //System.out.println(jsonResult.toString());

      //  System.out.println(jsonResult.length());
        String result = "";
        for (int i = 0; i < jsonResult.length(); i++) {
            JSONArray arrayBlock = (JSONArray) jsonResult.get(i);
            result += arrayBlock.get(0).toString();
        }
        return result;
    }

    public static boolean speakAPI(String lang, String text) {
      
        try {
            URL url = new URL("https://translate.google.com/translate_tts?ie=UTF-8&tl=" + lang + "&client=tw-ob&q=" + text);
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.addRequestProperty("User-Agent", "Mozilla/5.0");
            InputStream audioSrc = urlConn.getInputStream();

            new Player(audioSrc).play();

        } catch (JavaLayerException e) {
//            return false;
        } catch (MalformedURLException e) {
            return false;
        } catch (IOException e) {
            return false;
        }

        return true;

    }
}