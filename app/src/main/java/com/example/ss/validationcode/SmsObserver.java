package com.example.ss.validationcode;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;

class SmsObeserver extends ContentObserver{
    private Context mContext;
    private Handler mHandler;
    public SmsObeserver(Context context,Handler handler) {
        super(handler);
        mContext = context;
        mHandler = handler;
    }
        public void onChange(boolean selfChange,Uri uri){
            super.onChange(selfChange,uri);//call parent class method->onChange

            Log.d("Debug", "Sms has changed!");//logcat.debug
            Log.d("Debug",uri.toString());

    }
}