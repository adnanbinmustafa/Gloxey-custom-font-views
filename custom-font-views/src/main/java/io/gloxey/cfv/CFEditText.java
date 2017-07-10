package io.gloxey.cfv;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;

import io.gloxey.cfv.gutils.FontUtils;

public class CFEditText extends SwitchCompat {


    public CFEditText(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}

