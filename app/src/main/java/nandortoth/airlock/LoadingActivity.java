package nandortoth.airlock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Mokus on 7/1/2017.
 */

public class LoadingActivity extends AppCompatActivity {

    public void LoadingGif()
    {
        ImageView imageView = (ImageView) findViewById(R.id.GifView);

        Glide.with(this).load(R.drawable.loading).into(imageView);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        LoadingGif();
    }
}
