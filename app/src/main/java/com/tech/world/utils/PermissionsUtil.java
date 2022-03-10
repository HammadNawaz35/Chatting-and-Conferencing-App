package com.tech.world.utils;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

public class PermissionsUtil {


    public static final String[] videoCallPermissions = new String[]{
            Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO};


    public static String[] permissions() {
        if (BuildVerUtil.isApi29OrAbove()) {
            return new String[]{
                    Manifest.permission.READ_CONTACTS,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.CAMERA,
                    Manifest.permission.RECORD_AUDIO
            };
        } else {
            return new String[]{Manifest.permission.READ_CONTACTS,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.CAMERA,
                    Manifest.permission.RECORD_AUDIO};
        }
    }

    //check if user granted all permissions
    public static boolean permissionsGranted(int[] grantResults) {
        for (int grantResult : grantResults) {
            if (grantResult != PackageManager.PERMISSION_GRANTED)
                return false;
        }
        return true;
    }

    public static boolean hasVideoCallPermissions(Context context) {
        if (context != null && permissions() != null) {
            for (String permission : videoCallPermissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasVoiceCallPermissions(Context context) {
        if (context != null && permissions() != null) {
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
                return false;

            }
        }
        return true;
    }

    //check if the permissions granted or not (without request permissions from user)
    public static boolean hasPermissions(Context context) {
        if (context != null && permissions() != null) {
            for (String permission : permissions()) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasLocationPermissions(Context context) {
        if (context != null && permissions() != null) {
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }
}
