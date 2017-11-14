package com.eeposit.knockknock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by NTC on 9/14/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent external = new Intent(context,AlarmService.class);
        context.startService(external);
    }
}
