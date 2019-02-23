package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    private Paint paint;
    private Path path;

    //コンストラクタ（初期設定）
    public MyView(Context con) {
        super(con);

        paint = new Paint();
        path = new Path();
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
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(200,800,600,1000,paint);

        //線
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(0,canvas.getHeight(),canvas.getWidth(),0,paint);

        //三角形（パス）
        paint.setColor(Color.WHITE);
        path.moveTo(500,500);
        path.lineTo(700,900);
        path.lineTo(300,600);
        path.lineTo(500,500);
        canvas.drawPath(path,paint);

        path.reset();
        path.moveTo(600,600);
        path.lineTo(800,1000);
        path.lineTo(300,800);
        path.lineTo(600,600);
        canvas.drawPath(path,paint);

        //国旗
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(100);
        canvas.drawLine(200,300,650,300,paint);
        paint.setColor(Color.RED);
        canvas.drawLine(200,400,650,400,paint);
        paint.setColor(Color.YELLOW);
        canvas.drawLine(200,500,650,500,paint);


    }

}
