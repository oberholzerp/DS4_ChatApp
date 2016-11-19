package ch.ethz.inf.vs.a4.pascalo.chatapp.chatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // register listener on chatList

    }


    @Override
    public void onClick(View v) {
        // start new Chat with Intent
    }
}
