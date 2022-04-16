package com.example.mobilehw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mobilehw1.model.Drink;
import com.example.mobilehw1.model.DrinkMockup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView lstView;
private Button btnSearch;
private Spinner drinksSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setSpinner();
    }
private void setSpinner(){
        DrinkMockup database=new DrinkMockup();
        String[] cats=database.getCategories();
    ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,cats);
    drinksSpinner.setAdapter(adapter);
}
    private void setViews() {
      lstView=findViewById(R.id.list);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String info = lstView.getItemAtPosition(position).toString();
                Toast.makeText(getBaseContext(),info,Toast.LENGTH_LONG).show();
            }

        });
        btnSearch=findViewById(R.id.search);
        drinksSpinner=findViewById(R.id.drinks);
    }

    public void btnSubmit_OnClick(View view) {
        String drink=drinksSpinner.getSelectedItem().toString();
        DrinkMockup database =new DrinkMockup();
        ArrayList<Drink> result=database.getDrinks(drink);
      ArrayAdapter<Drink> lstAdapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,result);
      lstView.setAdapter(lstAdapter);

    }

}