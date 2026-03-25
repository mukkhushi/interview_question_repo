package com.crud.test.interview.thread_interview.producer_consumer;

public class Producer extends Thread{
    Buffer buffer;
    Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int count = 0;
        for(int i=1; i<5; i++){
            try {
                buffer.producer(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
