
package com.trade.jimi;

import com.trade.jimi.example.internet.Internet;
import com.trade.jimi.example.internet.ProxyInternet;
import com.trade.jimi.example.video.ProxyVideoDownloader;
import com.trade.jimi.example.video.VideoDownloader;

public class MainApp {


    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }

}
