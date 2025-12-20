package Java.proxy_pattern.video_downloader;

public class Client {
    public static void main(String args[]){
        VideoDownloader videoDownloader = new ProxyVideoDownloader();

        videoDownloader.getVideo("first");
        videoDownloader.getVideo("second");
        videoDownloader.getVideo("first");
        videoDownloader.getVideo("third");
        
    }
}
