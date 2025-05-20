package com.example.flashcardquizapp;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Flashcard> cards;
    private int index;

    public Deck() {
        cards = new ArrayList<>();
        index = 0;
        loadSampleCards();
    }

    public void addCard(Flashcard card) {
        cards.add(card);
    }

    public Flashcard getNextCard() {
        if (cards.isEmpty()) return null;
        Flashcard card = cards.get(index);
        index = (index + 1) % cards.size();
        return card;
    }

    private void loadSampleCards() {
        addCard(new Flashcard("Capital of France?", "Paris"));
        addCard(new Flashcard("Which math theorem states that in a right triangle, A² + B² = C²?", "Pythagorean Theorem"));
        addCard(new Flashcard("Java keyword for inheritance?", "extends"));
        addCard(new Flashcard("What is the name of the OOP's Professor?", "Gil Salu"));
        addCard(new Flashcard("What file does a program normally run from?", "Main"));
        addCard(new Flashcard("Capital of Jamaica?", "Kingston"));
        addCard(new Flashcard("Where is New College of Florida Located?", "Sarasota"));
        addCard(new Flashcard("What year was the first Barbie doll released?", "1959"));
        addCard(new Flashcard("Who was the youngest U.S. president?", " Theodore Roosevelt"));
        addCard(new Flashcard("When was the first iPod released?", "2001"));
        addCard(new Flashcard("What is the tallest mountain in the world?", "Mount Everest"));
        addCard(new Flashcard("What is the largest desert in the world?", "Antarctica"));
        addCard(new Flashcard("What year was the first “Batman” comic book published?", "1939"));
        addCard(new Flashcard("What TV series included the phrase “Go where no man has gone before” in its title sequence?", "Star Trek"));
        addCard(new Flashcard("What species of fish is Nemo? ", "Clown Fish"));
    }
}