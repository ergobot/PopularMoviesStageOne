package com.demo.popularmoviesstageone.dummy;

import com.demo.popularmoviesstageone.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), R.drawable.startrekposter, R.drawable.backdrop, "Star Trek", "Sci-fis", getOverview(),"4.5","10/6/2016");
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    private static String getOverview(){
        return "This is the overview for the movie.  It is a summary of the movie without giving away the ending.  The user learns about movie details before finding more information.";
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final int posterImage;
        public final int backgroundImage;
        public final String title;
        public final String type;
        public final String overview;
        public final String rating;
        public final String releaseDate;

        public DummyItem(String id, int posterImage, int backgroundImage, String title, String type, String overview, String rating, String releaseDate) {
            this.id = id;
            this.posterImage = posterImage;
            this.backgroundImage = backgroundImage;
            this.title = title;
            this.type = type;
            this.overview = overview;
            this.rating = rating;
            this.releaseDate = releaseDate;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
