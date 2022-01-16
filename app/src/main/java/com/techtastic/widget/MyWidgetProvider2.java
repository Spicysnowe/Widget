package com.techtastic.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.SmsManager;
import android.widget.RemoteViews;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class MyWidgetProvider2 extends AppWidgetProvider {
//    ******************sms***************
    public static final String destinationAddress = "your number";
    private static final String ACTION_SEND_SMS = "ACTION_SEND_SMS";
    PendingIntent pendingIntent;

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);

        for (int appWidgetId : appWidgetIds) {
            Intent intent = new Intent(context, getClass());
            intent.setAction(ACTION_SEND_SMS);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout2);
            views.setOnClickPendingIntent(R.id.button, pendingIntent);
            appWidgetManager.updateAppWidget(appWidgetId, views);
            Toast.makeText(context, "reached here ", Toast.LENGTH_LONG).show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent.getAction().equals(ACTION_SEND_SMS)) {
            try {
                SmsManager sm = SmsManager.getDefault();
                sm.sendTextMessage(destinationAddress, null, "Hello World!", null, null);
                Toast.makeText(context, "Message Sent", Toast.LENGTH_LONG).show();
            } catch (Exception e) {
                Toast.makeText(context, "error Occured", Toast.LENGTH_LONG).show();
            }
        }
    }
}
