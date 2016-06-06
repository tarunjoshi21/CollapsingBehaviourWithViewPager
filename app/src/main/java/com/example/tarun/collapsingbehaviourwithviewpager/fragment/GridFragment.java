package com.example.tarun.collapsingbehaviourwithviewpager.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.tarun.collapsingbehaviourwithviewpager.R;
import com.example.tarun.collapsingbehaviourwithviewpager.adapter.ImageAdapter;

/**
 * Created by tarun on 6/6/16.
 */
public class GridFragment extends Fragment {

    /**
     * Static factory method that takes an int parameter,
     * initializes the fragment's arguments, and returns the
     * new fragment to the client.
     */
    public static GridFragment newInstance() {
        GridFragment f = new GridFragment();
        Bundle args = new Bundle();
        //  args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.grid, container, false);

        GridView gridview = (GridView) view.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(getContext()));

        // CoordinatorLayout works only with RecyclerView and NestedScrollView
        // show need to enable nested scrolling
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            gridview.setNestedScrollingEnabled(true);
        }

        return view;
    }
}