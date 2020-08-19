package com.example.drawingapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DisplayView extends View {
    static Canvas canvas;

    public DisplayView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw(Canvas canvas){
        Path path = GlobalVariable.drawpath;
        Paint brush = PaintView.brush;
        canvas.drawPath(path,brush);
        invalidate();
    }

}
