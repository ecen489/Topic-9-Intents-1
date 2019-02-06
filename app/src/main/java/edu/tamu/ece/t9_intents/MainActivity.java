package edu.tamu.ece.t9_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    private static final String[] WORDS ={"Tiger","Eagle","Whale"};
    private static final String[] FAM ={"Big Cat","Bird","Marine Mammal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //attach reference list to mylist
        ListView list = (ListView) findViewById(R.id.mylist);

        final Intent intent = new Intent(this,ImgDisp.class);

        //Create adapter and attach to WORDS
        ArrayAdapter<String> myadapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,WORDS);

        //Use myadapter as input to list
        list.setAdapter(myadapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String word =parent.getItemAtPosition(position).toString();
                if(word.equals(WORDS[0])){
                    String typ= new String();
                    typ=FAM[0];
                    //Toast.makeText(MainActivity.this, typ, Toast.LENGTH_SHORT).show();
                    intent.putExtra("animal",WORDS[0]);
                    startActivity(intent);
                }

                if(word.equals(WORDS[1])){
                    String typ= new String();
                    typ=FAM[1];
                    Toast.makeText(MainActivity.this, typ, Toast.LENGTH_SHORT).show();
                }

                if(word.equals(WORDS[2])){
                    String typ= new String();
                    typ=FAM[2];
                    Toast.makeText(MainActivity.this, typ, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
