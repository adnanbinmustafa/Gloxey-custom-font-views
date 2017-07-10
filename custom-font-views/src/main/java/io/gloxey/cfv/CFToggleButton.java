package io.gloxey.cfv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

import io.gloxey.cfv.gutils.FontUtils;

public class CFToggleButton extends ToggleButton {


    public CFToggleButton(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}
