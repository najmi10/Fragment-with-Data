package com.example.myfragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName, txtAge, txtNumber, txtAddress;
    public SecondFragment() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise ViewModel here
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtAge = view.findViewById(R.id.textViewAge);
        txtNumber=view.findViewById(R.id.textViewNumber);
        txtAddress = view.findViewById(R.id.textViewAddress);

        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtName.setText(s);
            }
        });
        pageViewModel.getAge().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtAge.setText(s);
            }
        });
        pageViewModel.getNumber().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtNumber.setText(s);
            }
        });
        pageViewModel.getAddress().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtAddress.setText(s);
            }
        });
    }
}