package com.example.toucheventtest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class LinearLayoutCustomer extends LinearLayout {
    private static final String TAG = "LinearLayoutCustomer";

    public LinearLayoutCustomer(Context context) {
        super(context);
    }

    public LinearLayoutCustomer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutCustomer(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,"" + "dispatchTouchEvent: " + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,"" + "onInterceptTouchEvent: " + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e(TAG,"" + "onTouchEvent: " + ev.getAction());
        return super.onTouchEvent(ev);
    }
}
