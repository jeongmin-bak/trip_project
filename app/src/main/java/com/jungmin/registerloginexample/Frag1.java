package com.jungmin.registerloginexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;
import java.util.Calendar;
import android.widget.ImageView;

public class Frag1 extends Fragment {
    private TextView textView;
    private View view;
    private ImageView imageView01;


    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        textView = view.findViewById(R.id.textView);
        Calendar cal = Calendar.getInstance();
        textView.setText(cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE));
        return view;
    }
    DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {

        @Override

        public void onDateSet(DatePicker datePicker, int yy, int mm, int dd) {

            // Date Picker에서 선택한 날짜를 TextView에 설정

            TextView tv = view.findViewById(R.id.textView);

            tv.setText(String.format("%d-%d-%d", yy, mm + 1, dd));

            if (((mm + 1) == 1)) {
                imageView01 = view.findViewById(R.id.imageView01);
                imageView01.setImageResource(R.drawable.month_1);
            }

            if (((mm + 1) == 2)) {
                imageView01 = view.findViewById(R.id.imageView01);
                imageView01.setImageResource(R.drawable.month_2);
            }

        }
    };

    public void mOnClick_DatePick(View view){

        // DATE Picker가 처음 떴을 때, 오늘 날짜가 보이도록 설정.

        Calendar cal = Calendar.getInstance();

        new DatePickerDialog(getActivity(), mDateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)).show();

    }
}