package io.gloxey.cfv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Switch;

import io.gloxey.cfv.gutils.FontUtils;

public class CFSwitch extends Switch {


    public CFSwitch(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}

