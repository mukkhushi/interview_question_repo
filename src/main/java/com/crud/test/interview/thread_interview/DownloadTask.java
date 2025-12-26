package com.crud.test.interview.thread_interview;

import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {
    private String fileName;

    DownloadTask(String fileName){
        this.fileName = fileName;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread()+" "+fileName+" Downloading start..");
        Thread.sleep(2000);
        System.out.println(fileName+" Downloading completed");
        return fileName;
    }
}
