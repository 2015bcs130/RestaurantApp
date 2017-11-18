package jimmy.restaurantapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.os.Build.RADIO;

public class Order extends AppCompatActivity {
    private RadioGroup rg;
    Intent intentc;
    private RadioButton table;
    private Button ord;

    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        setContentView(R.layout.activity_order);
        intentc = new Intent(Order.this, Display.class);
        rg = (RadioGroup) findViewById(R.id.table);
        ord = (Button) findViewById(R.id.btno);



        ord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intentc);
                //get the selected button from the radio group
                int selected = rg.getCheckedRadioButtonId();
                table = (RadioButton) findViewById(selected);
                Toast.makeText(Order.this, table.getText(), Toast.LENGTH_LONG).show();
                // c1.getText().toString();



            }
        });
    }
    public void onRadioClick(View view){
        boolean check = ((RadioButton) view).isChecked();


        switch (view.getId()){
            case R.id.t1: if(check)
                str = "Tab1";
                break;
            case R.id.t2: if(check)  str = "Tab1";
                break;
            case R.id.t3: if(check)  str = "Tab1";
                break;
            case R.id.t4: if(check)  str = "Tab1";
                break;
        }
        intentc.putExtra("radioChosen", str);
    }

    public void onCheckedBox(View v){
        boolean checked = ((CheckBox) v).isChecked();
        switch(v.getId()){
            case R.id.c1:if(checked){
                intentc.putExtra("Fish", "Fish");
            }else {
                intentc.removeExtra("Fish");
            }
            break;
            case R.id.c2:if(checked){
                intentc.putExtra("Meat", "Meat");
            }else {
                intentc.removeExtra("Meat");
            }
                break;
            case R.id.c3:if(checked){
                intentc.putExtra("Rice", "Rice");
            }else {
                intentc.removeExtra("Rice");

            }
                break;
            case R.id.c4:if(checked){
                intentc.putExtra("Posho", "Posho");
            }else {
                intentc.removeExtra("Meat");
            }
                break;
            default:break;
        }

    }
    public void onCheck(View v1){
        boolean checked = ((CheckBox) v1).isChecked();
        switch(v1.getId()){
            case R.id.d1:if(checked){
                intentc.putExtra("Mirinda", "Mirinda");
            }else {
                intentc.removeExtra("Mirinda");
            }
                break;
            case R.id.d2:if(checked){
                intentc.putExtra("Fanta", "Fanta");
            }else {
                intentc.removeExtra("Fanta");
            }
                break;
            case R.id.d3:if(checked){
                intentc.putExtra("Pepsi", "Pepsi");
            }else {
                intentc.removeExtra("Rice");
            }
                break;
            case R.id.d4:if(checked){
                intentc.putExtra("MountainDiew", "MoutainDiew");
            }else {
                intentc.removeExtra("MountainDiew");
            }
                break;
            case R.id.d5:if(checked){
                intentc.putExtra("Passion", "Passion");
            }else {
                intentc.removeExtra("Passion");
            }
                break;
            default:break;
        }

    }
}
