package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<AndroidVersion> alAndroidVersions;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;
    ListView lvAndroidVersions;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvAndroidVersions = findViewById(R.id.listView);

        //aaAndroidVersions = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, alAndroidVersions);
        alAndroidVersions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0-8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat","7.0-7.1.2");

        alAndroidVersions.add(new AndroidVersion("Pie","9.0"));
        alAndroidVersions.add(new AndroidVersion("Pie","9.0"));
        alAndroidVersions.add(new AndroidVersion("Pie","9.0"));
        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);
        adapter = new CustomAdapter(MainActivity.this,R.layout.row, alAndroidVersions);
        //lvAndroidVersions.setAdapter(aaAndroidVersions);
        lvAndroidVersions.setAdapter(adapter);



    }
}
