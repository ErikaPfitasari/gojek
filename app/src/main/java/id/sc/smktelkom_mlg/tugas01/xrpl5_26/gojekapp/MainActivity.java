package id.sc.smktelkom_mlg.tugas01.xrpl5_26.gojekapp;

import android.service.voice.AlwaysOnHotwordDetector;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email, address ;
    RadioButton cod, transfer;
    CheckBox ride, food, mart;
    Button book;
    TextView hasill;
    Spinner kota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.hemail);
        address = (EditText) findViewById(R.id.haddress);
        cod = (RadioButton) findViewById(R.id.hcod);
        transfer = (RadioButton) findViewById(R.id.htransfer);
        ride = (CheckBox) findViewById(R.id.hride);
        food = (CheckBox) findViewById(R.id.hfood);
        mart = (CheckBox)findViewById(R.id.hmart);
        hasill = (TextView) findViewById(R.id.hasil1);

        book = (Button) findViewById(R.id.hbook);
        kota = (Spinner)findViewById(R.id.spinner);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String hemail = email.getText().toString();
                String haddress = address.getText().toString();
                String hservice ="\n\n SERVICE:\n";
                String payment= null;
                int startlen = hservice.length();

                if(ride.isChecked()) hservice+=ride.getText()+"\n";
                if(food.isChecked()) hservice+=food.getText()+"\n";
                if(mart.isChecked()) hservice+=mart.getText()+"\n";

                if(cod.isChecked())
                {
                    payment = cod.getText().toString();
                }
                else if(transfer.isChecked());
                {
                    payment = transfer.getText().toString();
                }

                if(hservice.length()== startlen) hservice+="Tidak Memilih";


                hasill.setText("EMAIL:\n"+hemail+"\nADDRESS:\n"+haddress
                        +hservice+kota.getSelectedItem().toString()+"\nPAYMENT\n"+payment);








            }
        });


}
}
