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

/**
 * -----------------------------------------------------------------
 * User:songfei
 * Email:autismbug@163.com
 * Version:1.0
 * Time:2018/01/2018/1/2--10:40
 * Function:
 * ModifyHistory:
 * -----------------------------------------------------------------
 */
public interface CameraViewCallback {
    //相机打开
    void onCameraOpened(CameraView cameraView);

    //相机关闭
    void onCameraClosed(CameraView cameraView);

    //相机初始化成功
    void onCameraInit(CameraView cameraView, int cameraApiLevel);

    //切换摄像头成功
    void onCameraSwitch(CameraView cameraView, int face);

    //开始录制成功
    void onMediaRecordStartSucceed(CameraView cameraView, VideoConfig videoConfig);

    //开始录制失败
    void onMediaRecordStartFailed(CameraView cameraView, String message);

    //停止录制成功
    void onMediaRecordStopSucceed(CameraView cameraView, String videoPath);

    //停止录制失败
    void onMediaRecordStopFailed(CameraView cameraView, String message);

    //其它异常信息
    void onErrorMessage(CameraView cameraView, String message, Exception e);
}
