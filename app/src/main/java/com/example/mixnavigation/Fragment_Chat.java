package com.example.mixnavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Chat extends Fragment {

    ListView listView;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        listView =(ListView)view.findViewById(R.id.ListView2);

        final String[] name= {"broccoli",
                "corn","cucumber","pumpkin","corn","cucumber","pumpkin","cucumber","pumpkin","corn","cucumber","pumpkin","cucumber","pumpkin","corn","cucumber","pumpkin"};

        ArrayAdapter<String> listViewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,name);
        listView.setAdapter(listViewAdapter);


        }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_chat,null);
    }
}
