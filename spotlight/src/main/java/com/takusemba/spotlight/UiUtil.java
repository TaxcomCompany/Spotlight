package com.takusemba.spotlight;

import android.content.res.Resources;

public class UiUtil {

    /**
     * Returns the given dp value in pixel
     **/
    public static float dpToPx(int dp) {
        return (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * Returns the given pixel value in dp
     **/
    public static float pxToDp(int px) {
        return (px / Resources.getSystem().getDisplayMetrics().density);
    }
}
