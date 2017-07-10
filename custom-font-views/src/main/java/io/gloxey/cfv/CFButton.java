package io.gloxey.cfv;

import android.content.Context;
import android.util.AttributeSet;

import io.gloxey.cfv.gutils.FontUtils;

public class CFButton extends android.support.v7.widget.AppCompatButton {


    public CFButton(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}
