package rild.java_conf.gr.jp.bookmarkonlinkablesticky.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import rild.java_conf.gr.jp.bookmarkonlinkablesticky.R;

/**
 * Created by rild on 16/02/20.
 */
@EViewGroup(R.layout.view_sticky)
public class StickyView extends LinearLayout {
    public static final String TAG = StickyView.class.getSimpleName();

    @ViewById(R.id.text_content)
    TextView mContentText;
    @ViewById(R.id.text_url)
    TextView mUrlText;

    public StickyView(Context context) {
        this(context, null);
    }

    public StickyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StickyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
