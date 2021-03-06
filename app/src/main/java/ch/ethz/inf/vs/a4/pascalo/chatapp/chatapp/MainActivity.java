package ch.ethz.inf.vs.a4.pascalo.chatapp.chatapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,
        SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // register listener on chatList
        ListView chatListView = (ListView) findViewById(R.id.chatList);
        chatListView.setOnItemClickListener(this);

        // overflow menu
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        PreferenceManager.getDefaultSharedPreferences(this)
                .registerOnSharedPreferenceChangeListener(this);


        // TODO: set chats to list
            // store all chat partners (addressbook in a file) in order of most recent message
                // addressbook, we need one in any case

           // store chat messages per chat in a file named "cat_[chat partner name].???"
                // a little overhead but I think it's a lot easier to store and find them even we
                // have more overhead



        // idea copy most of the code from sensor app

        /*
        SensorArrayAdapter<Sensor> array_adapter = new SensorArrayAdapter<Sensor>(this,
                android.R.layout.simple_list_item_1,
                sensors);

        list_view.setAdapter(array_adapter);
        */



    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        // get chat at clicked item

        // start new activity with clicked chat data
        Intent chatIntent = new Intent(this, Chat.class);
        this.startActivity(chatIntent);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.settings :
                Intent myIntent = new Intent(this, SettingsActivity.class);
                this.startActivity(myIntent);
                break;
        }
        return true;
    }

}
