package com.nighthawk.spring_portfolio.mvc.music;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

@EntityScan("com.nighthawk.spring_portfolio.mvc.music")
public class MusicDatabaseController {

    public static void main(String[] args) {
        // Create Albums
        Album utopia = new Album(null, "UTOPIA", "Travis Scott", new ArrayList<>());
        Album astroworld = new Album(null, "Astroworld", "Travis Scott", new ArrayList<>());
        Album birdsintrapsingmcknight = new Album(null, "Birds in the Trap Sing McKnight", "Travis Scott", new ArrayList<>());
        Album rodeo = new Album(null, "Rodeo", "Travis Scott", new ArrayList<>());
        
        // Creating UTOPIA songs
        Song hyaena = new Song(null, "HYAENA", 222);
        Song thankGod = new Song(null, "THANK GOD", 185);
        Song modernJam = new Song(null, "MODERN JAM", 255);
        Song myEyes = new Song(null, "MY EYES", 251);
        Song godsCountry = new Song(null, "GOD’S COUNTRY", 128);
        Song sirens = new Song(null, "SIRENS", 204);
        Song meltdown = new Song(null, "MELTDOWN", 246);
        Song fein = new Song(null, "FE!N", 192);
        Song delresto = new Song(null, "DELRESTO (ECHOES)", 274);
        Song iKnow = new Song(null, "I KNOW ?", 212);
        Song topiaTwins = new Song(null, "TOPIA TWINS", 223);
        Song circusMaximus = new Song(null, "CIRCUS MAXIMUS", 259);
        Song parasail = new Song(null, "PARASAIL", 155);
        Song skitzo = new Song(null, "SKITZO", 367);
        Song lostForever = new Song(null, "LOST FOREVER", 163);
        Song looove = new Song(null, "LOOOVE", 227);
        Song kPop = new Song(null, "K‐POP", 185);
        Song telekinesis = new Song(null, "TELEKINESIS", 354);
        Song tilFurtherNotice = new Song(null, "TIL FURTHER NOTICE", 315);

        // Creating Astroworld songs
        Song sickoMode = new Song(null, "SICKO MODE", 320);
        Song stargazing = new Song(null, "STARGAZING", 240);
        Song carousel = new Song(null, "CAROUSEL", 300);
        Song butterflyEffect = new Song(null, "BUTTERFLY EFFECT", 213);
        Song highestInTheRoom = new Song(null, "HIGHEST IN THE ROOM", 200);
        Song stopTryingToBeGod = new Song(null, "STOP TRYING TO BE GOD", 330);
        Song wakeUp = new Song(null, "WAKE UP", 200);
        Song cantSay = new Song(null, "CANT SAY", 185);
        Song skeletons = new Song(null, "SKELETONS", 170);
        Song astroThunder = new Song(null, "ASTROTHUNDER", 180);
        Song yosemite = new Song(null, "YOSEMITE", 210);
        Song whoWhat = new Song(null, "WHO? WHAT!", 190);
        Song nc17 = new Song(null, "NC-17", 230);

        // Creating Birds in the Trap Sing McKnight songs
        Song theEnd = new Song(null, "the ends", 330);
        Song wayBack = new Song(null, "way back", 240);
        Song coordinate = new Song(null, "coordinate", 220);
        Song throughTheLateNight = new Song(null, "through the late night", 230);
        Song beibsInTheTrap = new Song(null, "beibs in the trap", 180);
        Song sdpInterlude = new Song(null, "sdp interlude", 240);
        Song sweetSweet = new Song(null, "sweet sweet", 220);
        Song outside = new Song(null, "outside", 300);
        Song goosebumps = new Song(null, "goosebumps", 240);
        Song firstTake = new Song(null, "first take", 270);
        Song pickUpThePhone = new Song(null, "pick up the phone", 230);
        Song lose = new Song(null, "lose", 210);

        // Creating Rodeo songs 
        Song ohMyDisSide = new Song(null, "OH MY DIS SIDE", 330);
        Song three500 = new Song(null, "3500", 240);
        Song wasted = new Song(null, "WASTED", 220);
        Song nine0210 = new Song(null, "90210", 330);
        Song pray4Love = new Song(null, "PRAY 4 LOVE", 230);
        Song nightCrawler = new Song(null, "NIGHTCRAWLER", 230);
        Song pissOnYourGrave = new Song(null, "PISS ON YOUR GRAVE", 180);
        Song antidote = new Song(null, "ANTIDOTE", 230);
        Song impossible = new Song(null, "IMPOSSIBLE", 300);
        Song mariaImDrunk = new Song(null, "MARIA I'M DRUNK", 330);
        Song flyingHigh = new Song(null, "FLYING HIGH", 210);
        Song ICanTell = new Song(null, "I CAN TELL", 290);
        Song applePie = new Song(null, "APPLE PIE", 330);

        // Attaching songs with albums
        associateSongsWithAlbum(List.of(hyaena, thankGod, modernJam, myEyes, godsCountry, sirens, meltdown, fein, delresto, iKnow, topiaTwins, circusMaximus, parasail, skitzo, lostForever, looove, kPop, telekinesis, tilFurtherNotice), utopia);
        associateSongsWithAlbum(List.of(sickoMode, stargazing, carousel, butterflyEffect, highestInTheRoom, stopTryingToBeGod,wakeUp, cantSay, skeletons, astroThunder, yosemite, whoWhat, nc17), astroworld);
        associateSongsWithAlbum(List.of(theEnd, wayBack, coordinate, throughTheLateNight, beibsInTheTrap, sdpInterlude, sweetSweet, outside, goosebumps, firstTake, pickUpThePhone, lose), birdsintrapsingmcknight);
        associateSongsWithAlbum(List.of(ohMyDisSide, three500, wasted, nine0210, pray4Love, nightCrawler, pissOnYourGrave, antidote, impossible, mariaImDrunk, flyingHigh, ICanTell, applePie), rodeo);
    
        // printing albums
        printAlbumDetails(utopia);
        printAlbumDetails(astroworld);
        printAlbumDetails(birdsintrapsingmcknight);
        printAlbumDetails(rodeo);
    }


    // Helper method to attach songs with albums
    private static void associateSongsWithAlbum(List<Song> songs, Album album) {
        songs.forEach(song -> {
            album.getSongs().add(song);
            song.getAlbums().add(album);
        });
    }
    private static void printAlbumDetails(Album album) {
        System.out.println("Album: " + album.getTitle());
        System.out.println("Artist: " + album.getArtist());
        System.out.println("Songs:");

        for (Song song : album.getSongs()) {
            System.out.println("  - " + song.getTitle() + " (" + song.getDuration() + " seconds)");
        }

        System.out.println("\n");
    }}
