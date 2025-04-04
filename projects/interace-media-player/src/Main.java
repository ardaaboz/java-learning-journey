public class Main {
    public static void main(String[] args) {

        // Creating instances for example
        Playable myMusicPlayer = new MusicPlayer();
        Playable myVideoPlayer = new VideoPlayer();

        myMusicPlayer.play();
        myMusicPlayer.pause();

        System.out.println();

        myVideoPlayer.play();
        myVideoPlayer.pause();

        System.out.println();

        Playable.stop(); // Need to directly call interface to access static methods
    }
}
