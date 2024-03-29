package com.fulvmei.android.djmedia.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fulvmei.android.media.ui.SampleBufferingView;

public class DJVideoBufferingView extends SampleBufferingView {

    ProgressBar progressBar;

    public DJVideoBufferingView(@NonNull Context context) {
        this(context, null);
    }

    public DJVideoBufferingView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DJVideoBufferingView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        progressBar = findViewById(R.id.progressBar);

        updateProgressBarView(fullScreen);
    }

    @Override
    protected View onCreateView(LayoutInflater inflater, ViewGroup parent) {
        return inflater.inflate(R.layout.fu_view_video_state_buffering, parent, false);
    }

    @Override
    protected void onFullScreenChanged(boolean fullScreen) {
        updateProgressBarView(fullScreen);
    }

    protected void updateProgressBarView(boolean fullScreen) {
        if (progressBar == null) {
            return;
        }
        if (fullScreen) {
            progressBar.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics());
            progressBar.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics());
        } else {
            progressBar.getLayoutParams().width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 45, getResources().getDisplayMetrics());
            progressBar.getLayoutParams().height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 45, getResources().getDisplayMetrics());
        }
    }
}
