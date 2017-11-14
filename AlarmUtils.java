package com.eeposit.knockknock;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import java.util.Random;

public class AlarmUtils {
    public static void setAlarm(Context context, Intent intent)
    {
        Random random = new Random();
        AlarmManager alarmManager= (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        PendingIntent pendingIntent= PendingIntent.getBroadcast(context,random.nextInt(1213312211),intent,PendingIntent.FLAG_UPDATE_CURRENT);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+10000, pendingIntent);
        } else {
            alarmManager.setExact(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+10000, pendingIntent);
        }
    }

    public static void cancelAlarm(Context context,Intent intent,int id)
    {
        AlarmManager alarmManager= (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        PendingIntent pendingIntent= PendingIntent.getBroadcast(context,id,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.cancel(pendingIntent);
    }

}
