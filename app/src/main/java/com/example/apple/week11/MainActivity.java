package com.example.apple.week11;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

class MyButton extends View {

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        randomColor(paint, Color.RED);

        canvas.drawRect(40, 20, 90, 80, paint);


        paint.setColor(Color.GREEN);
        canvas.drawCircle(400, 400, 200, paint);

        canvas.drawArc(40, 550, 800, 1150, 0, 180, true, paint);

        paint.setColor(Color.RED);
        canvas.drawArc(80, 600, 750, 1100, 0, 180, true, paint);

        paint.setColor(Color.BLACK);

        canvas.save();
        canvas.rotate(135, 160, 900);
        canvas.scale(.8f, .8f, 160, 900);
        randomColor(paint, Color.BLACK);
        canvas.drawOval(160, 900, 180, 950, paint);
        canvas.restore();

        canvas.save();
        canvas.rotate(170, 260, 950);
        canvas.scale(.8f, .8f, 260, 950);
        randomColor(paint, Color.BLACK);
        canvas.drawOval(260, 950, 280, 1000, paint);
        canvas.restore();

        canvas.save();
        canvas.rotate(200, 360, 950);
        canvas.scale(.8f, .8f, 360, 950);
        randomColor(paint, Color.BLACK);
        canvas.drawOval(360, 950, 380, 1000, paint);
        canvas.restore();

        canvas.save();
        canvas.rotate(260, 460, 950);
        canvas.scale(.8f, .8f, 460, 950);
        randomColor(paint, Color.BLACK);
        canvas.drawOval(460, 950, 480, 1000, paint);
        canvas.restore();

        canvas.save();
        canvas.rotate(280, 560, 950);
        canvas.scale(.8f, .8f, 560, 950);
        randomColor(paint, Color.BLACK);
        canvas.drawOval(560, 950, 580, 1000, paint);
        canvas.restore();

        canvas.save();
        canvas.rotate(300, 660, 900);
        canvas.scale(.8f, .8f, 660, 900);
        randomColor(paint, Color.BLACK);
        canvas.drawOval(660, 900, 680, 950, paint);
        canvas.restore();

        canvas.save();
        canvas.rotate(30, 400, 1000);
        canvas.scale(.8f, .8f, 400, 1000);//scale ขนาดและการหมุน
        randomColor(paint, Color.BLACK);
        canvas.drawOval(400, 1000, 420, 1050, paint);//save and restore = log this canvas
        canvas.restore();

    }

    private void randomColor(Paint paint, int black) {
        int whichColor1 = (int) (Math.random() * 4);

        if (whichColor1 == 0)
            paint.setColor(black);
        else if (whichColor1 == 1)
            paint.setColor(Color.GREEN);
        else if (whichColor1 == 2)
            paint.setColor(Color.BLUE);
        else
            paint.setColor(Color.YELLOW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction() == MotionEvent.ACTION_UP){
            float x = event.getX();
            float y = event.getY();

            if(x >= 40 && x <= 90 && y >= 20 && y <= 80){//กดได้ในตำแหน่ง 40 - 90
                invalidate();
            }
        }
        return true;
    }
}


