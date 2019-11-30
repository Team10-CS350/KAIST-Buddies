package com.example.buddyapp3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityEventBoard extends AppCompatActivity {
    ListView listView;
    private ImageView addEvent;
    long backPressedTime;
    Boolean eventIsEmpty = true;

    /* test code */
    String titles[] = {"sometitle", "sometitle2"};
    String descriptions[] = {"somedescription1", "somedescription2"};
    int images[] = {R.drawable.active, R.drawable.expired };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_board);

        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, titles, descriptions, images);
        listView.setAdapter(adapter);


        addEvent = findViewById(R.id.addEvent);
        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastThis("adding new event");
            }
        });

        listView = (ListView) findViewById(R.id.listView);


    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - backPressedTime < 2000) {
            moveTaskToBack(true);
            android.os.Process.killProcess (android.os.Process.myPid());
            System.exit(0);
            return;
        } else {
                toastThis("press back again to exit");
                backPressedTime = System.currentTimeMillis();
        }
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        MyAdapter (Context context, String titles[], String desc[], int images[] ) {
            super(context, R.layout.event_row, R.id.mainTitle, titles);
            this.context = context;
            this.rTitle = titles;
            this.rDescription = desc;
            this.rImages = images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row =  layoutInflater.inflate(R.layout.event_row, parent, false);
            ImageView image = row.findViewById(R.id.listImage);
            TextView title = row.findViewById(R.id.mainTitle);
            TextView description = row.findViewById(R.id.description);

            image.setImageResource(rImages[position]);
            title.setText(rTitle[position]);
            description.setText(rDescription[position]);

            return row;
        }

    }


    public void toastThis(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
