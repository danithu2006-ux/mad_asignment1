package com.nibm.startApp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FrgA extends Fragment {

    Button btnGoToB;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_frg_a, container, false);

        btnGoToB = view.findViewById(R.id.btnGoToB);

        btnGoToB.setOnClickListener(v -> {
            Act3HW activity = (Act3HW) getActivity();

            if (activity != null) {
                activity.loadFragment(new FrgB());
            }
        });

        return view;
    }
}