package com.tutsplus.matt.bluetoothscanner;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.BlockingDeque;

/**
 * Created by ianzhang on 11/1/15.
 */
public class ConnectThread extends Thread{

    private final BluetoothDevice bTDevice;
    private final BluetoothSocket bTSocket;

    public ConnectThread(BluetoothDevice bTDevice, UUID UUID) {
        this.bTDevice = bTDevice;
        BluetoothSocket tmp = null;

        try {
            tmp = this.bTDevice.createRfcommSocketToServiceRecord(UUID);
        } catch (IOException e) {
            Log.d("CONNECTTHREAD", "Could not start listening for RFCOMM");
        }
        bTSocket = tmp;
    }


}
