package com.sonic.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_FULLSCREEN |
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        setContentView(new GameView());
    }

    class GameView extends View {

        Paint paint = new Paint();

        GameView() {
            super(MainActivity.this);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawColor(Color.rgb(80, 170, 230));

            paint.setColor(Color.WHITE);
            paint.setTextSize(55);
            paint.setTextAlign(Paint.Align.CENTER);

            canvas.drawText(
                "SONIC ADVENTURE",
                getWidth() / 2f,
                getHeight() / 2f,
                paint
            );

            paint.setTextSize(25);

            canvas.drawText(
                "Versao Android",
                getWidth() / 2f,
                getHeight() / 2f + 55,
                paint
            );
        }
    }
}
