package com.example.museumapp.ui.science_fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.museumapp.R;
import com.example.museumapp.ui.museum_of_illusions_folder.museum_of_illusions;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link science#newInstance} factory method to
 * create an instance of this fragment.
 */
public class science extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public science() {
        // Required empty public constructor
    }

    public static science newInstance(String param1, String param2) {
        science fragment = new science();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_science, container, false);
        ImageButton imuImageButton = (ImageButton) root.findViewById(R.id.imu_banner);
        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment_content_main);
        imuImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_museum_of_illusions);
            }
        });
        ImageButton elteBtn = (ImageButton) root.findViewById(R.id.elte_banner);
        elteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_elte);
            }
        });
        ImageButton semmelweisbtn = (ImageButton) root.findViewById(R.id.semmelweis_banner);
        semmelweisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_elte/*NOTE CHANGE!*/);
            }
        });
        ImageButton konkolybtn = (ImageButton) root.findViewById(R.id.konkoly_banner);
        konkolybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.nav_elte/*NOTE CHANGE!*/);
            }
        });
        return root;
    }
}