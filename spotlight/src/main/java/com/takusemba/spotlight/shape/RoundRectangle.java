package com.takusemba.spotlight.shape;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;

import com.takusemba.spotlight.UiUtil;

public class RoundRectangle implements Shape {

    private float corner = UiUtil.dpToPx(3);

    private final float width;
    private final float height;

    public RoundRectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Canvas canvas, PointF point, float value, Paint paint) {
        float halfW = width / 2 * value;
        float halfH = height / 2 * value;

        RectF rectF = new RectF(point.x - halfW,
                point.y - halfH,
                point.x + halfW,
                point.y + halfH);
        canvas.drawRoundRect(rectF, corner, corner, paint);
    }

    @Override
    public int getHeight() {
        return (int) height;
    }

    @Override
    public int getWidth() {
        return (int) width;
    }
}
