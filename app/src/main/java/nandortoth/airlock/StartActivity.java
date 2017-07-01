package nandortoth.airlock;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;


public class StartActivity extends Activity {

    public void BTCheck()
    {
        BluetoothAdapter btAdapter = BluetoothAdapterUtil.getBtAdapter();
        if(btAdapter.isEnabled())

        {
            Intent PRSMenu = new Intent(this, FirstActivity.class);
            PRSMenu.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            PRSMenu.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            PRSMenu.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(PRSMenu);
        }
        else
        {
            Intent BTMenu = new Intent(this, MainActivity.class);
            BTMenu.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            BTMenu.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            BTMenu.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivity(BTMenu);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BTCheck();
    }
}

