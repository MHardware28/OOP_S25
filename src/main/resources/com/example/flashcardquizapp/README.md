# 🧠 Flashcard Quiz App

## 📋 Description

The Flashcard Quiz App is a simple JavaFX desktop application that allows users to review flashcards for quick studying and self-quizzing. Each flashcard contains a question and an answer. Users can flip through the flashcards, view the question, and then reveal the answer with the click of a button.

This project demonstrates clean object-oriented programming principles using Java and JavaFX. It features encapsulation, modular class design, and inheritance, with optional polymorphism available for future extension (e.g., different flashcard types).

---

## 🚀 Features

- View a flashcard question.
- Click **"Show Answer"** to reveal the answer.
- Click **"Next Card"** to go to the next flashcard.
- Preloaded with a basic hardcoded flashcard deck (easily extendable to file-based decks).
- Designed with modular code and readable structure.

---

## 🧱 Class Structure

- `Flashcard`: Represents a single flashcard (question + answer).
- `FlashcardDeck`: Manages a list of flashcards, navigation logic (`addCard()`, `getNextCard()`).
- `CardLoader` *(interface)*: Meant for loading flashcards from various sources.
- `HardcodedCardLoader`: Implements `CardLoader`, loads a static set of cards.
- `FlashcardApp`: The main JavaFX GUI class with all UI elements and event handling.

---
