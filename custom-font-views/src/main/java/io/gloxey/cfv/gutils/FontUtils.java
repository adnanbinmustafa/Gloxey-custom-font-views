package io.gloxey.cfv.gutils;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import io.gloxey.cfv.R;

public class FontUtils {
    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public static void applyCustomFont(TextView customFontView, Context context, AttributeSet attrs) {
        TypedArray attributeArray = context.obtainStyledAttributes(
                attrs,
                R.styleable.CustomFontView);

        String fontName = attributeArray.getString(R.styleable.CustomFontView_font_name);

        // check if a special textStyle was used (e.g. extra bold)
//        int textStyle = attributeArray.getInt(R.styleable.CustomFontView_font_style, 0);

        // if nothing extra was used, fall back to regular android:textStyle parameter
//        if (textStyle == 0) {
//            textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL);
//        }

//        Typeface customFont = selectTypeface(context, fontName, textStyle);
//        customFontTextView.setTypeface(customFont);

        customFontView.setTypeface(FontCache.getTypeface("fonts/" + fontName, context));

        attributeArray.recycle();
    }

//    private static Typeface selectTypeface(Context context, String fontName, int textStyle) {
//        if (fontName.contentEquals(context.getString(R.string.font_name_fontawesome))) {
//            return FontCache.getTypeface("fontawesome.ttf", context);
//        } else if (fontName.contentEquals(context.getString(R.string.font_name_source_sans_pro))) {
//            /*
//            information about the TextView textStyle:
//            http://developer.android.com/reference/android/R.styleable.html#TextView_textStyle
//            */
//            switch (textStyle) {
//                case Typeface.BOLD: // bold
//                    return FontCache.getTypeface("SourceSansPro-Bold.ttf", context);
//
//                case Typeface.ITALIC: // italic
//                    return FontCache.getTypeface("SourceSansPro-Italic.ttf", context);
//
//                case Typeface.BOLD_ITALIC: // bold italic
//                    return FontCache.getTypeface("SourceSansPro-BoldItalic.ttf", context);
//
//                case 10: // extra light, equals @integer/font_style_extra_light
//                    return FontCache.getTypeface("SourceSansPro-ExtraLight.ttf", context);
//
//                case 11: // extra bold, equals @integer/font_style_extra_bold
//                    return FontCache.getTypeface("SourceSansPro-Black.ttf", context);
//
//                case Typeface.NORMAL: // regular
//                default:
//                    return FontCache.getTypeface("SourceSansPro-Regular.ttf", context);
//            }
//        } else {
//            // no matching font found
//            // return null so Android just uses the standard font (Roboto)
//            return null;
//        }
//    }
}
