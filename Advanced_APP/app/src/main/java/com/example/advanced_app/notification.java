package com.example.advanced_app;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class notification extends AppCompatActivity
{

    Button notification;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notification = findViewById(R.id.btn_notification);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.0)
        {
            NotificationChannel notificationChannel = new NotificationChannel("Notification","Notification",NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }

        notification.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(com.example.advanced_app.notification.this,"Notification");
                builder.setContentTitle("Application");
                builder.setContentText("App processing");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(com.example.advanced_app.notification.this);
                if (ActivityCompat.checkSelfPermission(com.example.advanced_app.notification.this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED)
                {
                    return;
                }
                notificationManagerCompat.notify(1,builder.build());
            }
        });
    }


}