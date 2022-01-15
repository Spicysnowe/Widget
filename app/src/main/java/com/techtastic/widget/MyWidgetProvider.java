package com.techtastic.widget;


import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Button;
import android.widget.RemoteViews;

import androidx.annotation.RequiresApi;

import java.util.Random;

public class MyWidgetProvider extends AppWidgetProvider {
//    ************sms************
//    private static final String ACTION_SEND_SMS = "ACTION_SEND_SMS";
//    private Button button;
////    private static final String ACTION_CLICK = "ACTION_CLICK";
//
//    @RequiresApi(api = Build.VERSION_CODES.R)
//    @Override
//    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
//                         int[] appWidgetIds) {
//        SmsManager sm = SmsManager.getDefault();
//        sm.sendTextMessage("8178859821", null, "Hello world", null, null);
//
//        for (int appWidgetId : appWidgetIds) {
//            Intent intent = new Intent(context, MyWidgetProvider.class);
//            intent.setAction(ACTION_SEND_SMS);
//            PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
//
//
//            // Get the layout for the App Widget and attach an on-click listener to the button
//            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
//            views.setOnClickPendingIntent(R.id.button, pendingIntent);
//
//
//            // Tell the AppWidgetManager to perform an update on the current App Widget
//            appWidgetManager.updateAppWidget(appWidgetId, views);
//             }
//
//    }
//    @RequiresApi(api = Build.VERSION_CODES.R)
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        super.onReceive(context, intent);
//        if (intent.getAction().equals(ACTION_SEND_SMS)) {
//            SmsManager sm = SmsManager.getDefault();
//            sm.sendTextMessage("8178859821", null, "Hello world", null, null);
//        }

//    ****************call*****************

//String number = "8178859821";
//    @Override
//    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
//
//        ComponentName thisWidget = new ComponentName(context,
//                MyWidgetProvider.class);
//        int[] allWidgetIds = appWidgetManager.getAppWidgetIds(thisWidget);
//        for (int appWidgetId : allWidgetIds) {
//
//            Intent callIntent = new Intent(Intent.ACTION_CALL);
//            callIntent.setData(Uri.parse("tel:"+number));
//            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, callIntent, 0);
//
//            // Get the layout for the App Widget and attach an on-click listener to the button
//            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
//            views.setOnClickPendingIntent(R.id.button, pendingIntent);
//
//            // Tell the AppWidgetManager to perform an update on the current App Widget
//            appWidgetManager.updateAppWidget(appWidgetId, views);
//        }
//    }



//    *************sms?******************

//    @Override
//    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
//        for (int appWidgetId : appWidgetIds) {
//
//            Intent intent = new Intent(context, MyWidgetProvider.class);
//
//            PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
//
//            SmsManager sms=SmsManager.getDefault();
//            sms.sendTextMessage("8178859821", null, "hello", pendingIntent,null);
//
////             Get the layout for the App Widget and attach an on-click listener to the button
//            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
//            views.setOnClickPendingIntent(R.id.button, pendingIntent);
//
//
//            // Tell the AppWidgetManager to perform an update on the current App Widget
//            appWidgetManager.updateAppWidget(appWidgetId, views);
//
//        }
//    }



}
