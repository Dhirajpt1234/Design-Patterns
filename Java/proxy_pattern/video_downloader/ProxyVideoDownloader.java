package Java.proxy_pattern.video_downloader;

import java.util.HashSet;
import java.util.Set;

public class ProxyVideoDownloader implements VideoDownloader {
    private static final Set<String> videoCache;
    private VideoDownloader realVideoDownloader;

    static {
        videoCache = new HashSet<>();
    }

    @Override
    public void getVideo(String videoName) {

        // Check if video is already in cache (already downloaded)
        if (videoCache.contains(videoName)) {
            System.out.println(videoName + " has already been downloaded. Hence skipping...");
            return;
        }

        // Lazy initialization: Create RealVideoDownloader only when needed
        if (realVideoDownloader == null) {
            realVideoDownloader = new RealVideoDownloader();
        }

        // Download the video
        realVideoDownloader.getVideo(videoName);
        
        // Add to cache after downloading
        videoCache.add(videoName);
        System.out.println(videoName + " has been cached for future use.");
    }

}
