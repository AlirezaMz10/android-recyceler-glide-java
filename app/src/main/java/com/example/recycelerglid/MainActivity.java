package com.example.recycelerglid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycelerglid.adapter.UserAdapter;
import com.example.recycelerglid.global.Globals;
import com.example.recycelerglid.model.User;

import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String links[] = getResources().getStringArray(R.array.links);
        String username[] = getResources().getStringArray(R.array.usernames);

        RecyclerView rcv = findViewById(R.id.rcv);
        Random random = new Random(new Date().getTime());
        for (int i = 1; i <= 100; i++) {
            Globals.users.add(new User(i, links[random.nextInt(links.length)],
                    username[random.nextInt(username.length)]));
        }
        adapter = new UserAdapter(Globals.users, MainActivity.this);
        adapter.setActivity(this);
        rcv.setAdapter(adapter);
        rcv.setLayoutManager(new LinearLayoutManager(getBaseContext()));

    }
}