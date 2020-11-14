package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPAD, txtLT ;
    TextView tampilL, tampilK ;
    Button persegi , segitiga , lingkaran ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtPAD = findViewById(R.id.pad);
        txtLT = findViewById(R.id.lt);

        tampilL =findViewById(R.id.displayl);
        tampilK = findViewById(R.id.displayk);




    }
    public void dosomething(View view) {
        double num1;
        double num2;
        if(txtPAD.getText().toString().isEmpty() || txtLT.getText().toString().isEmpty())
        {
            num1 =0;
            num2 =0;
        }
        else
        {
            num1 = Double.parseDouble(txtPAD.getText().toString());
            num2 = Double.parseDouble(txtLT.getText().toString());
        }
        double pi=3.14;
        double r=num1 / 2;
        switch (view.getId())
        {
            case R.id.persegi:
                if(num1 ==0 ||num2 ==0)
            {
                AlertDialog.Builder myalert = new AlertDialog.Builder(this);
                myalert.setTitle("input kosong");
                myalert.setMessage("jangan sampai kosong");
                myalert.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                    myalert.show();
            }
                else
            {
                double luas = num1 * num2;
                double keliling = (2*num1)+(2*num2);
                tampilL.setText(Double.toString(luas));
                tampilK.setText(Double.toString(keliling));
            }
                break;

            case R.id.segitiga:
                if(num1 ==0 ||num2 ==0)
            {
                AlertDialog.Builder myalert = new AlertDialog.Builder(this);
                myalert.setTitle("input kosong");
                myalert.setMessage("jangan sampai kosong");
                myalert.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                myalert.show();
            }
                else
            {
                double luas = (num1 * num2) / 2;
                double keliling = 3 * num1;
                tampilL.setText(Double.toString(luas));
                tampilK.setText(Double.toString(keliling));
            }
                break;
            case R.id.lingkaran:
                if(num1 ==0 ||num2 ==0)
            {
                AlertDialog.Builder myalert = new AlertDialog.Builder(this);
                myalert.setTitle("input kosong");
                myalert.setMessage("jangan sampai kosong");
                myalert.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                myalert.show();
            }
                else
            {
                double luas = pi *r*r;
                double keliling = pi* num1;
                tampilL.setText(Double.toString(luas));
                tampilK.setText(Double.toString(keliling));
            }
                break;
        }
    }
}