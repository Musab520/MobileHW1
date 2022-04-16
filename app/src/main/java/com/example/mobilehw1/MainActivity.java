package com.example.mobilehw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mobilehw1.model.Drink;
import com.example.mobilehw1.model.DrinkMockup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private EditText edtDrinks;
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
        edtDrinks=findViewById(R.id.edtDrinks);
        btnSearch=findViewById(R.id.search);
        drinksSpinner=findViewById(R.id.drinks);
    }

    public void btnSubmit_OnClick(View view) {
        String drink=drinksSpinner.getSelectedItem().toString();
        DrinkMockup database =new DrinkMockup();
        ArrayList<Drink> result=database.getDrinks(drink);
        String res="";
for(int i=0;i<result.size();i++){
    res+=result.get(i).getName()+" "+result.get(i).getUnitPrice()+" \n";
}
edtDrinks.setText(res);


    }
}