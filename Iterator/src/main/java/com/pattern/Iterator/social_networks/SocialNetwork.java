package com.pattern.Iterator.social_networks;

import com.pattern.Iterator.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
