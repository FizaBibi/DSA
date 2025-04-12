//this class uses LinkedList(built-in Java class) to implement a music playlist
package org.example;
import java.util.LinkedList;

public class MusicPlaylist {

    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        // Implement this function
        playlist.add(song);

    }

    public String getCurrentSong() {
        String currentSong = playlist.peek();
        if (currentSong == null) {
            return null;
        }
        return currentSong;
    }

    public void playNextSong() {
        // Implement this function
        String next = playlist.poll();
        if (next == null) {
            System.out.println("no song to play");
        } else {
            System.out.println("playing next song " + next);
        }
    }

    public boolean isEmpty() {
        // Implement this function
        boolean empty = playlist.isEmpty();
        System.out.println("Is list empty " + empty);
        return empty;
    }

    public void clearPlaylist() {
        // Implement this f
    }
    public void removeSong(String song) {
        // Implement this function
        playlist.remove(song);
        System.out.println("Removed song " + song);
    }

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        System.out.println("Current song: " + playlist.getCurrentSong());
        playlist.playNextSong();
        System.out.println("Current song " + playlist.getCurrentSong());
        playlist.playNextSong();
        System.out.println("Current song " + playlist.getCurrentSong());
        playlist.playNextSong();
        System.out.println("Current song " + playlist.getCurrentSong());
        playlist.playNextSong();
        System.out.println("Current song " + playlist.getCurrentSong());
        playlist.isEmpty();
        playlist.clearPlaylist();
        playlist.isEmpty();
        playlist.removeSong("Song 2");
    }
}
