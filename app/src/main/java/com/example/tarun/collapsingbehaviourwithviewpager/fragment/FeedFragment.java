package com.example.tarun.collapsingbehaviourwithviewpager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tarun.collapsingbehaviourwithviewpager.R;
import com.example.tarun.collapsingbehaviourwithviewpager.adapter.MyAdapter;

/**
 * Created by tarun on 6/6/16.
 */
public class FeedFragment extends Fragment {

    /**
     * Static factory method that takes an int parameter,
     * initializes the fragment's arguments, and returns the
     * new fragment to the client.
     */
    public static FeedFragment newInstance() {
        FeedFragment f = new FeedFragment();
        Bundle args = new Bundle();
      //  args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.list, container, false);

        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        String[] myDataset = getResources().getStringArray(R.array.items);

        RecyclerView.Adapter mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
}
