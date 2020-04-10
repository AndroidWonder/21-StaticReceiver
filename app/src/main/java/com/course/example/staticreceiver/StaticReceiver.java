
/*
 * This example uses an SMS received event to start the Broadcast Receiver.
 * To emulate use the emulator's extended control panel. In the Phone
 * controls click the Send Message button. This application must
 * have runtime SMS permission enabled. Go to Settings, etc.
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