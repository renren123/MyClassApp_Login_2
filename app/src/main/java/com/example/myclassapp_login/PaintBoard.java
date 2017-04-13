package com.example.myclassapp_login;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 任 on 2017/4/13.
 */

public class PaintBoard extends View {

    String name = "Linc" ;

    Bitmap myBitmap = null;

    public PaintBoard(Context context, AttributeSet attrs) {
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
        paint.setAntiAlias(true);// 设置画笔的锯齿效果。 true是去除，大家一看效果就明白了
        canvas.drawCircle(105, 105, 98, paint);

        //paint string
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(40);
        canvas.drawText("My name is "+name+" !",245,140,paint);
        //SetPicture("",canvas);


        //draw line
//        paint = new Paint();
//        paint.setColor(Color.BLACK);
//        canvas.drawLine(245,145,500,145,paint);
    }
    public void SetPicture(String name , Canvas canvas) // name是账户名
    {
        int i = getWidth();
        int j = getHeight();
        myBitmap = BitmapFactory.decodeResource(this.getContext().getResources(), R.drawable.login_1);
        canvas.setBitmap(myBitmap);
        Rect rect = new Rect(0,0,200,10);
        RectF rectF = new RectF(rect);

       // canvas.drawRoundRect(rectF, 40, 40, null);

        //canvas.drawBitmap(myBitmap,120,120,null);


        Paint localPaint = new Paint(1);
        float f1 = getWidth();
        float f2 = getHeight();
        RectF localRectF = new RectF(0.0F, 0.0F, f1, f2);
        canvas.drawOval(localRectF, localPaint);


    }
}
