package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.Hashtag;
import org.wecancodeit.reviews.Models.MovieGenre;
import org.wecancodeit.reviews.Models.MovieReview;
import org.wecancodeit.reviews.storage.GenreStorage;
import org.wecancodeit.reviews.storage.MovieStorage;

@Component
public class Populator implements CommandLineRunner {
    private GenreStorage genreStorage;
    private MovieStorage movieStorage;
    private HashtagRepository hashtagRepo;
    public Populator(GenreStorage genreStorage, MovieStorage movieStorage, HashtagRepository hashtagRepo) {
        this.genreStorage = genreStorage;
        this.movieStorage = movieStorage;
        this.hashtagRepo = hashtagRepo;
    }
    @Override
    public void run(String... args) throws Exception {
        MovieGenre action = new MovieGenre("Action");
        MovieGenre family = new MovieGenre("Family");
        MovieGenre comedy = new MovieGenre("Comedy");
        MovieGenre horror = new MovieGenre("Horror/Thriller");
        MovieGenre drama = new MovieGenre("Drama");
        MovieGenre documentary = new MovieGenre("Documentary");
        MovieGenre mystery = new MovieGenre("Mystery");
        MovieGenre romance = new MovieGenre("Romance");

        genreStorage.addGenre(action);
        genreStorage.addGenre(family);
        genreStorage.addGenre(comedy);
        genreStorage.addGenre(horror);
        genreStorage.addGenre(drama);
        genreStorage.addGenre(documentary);
        genreStorage.addGenre(mystery);
        genreStorage.addGenre(romance);
        MovieReview movieReviewToAdd1 = new MovieReview("Rush Hour", action, 1998, "PG-13", "5 Stars",  "Temp Description", "Temp Review", "https://i.pinimg.com/originals/60/6e/15/606e15ffb471efa3ed15b15b9d14b03e.jpg");
        movieStorage.addReview(movieReviewToAdd1);
        MovieReview movieReviewToAdd2 = new MovieReview("Rush Hour 2", action, 1998, "PG-13", "5 Stars",  "Temp Description", "Temp Review", "https://vignette.wikia.nocookie.net/rushhour/images/2/21/RH2.jpg");
        movieStorage.addReview(movieReviewToAdd2);
        MovieReview movieReviewToAdd3 = new MovieReview("ScoobyDoo", family, 2018, "PG-14", "5 Stars",  "Two years later, Shaggy and Scooby are invited to solve a mystery on Spooky Island, owned by Emile Mondavarious... ", "Friendship and teamwork are less important here than in other Scooby-Doo features, as the gang tries to salvage their team dynamic", "https://upload.wikimedia.org/wikipedia/en/a/ae/Scooby-Doo_poster.jpg");
        movieStorage.addReview(movieReviewToAdd3);
        MovieReview movieReviewToAdd4 = new MovieReview("Aladdin", family, 2019, "PG-14", "5 Stars",  "Aladdin is a 2019 American live-action animated musical fantasy film produced by Walt Disney Pictures. Directed by Guy Ritchie.", "Aladdin is much like its protagonist..", "https://upload.wikimedia.org/wikipedia/en/9/9a/Aladdin_%28Official_2019_Film_Poster%29.png");
        movieStorage.addReview(movieReviewToAdd4);
        MovieReview movieReviewToAdd5 = new MovieReview("Step Brothers", comedy, 2008, "R", "5 Stars",  "Two aimless middle-aged losers still living at home are forced against their will to become roommates when their parents marry.", "Temp Review", "https://upload.wikimedia.org/wikipedia/en/d/d9/StepbrothersMP08.jpg");
        movieStorage.addReview(movieReviewToAdd5);
        MovieReview movieReviewToAdd6 = new MovieReview("Ace Ventura: Pet Detective", comedy, 1994 , "PG-13", "5 Stars",  "A goofy detective specializing in animals goes in search of the missing mascot of the Miami Dolphins.", "This movie was funny!", "https://upload.wikimedia.org/wikipedia/en/8/84/Ace_ventura_pet_detective.jpg");
        movieStorage.addReview((movieReviewToAdd6));
        MovieReview movieReviewToAdd7 = new MovieReview("Freddy vs Jason", horror, 2003, "R", "5 Stars",  "Freddy Krueger and Jason Voorhees return to terrorize the teenage population. Except this time, they're out to get each other, too.", "Evil vs Evil two favorite slasher icons goes on each other Freddy vs Jason an epic battle fight. It is one of my personal favorite horror movies.", "https://upload.wikimedia.org/wikipedia/en/7/70/Freddy_vs._Jason_movie.jpg");
        movieStorage.addReview(movieReviewToAdd7);
        MovieReview movieReviewToAdd8 = new MovieReview("Get Out", horror, 2017, "R", "5 Stars",  "A young African-American visits his white girlfriend's parents for the weekend, where his simmering uneasiness about their reception of him eventually reaches a boiling point.", "The acting is wonderful, and directing is amazing.", "https://upload.wikimedia.org/wikipedia/en/a/a3/Get_Out_poster.png");
        movieStorage.addReview(movieReviewToAdd8);
        MovieReview mysteryMovie9 = new MovieReview("Knives Out", mystery, 2019, "PG-13", "5 Stars",  "Blanc must sift through a web of lies and red herrings to uncover the truth.", "Definitely a stand out film of 2019, breathed new air into mystery movies and 'who-done-its' as we know them. 'Knives Out, '  in the end, believes earnestly in the whodunit, it just wants to turn it inside out. To say more about that would spoil the fun.", "https://upload.wikimedia.org/wikipedia/en/1/1f/Knives_Out_poster.jpeg");
        movieStorage.addReview(mysteryMovie9);
        MovieReview mysteryMovie10 = new MovieReview("Vivarium", mystery, 2019, "R", "4 Stars",  "Hoping to find the perfect place to live, a couple travel to a suburban neighbourhood in which all the houses look identical. But when they try to leave the labyrinth-like development, each road mysteriously takes them back to where they started.","I was so onboard with this film for a long time. Really interesting setup and really great acting, but it just doesn't go anywhere. ", "https://www.reelviews.net/resources/img/posters/thumbs/vivarium.jpg");
        movieStorage.addReview(mysteryMovie10);
        MovieReview romanceMovie11 = new MovieReview("Mamma Mia", romance, 2008, "PG-13", "4 Stars",  "Donna (Meryl Streep), an independent hotelier in the Greek islands, is preparing for her daughter's wedding with the help of two old friends. Meanwhile Sophie, the spirited bride, has a plan.", "as convoluted as it gets, the great acting and wonderful music will keep you entertained till the end.", "https://upload.wikimedia.org/wikipedia/en/b/be/Mamma_Mia%21_Here_We_Go_Again.png");
        movieStorage.addReview((romanceMovie11));
        MovieReview romanceMovie12 = new MovieReview("50 First Dates", romance, 2004, "PG-13", "5 Stars",  "Playboy vet Henry sets his heart on romancing Lucy, but she has short-term memory loss; she can't remember anything that happened the day before. So every morning, Henry has to woo her again.", "The spark between the stars and a surprisingly thoughtful screenplay ensures that, despite the odd gross-out misstep, this is a sweet, warm and funny romantic comedy.", "https://i5.walmartimages.com/asr/6b15734e-acaa-4dc1-9c1c-9f98207c78c0_1.2921bcee4d4442c528814539482b1dc9.jpeg");
        movieStorage.addReview(romanceMovie12);
        MovieReview movieReviewToAdd20 = new MovieReview("Pulp Fiction", drama, 1994, "R", "5 Stars", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption. ", "One of the early scenes features two hit-men discussing what a Big Mac is called in other countries. Other than the comic payoff at the end of the scene, their talk has no relevance to anything in the film.", "https://upload.wikimedia.org/wikipedia/en/3/3b/Pulp_Fiction_%281994%29_poster.jpg");
        movieStorage.addReview(movieReviewToAdd20);
        MovieReview movieReviewToAdd21 = new MovieReview("Titanic", drama, 1997, "PG-13", "5 Stars", " A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.", " This movie will get you EVERY TIME. Titanic has made itself FOREVER a timeless classic! I just saw it today (2015) and I was crying my eyeballs out JUST like the first time I saw it back in 1998. This is a movie that is SO touching", "https://upload.wikimedia.org/wikipedia/en/1/19/Titanic_%28Official_Film_Poster%29.png");
        movieStorage.addReview(movieReviewToAdd21);
        MovieReview movieReviewToAdd22 = new MovieReview("The Shawshank Redemption", drama, 1994, "R", "5 Stars", " Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", "The Shawshank Redemption and To Kill a Mockingbird are the best movies I have ever seen. I do not judge it by it's technical merits - I don't really care about that. The best movies are ones that touch the soul.", "https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg");
        movieStorage.addReview(movieReviewToAdd22);
        MovieReview movieReviewToAdd23 = new MovieReview("Free Solo", documentary, 2018, "PG-13", "5 Stars", "Alex Honnold attempts to become the first person to ever free solo climb El Capitan.", "This movie shows the humanity, insanity, and personal struggle for perfection it takes to do things that no one else has done and few to none have tried to accomplish. Possibly the best movie I have ever seen in t...", "https://upload.wikimedia.org/wikipedia/en/9/9c/Free_Solo.png");
        movieStorage.addReview(movieReviewToAdd23);
        MovieReview movieReviewToAdd24 = new MovieReview("RBG", documentary, 2018, "PG", "5 Stars", " The exceptional life and career of U.S. Supreme Court Justice Ruth Bader Ginsburg, who has developed a breathtaking legal legacy while becoming an unexpected pop culture icon. ", " This movie is nothing more than hero worship. If you're looking for a more complex look at this remarkable woman.. . ", "https://upload.wikimedia.org/wikipedia/en/5/54/RBGfilmPoster.jpeg");
        movieStorage.addReview(movieReviewToAdd24);






        hashtagRepo.save(new Hashtag("#mustsee", movieReviewToAdd1));
        hashtagRepo.save(new Hashtag("#hilarious", movieReviewToAdd1, movieReviewToAdd2));
    }



}
