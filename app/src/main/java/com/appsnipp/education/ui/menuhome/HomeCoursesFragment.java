
package com.example.projetfedere.ui.menuhome;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.exemple.projetfedere.R;
import com.exemple.projetfedere.databinding.FragmentHomeCoursesBinding;

public class HomeCoursesFragment extends Fragment {

    FragmentHomeCoursesBinding binding;

    public HomeCoursesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("RestrictedApi")
    private void setUpUI() {
        String percentage = getResources().getString(R.string.percentage_course, 75);
        binding.tvPercentage.setText(percentage);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home_courses, container, false);

        binding = FragmentHomeCoursesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        setUpUI();
        return view;
    }
}