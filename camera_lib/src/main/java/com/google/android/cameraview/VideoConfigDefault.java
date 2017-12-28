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

/**
 * -----------------------------------------------------------------
 * User:songfei
 * Email:autismbug@163.com
 * Version:1.0
 * Time:2017/12/2017/12/28--09:15
 * Function:
 * ModifyHistory:
 * -----------------------------------------------------------------
 */
public interface VideoConfigDefault {
//    int audioSource = MediaRecorder.AudioSource.DEFAULT;
//    int videoSource = MediaRecorder.VideoSource.CAMERA;
    int outputFormat = MediaRecorder.OutputFormat.MPEG_4;

    int videoCodec = MediaRecorder.VideoEncoder.H264;
    int audioCodec = MediaRecorder.VideoEncoder.H264;

    int width = 854;
    int height = 480;

    int videoBitRate = 5242880;
    int videoFrameRate = 30;

    int audioSampleRate = 44100;
    int audioBitRate = 16;

    int audioChannels = 2;
    int quality = 100;

    int oritation = 0;
}
