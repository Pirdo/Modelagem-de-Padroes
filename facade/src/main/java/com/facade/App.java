package com.facade;

import com.facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
