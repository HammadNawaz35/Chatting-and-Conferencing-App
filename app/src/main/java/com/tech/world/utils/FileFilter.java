package com.tech.world.utils;

import java.net.URLConnection;

/**
 * Created by Devlomi on 26/12/2017.
 */

public class FileFilter {


    //this is called when user picks a "File"
    //we want to ensure that the user did not select an image or video or audio
    public static boolean isOkExtension(String path) {
        String mimeType = URLConnection.guessContentTypeFromName(path);
        return mimeType != null && !mimeType.startsWith("image")
                && !mimeType.startsWith("video")
                && !mimeType.startsWith("audio");
    }

    public static boolean isOkExtensionByMimeType(String mimeType) {
        return mimeType != null && !mimeType.startsWith("image")
                && !mimeType.startsWith("video")
                && !mimeType.startsWith("audio");
    }



}

