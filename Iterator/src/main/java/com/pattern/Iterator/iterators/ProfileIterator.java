package com.pattern.Iterator.iterators;

import com.pattern.Iterator.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();
    Profile getNext();
    void reset();
}
