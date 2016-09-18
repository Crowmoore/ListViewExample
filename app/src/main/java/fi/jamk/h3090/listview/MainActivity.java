package fi.jamk.h3090.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        String[] phones = new String[]{
                "Android", "Blackberry", "iPhone", "WindowsMobile", "WebOS", "Ubuntu",
                "Android", "Blackberry", "iPhone", "WindowsMobile", "WebOS", "Ubuntu"
        };

        final ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < phones.length; i++) {
            list.add(phones[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.rowlayout, R.id.textView, list);

        listView.setAdapter(adapter);
    }
}