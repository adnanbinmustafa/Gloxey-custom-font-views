package io.gloxey.cfv;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;

import io.gloxey.cfv.gutils.FontUtils;

public class CFSwitchCompat extends SwitchCompat {


    public CFSwitchCompat(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFSwitchCompat(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFSwitchCompat(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}
