
/*
 * This example uses a low battery event to start the Broadcast Receiver.
 * To emulate use the emulator's extended control panel. In the Phone
 * controls click the Send Message button.
 */

package com.course.example.staticreceiver;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class StaticReceiver extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.e("RECEIVER", "app started");
    }
}