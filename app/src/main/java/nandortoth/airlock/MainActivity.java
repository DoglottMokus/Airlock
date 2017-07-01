package nandortoth.airlock;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findBT() {
        BluetoothAdapter btAdapter = BluetoothAdapterUtil.getBtAdapter();
        if (btAdapter == null) {
            return;
        }
        if (!btAdapter.isEnabled()) {
            Intent PRSMenu = new Intent(this, FirstActivity.class);
            PRSMenu.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            PRSMenu.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            PRSMenu.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            btAdapter.enable();

            while (!btAdapter.isEnabled()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            startActivity(PRSMenu);


        }

    }

    public void openBT(View v) {
        findBT();
    }

}
