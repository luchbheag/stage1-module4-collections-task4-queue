package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deck = new ArrayDeque<>();
        deck.add(firstQueue.poll());
        deck.add(firstQueue.poll());
        deck.add(secondQueue.poll());
        deck.add(secondQueue.poll());
        while (!firstQueue.isEmpty()) {
            firstQueue.add(deck.pollLast());
            deck.add(firstQueue.poll());
            deck.add(firstQueue.poll());

            secondQueue.add(deck.pollLast());
            deck.add(secondQueue.poll());
            deck.add(secondQueue.poll());
        }
        return deck;
    }
}
