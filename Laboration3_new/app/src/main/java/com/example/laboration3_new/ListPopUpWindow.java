package com.example.laboration3_new;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ListPopUpWindow extends View {
    Context context;
    String result;
    Paint paint = new Paint();

    public ListPopUpWindow(Context context, String result) {
        super(context);
        this.result = result;

    }

    public ListPopUpWindow(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ListPopUpWindow(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ListPopUpWindow(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int width, int height){
        super.onMeasure(width, height);
        int w = MeasureSpec.getSize(width);
        setMeasuredDimension(w, 80);
    }

    @Override
    protected  void onDraw(Canvas canvas){
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
        paint.setTextSize(60f);
        canvas.drawText(result, 0, paint.getTextSize(), paint);
    }
}
