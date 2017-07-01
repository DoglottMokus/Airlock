package nandortoth.airlock;

import android.bluetooth.BluetoothAdapter;

/**
 * Created by Mokus on 7/1/2017.
 */

public class BluetoothAdapterUtil {

    private final static BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();

    public static BluetoothAdapter getBtAdapter() {
        return btAdapter;
    }
}
