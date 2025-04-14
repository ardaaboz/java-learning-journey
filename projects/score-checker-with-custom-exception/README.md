# Score Checker with Custom Exception

## Goal
Create and use a custom exception class.

## Tasks

1. Create a custom exception `InvalidScoreException`.
2. Write a method `checkScore(int score)` that:
    - Throws `InvalidScoreException` if the score is not between 0–100.
    - Otherwise, prints `"Score is valid."`
3. In `main`, test the method with both valid and invalid inputs using `try-catch`.