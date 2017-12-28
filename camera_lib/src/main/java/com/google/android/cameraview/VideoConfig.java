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
 * Created by Administrator on 2017/12/27 0027.
 */

public class VideoConfig {

//    private int audioSource = VideoConfigDefault.audioSource;
//    private int videoSource = VideoConfigDefault.videoSource;
    private int outputFormat = VideoConfigDefault.outputFormat;

    private int videoCodec = VideoConfigDefault.videoCodec;
    private int audioCodec = VideoConfigDefault.audioCodec;

    private int width = VideoConfigDefault.width;
    private int height = VideoConfigDefault.height;

    private int videoBitRate = VideoConfigDefault.videoBitRate;
    private int videoFrameRate = VideoConfigDefault.videoFrameRate;

    private int audioSampleRate = VideoConfigDefault.audioSampleRate;
    private int audioBitRate = VideoConfigDefault.audioBitRate;


    public VideoConfig() {
    }

    public VideoConfig(int outputFormat, int videoCodec, int audioCodec, int width, int height,
            int videoBitRate, int videoFrameRate, int audioSampleRate, int audioBitRate) {
        this.outputFormat = outputFormat;
        this.videoCodec = videoCodec;
        this.audioCodec = audioCodec;
        this.width = width;
        this.height = height;
        this.videoBitRate = videoBitRate;
        this.videoFrameRate = videoFrameRate;
        this.audioSampleRate = audioSampleRate;
        this.audioBitRate = audioBitRate;
    }

    public int getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(int videoCodec) {
        this.videoCodec = videoCodec;
    }

    public int getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(int audioCodec) {
        this.audioCodec = audioCodec;
    }

//    public int getAudioSource() {
//        return audioSource;
//    }
//
//    public void setAudioSource(int audioSource) {
//        this.audioSource = audioSource;
//    }
//
//    public int getVideoSource() {
//        return videoSource;
//    }
//
//    public void setVideoSource(int videoSource) {
//        this.videoSource = videoSource;
//    }

    public int getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(int outputFormat) {
        this.outputFormat = outputFormat;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVideoBitRate() {
        return videoBitRate;
    }

    public void setVideoBitRate(int videoBitRate) {
        this.videoBitRate = videoBitRate;
    }

    public int getVideoFrameRate() {
        return videoFrameRate;
    }

    public void setVideoFrameRate(int videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    public int getAudioSampleRate() {
        return audioSampleRate;
    }

    public void setAudioSampleRate(int audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public int getAudioBitRate() {
        return audioBitRate;
    }

    public void setAudioBitRate(int audioBitRate) {
        this.audioBitRate = audioBitRate;
    }

}
