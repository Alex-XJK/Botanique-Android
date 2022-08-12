package com.example.botanique.ui.dashboard;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.botanique.R;
import com.example.botanique.databinding.FragmentLightBinding;
import com.example.botanique.ui.dashboard.DashboardViewModel;

public class LightFragment extends Fragment {

    public LightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        DashboardViewModel dashboardViewModel;
        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        final FragmentLightBinding binding;
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_light,container,false);
        binding.setData(dashboardViewModel);
        binding.setLifecycleOwner(requireActivity());

        return binding.getRoot();
    }
}