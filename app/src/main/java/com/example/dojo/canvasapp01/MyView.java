package com.example.dojo.canvasapp01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class MyView extends View {

    //コンストラクタ（初期設定）
    public MyView(Context con) {
        super(con);
    }
    //　描画の処理
    @Override
    protected void onDraw(Canvas canvas){

        //　背景
        canvas.drawColor(Color.MAGENTA);
    }

}
