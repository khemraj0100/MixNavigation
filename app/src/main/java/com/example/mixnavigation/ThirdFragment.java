package com.example.mixnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment implements View.OnClickListener {

    private EditText editText;
    private Button btnlog;




    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_third,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnlog = (Button) view.findViewById(R.id.btnlogin);
        editText = (EditText) view.findViewById(R.id.url);

        btnlog.setOnClickListener(this);
    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnlogin:
                String url=editText.getText().toString().trim();
                Intent intent = new Intent(getActivity().getBaseContext(),
                        LoginActivity.class);
                intent.putExtra("url", url);
                getActivity().startActivity(intent);

                break;

        }


    }
}

