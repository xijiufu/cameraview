/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.cameraview;

import android.media.MediaRecorder;
import android.view.View;

import java.util.Set;

abstract class CameraViewImpl {

    protected final Callback mCallback;

    protected final PreviewImpl mPreview;

    CameraViewImpl(Callback callback, PreviewImpl preview) {
        mCallback = callback;
        mPreview = preview;
    }

    View getView() {
        return mPreview.getView();
    }

    /**
     * @return {@code true} if the implementation was able to start the camera session.
     */
    abstract boolean start();

    abstract void stop();

    abstract boolean isCameraOpened();

    abstract void setFacing(int facing);

    abstract int getFacing();

    abstract Set<AspectRatio> getSupportedAspectRatios();

    /**
     * @return {@code true} if the aspect ratio was changed.
     */
    abstract boolean setAspectRatio(AspectRatio ratio);

    abstract AspectRatio getAspectRatio();

    abstract void setAutoFocus(boolean autoFocus);

    abstract boolean getAutoFocus();

    abstract void setFlash(int flash);

    abstract int getFlash();

    abstract void setDisplayOrientation(int displayOrientation);

    abstract void startVideoRecord(MediaRecorder mediaRecorder, VideoConfig videoConfig,String videoPath);

    abstract void stopVideoRecord(MediaRecorder mediaRecorder);

    interface Callback {
        //相机打开
        void onCameraOpened();
        //相机关闭
        void onCameraClosed();
        //相机初始化成功
        void onCameraInit(int cameraApiLevel);
        //切换摄像头成功
        void onCameraSwitch(int face);
        //开始录制成功
        void onMediaRecordStartSucceed(VideoConfig videoConfig);
        //开始录制失败
        void onMediaRecordStartFailed(String message);
        //停止录制成功
        void onMediaRecordStopSucceed(String videoPath);
        //停止录制失败
        void onMediaRecordStopFailed(String message);
        //其它异常信息
        void onErrorMessage(String message,Exception e);
    }

}
