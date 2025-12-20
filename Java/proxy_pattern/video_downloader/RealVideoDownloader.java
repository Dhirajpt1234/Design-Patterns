package Java.proxy_pattern.video_downloader;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public void getVideo(String videoName) {
        System.out.println("Downloading the video: " + videoName);
    }
    
}
