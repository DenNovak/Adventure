package com.cookiedrake;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description) {
        this.locationID = locationId;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    // getter return a copy of the exits so if the calling program wants to add or remove mappings
    // from it and the exits mapping field won't be affected
    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
