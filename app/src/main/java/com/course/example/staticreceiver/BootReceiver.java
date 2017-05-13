/*
 * This receiver is registered in the Manifest. It is started when a
 * BATTERY_LOW event occurs. It starts a service
 * and writes to the log.
 */

package com.course.example.staticreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class BootReceiver extends BroadcastReceiver {
	
	@Override
	public void onReceive(Context context, Intent intent) {	
		  
           Log.e("RECEIVER",
                 "received BATTERY_LOW event, starting service");
           Intent intent2 = new Intent(context, TorpedoService.class);
           context.startService(intent2); 
		   
        }

}
