package com.example.mixnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Camera extends Fragment {
    ListView listView;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        listView =(ListView)view.findViewById(R.id.ListView1);

        String[] name= {"Apple",
                "orange","Banana","pineApple","mango","orange","Banana","pineApple","mango","orange","Banana","pineApple","mango","orange","Banana","pineApple","mango","orange"};

        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,name);
        listView.setAdapter(listViewAdapter);



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_camera,null);

    }
}
