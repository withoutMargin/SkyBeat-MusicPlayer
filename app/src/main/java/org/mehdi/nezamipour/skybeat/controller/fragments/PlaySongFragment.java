package org.mehdi.nezamipour.skybeat.controller.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.mehdi.nezamipour.skybeat.R;


public class PlaySongFragment extends Fragment {

    public PlaySongFragment() {
        // Required empty public constructor
    }

    public static PlaySongFragment newInstance() {
        PlaySongFragment fragment = new PlaySongFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_play_song, container, false);
    }
}