package com.example.mixnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {



    RadioButton genderradioButton;
    RadioGroup radioGroup;
    private EditText editText;

    private SeekBar seekBar;

    private Button button;
    private CheckBox checkBox1,checkBox2;
    private int age;
    private String course;


        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_second,container,false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        editText =(EditText)view.findViewById(R.id.editText1);
        radioGroup =(RadioGroup)view.findViewById(R.id.radioGroup);


        seekBar= (SeekBar)view.findViewById(R.id.seekBar);

        checkBox1 = (CheckBox)view.findViewById(R.id.checkbox1);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                course = checkBox1.getText().toString();
            }
        });
        checkBox2 = (CheckBox)view.findViewById(R.id.checkbox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                course = checkBox2.getText().toString();
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    age=i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button = (Button)view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                int selectId= radioGroup.getCheckedRadioButtonId();

                genderradioButton=(RadioButton)view.findViewById(selectId);

                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("gender",genderradioButton.getText().toString());
                bundle.putInt("age",age);
                bundle.putString("course",course);
                LoginFragmentSecond fragment2 = new LoginFragmentSecond();
                fragment2.setArguments(bundle);

                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame, fragment2)
                        .commit();

            }
        });



    }
}

