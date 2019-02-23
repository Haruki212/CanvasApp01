package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    private Paint paint;

    //コンストラクタ（初期設定）
    public MyView(Context con) {
        super(con);

        paint = new Paint();
    }
    //　描画の処理
    @Override
    protected void onDraw(Canvas canvas){

        //　背景
        canvas.drawColor(Color.MAGENTA);

        //円
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(400,500,100,paint);
        paint.setColor(Color.CYAN);
        canvas.drawCircle(400,700,100,paint);

        //四角
        paint.setColor(Color.LTGRAY);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(400,800,600,1000,paint);

        //線
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(0,canvas.getHeight(),canvas.getWidth(),0,paint);

    }

}
