package ch.ethz.inf.vs.a4.pascalo.chatapp.chatapp;

/**
 * Created by pascal on 21.11.16.
 */


import android.os.Bundle;
import android.preference.PreferenceFragment;


public class PrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}