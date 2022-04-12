package com.study.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import com.study.designpatterns._03_behavioral_patterns._16_iterator._01_before.Post;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        // 위임
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        // 위임
        return this.internalIterator.next();
    }
}
