package com.example.toucheventtest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import androidx.appcompat.widget.AppCompatButton;

public class ButtonCustomer extends AppCompatButton {
    private static final String TAG = "ButtonCustomer";

    public ButtonCustomer(Context context) {
        super(context);
    }

    public ButtonCustomer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ButtonCustomer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,"" + "dispatchTouchEvent: " + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e(TAG,"" + "onTouchEvent: " + ev.getAction());
        return super.onTouchEvent(ev);
    }
}
