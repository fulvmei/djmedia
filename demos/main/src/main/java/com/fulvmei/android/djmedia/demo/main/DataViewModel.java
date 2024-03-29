package com.fulvmei.android.djmedia.demo.main;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.fulvmei.android.djmedia.demo.main.been.Video;

public class DataViewModel extends ViewModel {
    private final MutableLiveData<Video> videoLiveData;

    public DataViewModel() {
        videoLiveData = new MutableLiveData<>();
    }

    @MainThread
    public void setVideo(Video video) {
        videoLiveData.setValue(video);
    }

    public LiveData<Video> getVideoLiveData() {
        return videoLiveData;
    }
}
