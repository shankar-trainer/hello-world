package com.amitpathak.medblocks.model;

public record User(
        String name,
        String email,
        String picture
){

}


/*
Flow : Google OAuth User -> OAuthAttributes -> User (Domain Model) -> UserProfileDto -> View
*/
