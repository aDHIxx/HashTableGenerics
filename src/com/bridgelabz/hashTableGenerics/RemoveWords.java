package com.bridgelabz.hashTableGenerics;

public class RemoveWords {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = paragraph.split(" ");

        myHashTable<String, Integer> wordFrequencyMap = new myHashTable<>(words.length);

        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitive comparison
            Integer frequency = wordFrequencyMap.get(word);
            if (frequency == null) {
                wordFrequencyMap.put(word, 1);
            } else {
                wordFrequencyMap.put(word, frequency + 1);
            }
        }

        System.out.println("Before removal:");
        wordFrequencyMap.printHashTable();

        // Remove the word "avoidable"
        wordFrequencyMap.remove("avoidable");

        System.out.println("\nAfter removal:");
        wordFrequencyMap.printHashTable();
    }
}
