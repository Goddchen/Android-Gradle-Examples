package de.goddchen.android.gradle.helloworld;

import de.goddchen.android.gradle.helloworld.R;
import de.goddchen.android.gradle.helloworld.BuildConfig;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.releasemode)).setText("Release Mode: " + (BuildConfig.IS_LIVE ? "live" : "dev"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
