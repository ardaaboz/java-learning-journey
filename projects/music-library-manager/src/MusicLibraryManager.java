import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class MusicLibraryManager {
    static Map<String, Album> albumMap = new HashMap<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Song birDerdimVar = new Song("Bir Derdim Var", "Mor ve Otesi", 201);
        Song cevapsizSorular = new Song("Cevapsiz Sorular", "maNga", 168);

        Album rockAlbum = new Album("Turkish Rock", 2002);
        rockAlbum.songSet.add(birDerdimVar);
        rockAlbum.songSet.add(cevapsizSorular);

        Song medcezir = new Song("Medcezir", "Ceza", 297);
        Song unutulanlar = new Song("Unutulanlar", "Farazi ve Kayra", 186);

        Album rapAlbum = new Album("Turkish Rap", 2006);
        rapAlbum.songSet.add(medcezir);
        rapAlbum.songSet.add(cevapsizSorular);

        albumMap.put(rockAlbum.getTitle(),rockAlbum);
        albumMap.put(rapAlbum.getTitle(),rapAlbum);

            boolean menuIsOn = true;
            while (menuIsOn) {
                System.out.println();
                System.out.println("Music Library Manager");
                System.out.println("1. Add new album");
                System.out.println("2. Add song to an album");
                System.out.println("3. Find song by artist");
                System.out.println("4. List albums by year");
                System.out.println("5. Generate new playlist from different albums");
                System.out.println("6. Exit");
                int menuInput = scanner.nextInt();
                scanner.nextLine();

                switch (menuInput) {
                    case 1:
                        System.out.println();
                        System.out.println("Album creation");
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();

                        createAlbum(title,year);
                        break;
                    case 2:
                        System.out.println("Adding song to album")
                        System.out.println("Name of the song to add: "); // Will continue
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        break;

                }
            }
    }


    public static void createAlbum(String title, int year) {
        albumMap.put(title, new Album(title,year));
    }
    public static void addSongToAlbum(Song songToAdd, Album albumToAdd) {
        albumToAdd.songSet.add(songToAdd);
    }
    public static void findSongByArtist(String artistToFind) {
        boolean isFound = false;
        HashSet<Song> songsByArtist = new HashSet<>();
        for (Album album: albumMap.values()) {
            for (Song song: album.songSet) {
                if (song.getArtist().equalsIgnoreCase(artistToFind)) {
                    songsByArtist.add(song);
                    isFound = true;
                }
            }
        } if (isFound) {
            System.out.println();
            System.out.println(songsByArtist.size() + " songs found by " + artistToFind);
            for (Song song: songsByArtist) {
                System.out.println();
                System.out.println("Name: " + song.getName());
                System.out.println("Artist: " + song.getArtist());
                System.out.println("Duration: " + song.getDuration());
            }
        } else {
            System.out.println("No songs by " + artistToFind + " is found!");
        }
    }

    public static void listAlbumsByYear() {
        ArrayList<Integer> yearsArrayList = new ArrayList<>();
        LinkedHashMap<Album, Integer> albumsByYearLinkedHashMap = new LinkedHashMap<>();

        for (Album album: albumMap.values()) {
            yearsArrayList.add(album.getYear());
        }
        Collections.sort(yearsArrayList);
        for (Integer year: yearsArrayList) {
            System.out.println();
            System.out.println(year);
        }
        // I know this only dispalys year, not album title or anything else.
        // But I realized it required me to use advanced tools like lambda expressions
        // so I did not proceed with that as I don't truly understand it yet.
    }

    public static void generatePlaylist(Album firstAlbumToAdd, Album secondAlbumToAdd) {
        Set<Song> newPlaylist = new HashSet<>();
        newPlaylist.addAll(firstAlbumToAdd.songSet);
        newPlaylist.addAll(secondAlbumToAdd.songSet);
        System.out.println();
        System.out.println("New Playlist");
        for (Song song: newPlaylist) {
            System.out.println();
            System.out.println("Name: " + song.getName());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Duration: " + song.getDuration());
        }
    }
}
