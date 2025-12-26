package com.crud.test.interview.thread_interview;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DownloadTaskMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(new DownloadTask("abc.pdf"));
        Future<String> future2 = executorService.submit(new DownloadTask("xyz.csv"));
        Future<String> future3 = executorService.submit(new DownloadTask("pqr.excel"));

            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());

        executorService.shutdown();
    }
}
