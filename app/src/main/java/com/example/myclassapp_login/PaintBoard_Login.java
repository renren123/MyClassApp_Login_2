package com.example.myclassapp_login;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 任 on 2017/4/13.
 */

public class PaintBoard_Login extends View {

    public PaintBoard_Login(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //paint a circle
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(120, 80, 60, paint);

        //paint string
        paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setTextSize(20);
        canvas.drawText("My name is Linc!",245,140,paint);

        //draw line
        paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawLine(245,145,500,145,paint);


    }
}
