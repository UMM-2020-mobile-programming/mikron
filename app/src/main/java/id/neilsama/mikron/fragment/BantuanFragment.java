package id.neilsama.mikron.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import id.neilsama.mikron.R;

public class BantuanFragment extends Fragment {
    public BantuanFragment() {
        // Required empty public constructor
    }
    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.xml.fragment_bantuan, container, false);
    }
}
