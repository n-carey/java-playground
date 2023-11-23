package com.pg_maven.pgmaven.user.model;

import java.util.UUID;

public class User {
    private UUID _id;

    public UUID getID() {
        return this._id;
    }

    public void setID(String id) {
        this._id = UUID.fromString(id);
    }

    public void setID(UUID id) {
        this._id = id;
    }
}
