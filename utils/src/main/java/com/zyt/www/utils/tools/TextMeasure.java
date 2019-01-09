package com.zyt.www.utils.tools;

import android.graphics.Paint;

/**
 * Created by zhaoyuntao on 2018/7/4.
 */

public class TextMeasure {

    public static float[] measure(String text, float textsize) {
        Paint p = new Paint();
        p.setTextSize(textsize);
        float textWidth = p.measureText(text);
        Paint.FontMetrics fontMetrics = p.getFontMetrics();
        float top = Math.abs(fontMetrics.top);
        float ascent = Math.abs(fontMetrics.ascent);
        float descent = fontMetrics.descent;
        float bottom = fontMetrics.bottom;
        float w_text = textWidth;
        float h_text = Math.abs(descent - ascent);
        if (w_text < 0) {
            w_text = 0;
        }
        return new float[]{w_text, h_text};
    }
}
