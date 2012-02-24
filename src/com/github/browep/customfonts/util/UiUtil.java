package com.github.browep.customfonts.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UiUtil {

    public static final String TAG = "UiUtil";

    public static void setCustomFont(View textViewOrButton, Context ctx, AttributeSet attrs, int[] attributeSet, int fontId) {
        TypedArray a = ctx.obtainStyledAttributes(attrs, attributeSet);
        String customFont = a.getString(fontId);
        setCustomFont(textViewOrButton, ctx, customFont);
        a.recycle();
    }

    private static boolean setCustomFont(View textViewOrButton, Context ctx, String asset) {
        if (TextUtils.isEmpty(asset))
            return false;
        Typeface tf = null;
        try {
            tf = Typeface.createFromAsset(ctx.getAssets(), "fonts/" + asset);
            if (textViewOrButton instanceof TextView) {
                ((TextView) textViewOrButton).setTypeface(tf);
            } else {
                ((Button) textViewOrButton).setTypeface(tf);
            }
        } catch (Exception e) {
            Log.e(TAG, "Could not get typeface: " + asset, e);
            return false;
        }

        return true;
    }

}
