public interface Playable {
    // Abstract method
    void play();
    // Default method
    default void pause() {
        System.out.println("Playback paused!");
    }
    // Static method
    static void stop() {
        System.out.println("Playback stopped!");
    }
}
