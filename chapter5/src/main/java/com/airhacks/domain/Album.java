package com.airhacks.domain;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@Entity
public class Album {

    @Id
    private Long id;

    @ElementCollection
    @CollectionTable(name = "album_songs_and_positions")
    @MapKeyColumn(name = "song_position")
    @Column(name = "song")
    private Map<Integer, String> tracks = new HashMap<>();

    public Album() {
    }

    public Album(Long id, Map<Integer, String> tracks) {
	this.id = id;
	this.tracks = tracks;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Map<Integer, String> getTracks() {
	return tracks;
    }

    public void setTracks(Map<Integer, String> tracks) {
	this.tracks = tracks;
    }

}
