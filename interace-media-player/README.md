# Objective:
Practice creating and implementing interfaces to reinforce your understanding.

## Task:

### Create an Interface:
Define an interface named `Playable` with the following methods:
- `void play()`
- `default void pause()` that prints `"Playback paused."`

### Implement the Interface in Two Classes:
1. Create a class `MusicPlayer` that implements `Playable`:
    - The `play()` method should print `"Music is playing."`

2. Create a class `VideoPlayer` that implements `Playable`:
    - The `play()` method should print `"Video is playing."`
    - Override the `pause()` method to print `"Video paused."`

### Test Your Implementation:
Write a `main` method in a class called `MediaDemo` where you:
- Create instances of `MusicPlayer` and `VideoPlayer`.
- Call the `play()` and `pause()` methods on each instance.

## Additional Challenge (Optional):
Modify your interface to include a static method `stop()` that prints `"Playback stopped."` and call this method from your `main` method.
