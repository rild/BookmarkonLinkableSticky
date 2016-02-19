package rild.java_conf.gr.jp.bookmarkonlinkablesticky.model.entity;

import android.content.Context;
import android.widget.TextView;

public class _Sticky {
    public TextView[][] tv_sticky = new TextView[4][2];
    private Context mContext;

    public _Sticky(Context mContext) {
        this.mContext = mContext;
    }
}