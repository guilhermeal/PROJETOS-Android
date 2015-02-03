package com.example.guilherme.notificacoes;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Calendar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNotification (View v) {
        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        Calendar horaDeExibicao = Calendar.getInstance();
        horaDeExibicao.add(Calendar.SECOND, 5);

        Bitmap largIcon = BitmapFactory.decodeResource(getResources(),
                R.drawable.ic_notification);

        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("Conhecimento Digital")
                .setContentText("Texto, CD é Fera!")
                .setSmallIcon(R.drawable.ic_notification)
                .setWhen(horaDeExibicao.getTimeInMillis())
                .setColor(Color.DKGRAY)
                .setLargeIcon(largIcon)
                .setTicker("Ticker")
                .setAutoCancel(true)
                .addAction(R.drawable.ic_touch, "Ir APP", pendingIntent)
                .setContentIntent(pendingIntent);

        Notification notification = builder.getNotification();

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);
    }

}
