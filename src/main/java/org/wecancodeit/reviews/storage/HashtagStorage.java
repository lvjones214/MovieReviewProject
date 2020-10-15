package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Hashtag;
import org.wecancodeit.reviews.HashtagRepository;

@Service
public class HashtagStorage {
    private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }
    public void addHashtag(Hashtag hashtagToAdd) {
        hashtagRepo.save(hashtagToAdd);
    }
    public Hashtag retrieveHashtagById(long id) {
        return hashtagRepo.findById(id).get();
    }


    public Iterable<Hashtag> retrieveAllHashtags() {
            return hashtagRepo.findAll();
    }
}
