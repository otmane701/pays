package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
EditText item;
Button ajouter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.list);
        ArrayList<String>contry=new ArrayList<>();
        contry.add("maroc");
        contry.add("algerai");
        contry.add("tunissia");
        contry.add("irak");
        contry.add("palisstin");
        contry.add("egibt");
        contry.add("moritain");
        contry.add("maroc");
        contry.add("algerai");
        contry.add("tunissia");
        contry.add("irak");
        contry.add("palisstin");
        contry.add("egibt");
        contry.add("moritain");
item=findViewById(R.id.text);
ajouter=findViewById(R.id.ajouter);
ajouter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        contry.add(item.getText().toString());
    }
});
//  i have been modifacated

//        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,
//                android.R.layout.select_dialog_singlechoice,
//                contry);
//        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//       // lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        lv.setAdapter(adapter);
        classAdapter adapter=new classAdapter(contry,this);
        lv.setAdapter(adapter);
    }
}