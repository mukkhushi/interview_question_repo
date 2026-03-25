package com.crud.test.interview.thread_interview.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.IntStream;

public class Buffer {

    Queue<Integer> queue = new LinkedBlockingDeque<>();
    int capacity = 5;
    synchronized void producer(int value) throws InterruptedException{
        if(queue.size() == capacity){
            wait();
        }
        System.out.println("Added value by "+Thread.currentThread()+" value : "+value);
        queue.add(new Integer(value));
        notify();
    }
    synchronized void consumer() throws InterruptedException{
        if(queue.isEmpty()){
            wait();
        }
        Integer i = queue.poll();
        System.out.println("Consumed value by "+Thread.currentThread()+" value : "+i);
        notify();
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
      Producer producer1 = new Producer(buffer);
      Consumer consumer1 = new Consumer(buffer);
        Producer producer2 = new Producer(buffer);
        Consumer consumer2 = new Consumer(buffer);
        Producer producer3 = new Producer(buffer);
        Consumer consumer3 = new Consumer(buffer);

        producer1.start();
        consumer1.start();
        producer2.start();
        consumer2.start();
        producer3.start();
        consumer3.start();



    }
}
