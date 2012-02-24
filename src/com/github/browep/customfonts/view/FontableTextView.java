package com.github.browep.customfonts.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.github.browep.customfonts.R;
import com.github.browep.customfonts.util.UiUtil;

public class FontableTextView extends TextView {

    public FontableTextView(Context context) {
        super(context);
    }

    public FontableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        UiUtil.setCustomFont(this,context,attrs,
                R.styleable.com_github_browep_customfonts_view_FontableTextView,
                R.styleable.com_github_browep_customfonts_view_FontableTextView_font);
    }

    public FontableTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        UiUtil.setCustomFont(this,context,attrs,
                R.styleable.com_github_browep_customfonts_view_FontableTextView,
                R.styleable.com_github_browep_customfonts_view_FontableTextView_font);
    }
}
