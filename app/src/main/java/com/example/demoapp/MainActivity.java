package com.example.demoapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.example.demoapp.model.Movie;
import com.google.gson.Gson;
import android.net.Uri;
import com.google.gson.reflect.TypeToken;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String MovieName;
    private ImageView imageView;
    private LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.movies_container);
        customObject customObject = readJSONFile();
        Gson gson = customObject.gson;
        BufferedReader br = customObject.br;

        Type type = new TypeToken<List<Movie>>(){}.getType();

        List<Movie> movies = gson.fromJson(br, type);

        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            imageView = (ImageView) linearLayout.getChildAt(i);
            String URL = movies.get(i).getPoster();
            URL = URL.replace("http:","https:");
            Picasso.get().load(URL).into(imageView, new Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError(Exception e) {
                    Uri imageURI = Uri.parse("drawable/batman.jpg");
                    imageView.setImageURI(imageURI);
                }
            });
        }
    }

    //Read json file and put everything in gson object
    public customObject readJSONFile(){
        BufferedReader br = null;
        Gson gson = new Gson();
        InputStream ins = getResources().openRawResource(
                getResources().getIdentifier("film",
                        "raw", getPackageName()));

        try {
            br = new BufferedReader(new InputStreamReader(ins,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        customObject customObject = new customObject(gson,br);
        return customObject;
    }
    class customObject{
        Gson gson;
        BufferedReader br;
        customObject(Gson gson,BufferedReader br){
            this.gson = gson;
            this.br = br;
        }
    }
}