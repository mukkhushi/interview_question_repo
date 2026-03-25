package com.crud.test.interview.thread_interview.producer_consumer;

public class Consumer extends Thread{
    Buffer buffer;
    Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            try {
                buffer.consumer();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
