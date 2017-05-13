
/*
 * This example uses a low battery event to start the Broadcast Receiver.
 * To emulate use the emulator's extended control panel. In the battery
 * controls set Charger Connection to none; Battery Status to not charging.
 * Move the charge level to below 50%. The low battery event should occur.
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