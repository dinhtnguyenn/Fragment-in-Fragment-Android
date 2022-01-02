package com.dinhnt.viewpager2.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dinhnt.viewpager2.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Fragment childFragment1 = new Child1Fragment();
        FragmentTransaction transaction1 = getChildFragmentManager().beginTransaction();
        transaction1.replace(R.id.child_fragment1, childFragment1).commit();

        Fragment childFragment2 = new Child2Fragment();
        FragmentTransaction transaction2 = getChildFragmentManager().beginTransaction();
        transaction2.replace(R.id.child_fragment2, childFragment2).commit();

        return view;
    }
}
