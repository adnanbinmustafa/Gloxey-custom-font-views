package io.gloxey.cfv;

import android.content.Context;
import android.util.AttributeSet;

import io.gloxey.cfv.gutils.FontUtils;

public class CFRadioButton extends android.support.v7.widget.AppCompatRadioButton {


    public CFRadioButton(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}

