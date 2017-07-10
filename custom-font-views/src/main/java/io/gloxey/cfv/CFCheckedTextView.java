package io.gloxey.cfv;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.ToggleButton;

import io.gloxey.cfv.gutils.FontUtils;

public class CFCheckedTextView extends android.support.v7.widget.AppCompatCheckedTextView {


    public CFCheckedTextView(Context context) {
        super(context);
        FontUtils.applyCustomFont(this, context, null);
    }

    public CFCheckedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        FontUtils.applyCustomFont(this, context, attrs);
    }

    public CFCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        FontUtils.applyCustomFont(this, context, attrs);
    }
}
