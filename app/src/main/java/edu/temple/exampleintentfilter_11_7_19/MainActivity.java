package edu.temple.exampleintentfilter_11_7_19;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            // clicking this button the goal is to have the user see the comic, so it's a VIEW ACTION
            Intent viewIntent = new Intent(Intent.ACTION_VIEW); // view intent
            viewIntent.setData(Uri.parse("https://xkcd.com/2225"));
            if (viewIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(viewIntent); // because you're trying to view a URL and you're 100% sure device has a browser, but in reality check if not null with
            }
        });
    }
}
