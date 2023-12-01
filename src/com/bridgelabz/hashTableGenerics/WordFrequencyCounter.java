package com.bridgelabz.hashTableGenerics;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split("\\s+");

        myHashTable<String, Integer> wordFrequencyTable = new myHashTable<>(10);

        for (String word : words) {
            // Convert to lowercase to make the comparison case-insensitive
            String normalizedWord = word.toLowerCase();

            // Get the current frequency or default to 0 if the word is not present
            int frequency = wordFrequencyTable.get(normalizedWord) == null ? 0 : wordFrequencyTable.get(normalizedWord);

            // Increment the frequency and update the table
            wordFrequencyTable.put(normalizedWord, frequency + 1);
        }

        // Print the word frequency hash table
        wordFrequencyTable.printHashTable();
    }
}