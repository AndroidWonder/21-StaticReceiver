/*
 * This receiver is registered in the Manifest. It is started when an
 * SMS_RECEIVED event occurs. It starts a service
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
                 "received SMS_RECEIVED event, starting service");
           Intent intent2 = new Intent(context, TorpedoService.class);
           context.startService(intent2); 
		   
        }

}
