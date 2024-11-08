package com.example.foodplanner.home.view;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.foodplanner.R;
import com.example.foodplanner.detailsmeals.view.DetailsMealFragmentArgs;

import java.net.URISyntaxException;

public class WatchVideoFragment extends Fragment {

    WebView webView;
    String url;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WatchVideoFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static WatchVideoFragment newInstance(String param1, String param2) {
        WatchVideoFragment fragment = new WatchVideoFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_watch_video, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        webView = view.findViewById(R.id.watchVideo);



// Retrieve the argument using Safe Args
        if (getArguments() != null) {

            WatchVideoFragmentArgs args = WatchVideoFragmentArgs.fromBundle(getArguments());
            url = args.getVideoId();

            webView.getSettings().setJavaScriptEnabled(true);
            // WebViewClient allows you to handle
            // onPageFinished and override Url loading.
            webView.setWebViewClient(new WebViewClient());
            String videoId = null;
            try {
                videoId = youTubeVideoIdFromUrl(url);
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }

// YouTube embed URL format
            String embedUrl = "https://www.youtube.com/embed/" + videoId;
            webView.loadUrl(embedUrl);


        }
    }







    public String youTubeVideoIdFromUrl(String url) throws URISyntaxException {
        Uri uri = Uri.parse(url); // Use Android Uri class to parse the URL
        String videoId = uri.getQueryParameter("v"); // Get 'v' parameter from the query

        if (videoId != null) {
            return videoId; // Return the video ID if found
        } else {
            // If the video ID is not in the query, return the last segment of the path
            String path = uri.getPath();
            return path.substring(path.lastIndexOf('/') + 1);
        }
    }


}
