package com.example.flashcardquizapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    private Deck deck;
    private Flashcard currentCard;

    @FXML
    private Label questionLabel;

    @FXML
    private Label answerLabel;

    @FXML
    public void initialize() {
        deck = new Deck();
        questionLabel.setText("Click Start Quiz to begin.");
        answerLabel.setText("");
    }

    @FXML
    protected void onStartQuizClick() {
        currentCard = deck.getNextCard();
        if (currentCard != null) {
            questionLabel.setText(currentCard.getQuestion());
            answerLabel.setText("");
        } else {
            questionLabel.setText("No more flashcards!");
        }
    }

    @FXML
    protected void onShowAnswerClick() {
        if (currentCard != null) {
            answerLabel.setText(currentCard.getAnswer());
        }
    }

    @FXML
    protected void onNextClick() {
        currentCard = deck.getNextCard();
        if (currentCard != null) {
            questionLabel.setText(currentCard.getQuestion());
            answerLabel.setText("");
        } else {
            questionLabel.setText("No more flashcards!");
            answerLabel.setText("");
        }
    }
}
