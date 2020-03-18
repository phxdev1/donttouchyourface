package me.phxdev.donttouchyourface;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class ProximityDetectionService extends Service {
    public ProximityDetectionService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
