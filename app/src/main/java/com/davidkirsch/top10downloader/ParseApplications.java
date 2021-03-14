package com.davidkirsch.top10downloader;

import java.util.ArrayList;

/**
 * Created by davidkirsch on 3/13/21.
 */

public class ParseApplications {
    private static final String TAG = "ParseApplications";
    private ArrayList<FeedEntry> applications;

    public ParseApplications() {
        this.applications = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }
}
