/*
 * This example uses a thread to fire 3 photon torpedos,
 * one every 5 seconds. 
 * The service is started by a broadcast receiver.
 */

package com.course.example.staticreceiver;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class TorpedoService extends Service {
	
	MediaPlayer mp;
	Thread t;
	Intent serviceIntent;
	
	
	@Override
	public void onCreate() {
		super.onCreate();
        mp = MediaPlayer.create(this, R.raw.photon);
		Log.e("RECEIVER", "service started");
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        serviceIntent = intent;
   	    t = new Thread(background);
   	    t.start();
   	    return Service.START_STICKY;
    }
	
	@Override
	public void onDestroy() {
		super.onDestroy();
        mp.release();
	}

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    
    Runnable background = new Runnable() {
    	
    	public void run(){
    			
    	Log.e("RECEIVER", "Start thread");
    	
		try{
    			for(int i=0; i<3; i++){  
    				Log.e("RECEIVER", "Loop");
    				mp.seekTo(0);  
    				mp.start();
    				Thread.sleep(5000);
    			}
    			
    			//wait until player is finished before stopping service
    			//while (mp.isPlaying()) {};
    			Log.e("RECEIVER", "Stop Service");
    			stopService(serviceIntent);
    			
    		} catch(InterruptedException e) {Log.e("RECEIVER", "Blowup");}
    	}
    }; 

}
