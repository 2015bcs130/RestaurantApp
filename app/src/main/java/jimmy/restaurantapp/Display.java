package jimmy.restaurantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
TextView dish;
    TextView drink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        dish = (TextView) findViewById(R.id.txtv);
        Intent intentd = this.getIntent();
        String f = intentd.getStringExtra("Fish");
        String m = intentd.getStringExtra("Meat");
        String r = intentd.getStringExtra("Rice");
        String p = intentd.getStringExtra("Posho");

        dish.setText(f + " , " + m + " , " + r + " , " + p);

        drink = (TextView) findViewById(R.id.txtv1);
        Intent intent = this.getIntent();
        String mi = intent.getStringExtra("Mirinda");
        String fa = intent.getStringExtra("Fanta");
        String pe = intent.getStringExtra("Pepsi");
        String ma = intent.getStringExtra("MountainDiew");
        String pa = intent.getStringExtra("Passion");

        drink.setText(mi + " , " + fa + " , " + pe + " , " + ma + " , " + pa);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String mess = bundle.getString("radioChosen");
        }

    }}



