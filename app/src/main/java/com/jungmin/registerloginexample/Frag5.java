package com.jungmin.registerloginexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag5 extends Fragment {
    private TextView textView, textView3;
    private Button btn_mypass, btn_myinfo;
    private View view;

    public Frag5() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag5, container, false);

        btn_mypass = view.findViewById(R.id.btn_mypass);
        btn_mypass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), MypageActivity.class);
                startActivity(intent);
            }
        });
        //  btn_mypage.setOnClickListener(new View.OnClickListener() {
        // @Override
//
        //          public void onClick(View view) {
        //            String userID = tv_id.getText().toString();
        //          String userPass = tv_pass.getText().toString();

        //
        //      intent.putExtra("userID",userID);
        //    intent.putExtra("userPass",userPass);
        //  startActivity(intent);
        //}
        //});
        return view;
    }
}