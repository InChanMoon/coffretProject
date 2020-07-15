package com.example.coffretproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;
import com.example.coffretproject.PasswordList.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Frag1 extends ListFragment {

    private ArrayList<passwordList> passwordLists = new ArrayList<>();
    private passwordListAdapter adpater;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String nowTime = simpleDateFormat.format(new Date());

        adpater = new passwordListAdapter(getActivity(),passwordLists);
        setListAdapter(adpater);

        passwordLists.add(new passwordList("test","test","test","test", nowTime));


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
