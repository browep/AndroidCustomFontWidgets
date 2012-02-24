package com.github.browep.customfonts.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.github.browep.customfonts.R;
import com.github.browep.customfonts.util.UiUtil;

public class FontableButton extends Button {
    public FontableButton(Context context) {
        super(context);
    }

    public FontableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        UiUtil.setCustomFont(this, context, attrs,
                R.styleable.com_github_browep_customfonts_view_FontableButton,
                R.styleable.com_github_browep_customfonts_view_FontableButton_font);
    }

    public FontableButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        UiUtil.setCustomFont(this, context, attrs,
                R.styleable.com_github_browep_customfonts_view_FontableButton,
                R.styleable.com_github_browep_customfonts_view_FontableButton_font);
    }
}
