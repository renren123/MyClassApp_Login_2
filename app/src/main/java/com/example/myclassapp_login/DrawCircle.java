package com.example.myclassapp_login;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by 任 on 2017/4/10.
 */

public class DrawCircle extends View {

    public DrawCircle(Context context) {
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);// 设置红色



//        canvas.drawText("画圆：", 10, 20, p);// 画文本
//        canvas.drawCircle(60, 20, 10, p);// 小圆

        p.setAntiAlias(true);// 设置画笔的锯齿效果。 true是去除，大家一看效果就明白了
        canvas.drawCircle(50,50, 50, p);// 大圆




    }
}
