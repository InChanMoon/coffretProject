package com.example.coffretproject.PasswordList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.coffretproject.R;

import java.util.ArrayList;

public class passwordListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<passwordList> passwordLists;

    public passwordListAdapter(Context context, ArrayList<passwordList> passwordLists) {
        this.context = context;
        this.passwordLists = passwordLists;
    }

    @Override
    public int getCount() {
        return passwordLists.size();
    }

    @Override
    public Object getItem(int position) {
        return passwordLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.password_list, null);
        TextView titleTexView = v.findViewById(R.id.titleTextView);



        return v;
    }
}
