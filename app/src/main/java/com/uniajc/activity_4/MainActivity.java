package com.uniajc.activity_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView txtV;
    private CheckBox checkSum,checkRes, checkExp,checkRad,checkAll,unCheckAll;

    public void operation(View view) {
        try {
            String valor1 = num1.getText().toString();
            String valor2 = num2.getText().toString();
            int n1 = Integer.parseInt(valor1);
            int n2 = Integer.parseInt(valor2);
            String msj = "";
            if  (checkSum.isChecked() == true){
                msj += "SUMA: "+String.valueOf(n1+n2)+"\n";
            }
            if  (checkRes.isChecked() == true){
                msj += " RESTA: "+String.valueOf(n1-n2)+"\n";
            }
            if  (checkExp.isChecked() == true){
                msj += "EXPONENTE: "+String.valueOf( Math.pow(n1,n2))+"\n";
            }
            if  (checkRad.isChecked() == true){
                msj += "RADICACIÓN : "+"\n"+"A = "+ String.valueOf(Math.sqrt(n1)) +"\n B = "+ String.valueOf(Math.sqrt(n2))+"\n" ;
            }

            txtV.setText(msj);

        } catch (Exception e) {
            // TODO: handle exception
            txtV.setText("Primero selecciona una opción");
        }
    }

    public void checkAll(View view) {
        checkSum.setChecked(true);
        checkRes.setChecked(true);
        checkExp.setChecked(true);
        checkRad.setChecked(true);
    }

    public void UnCheckAll(View view) {
        checkSum.setChecked(false);
        checkRes.setChecked(false);
        checkExp.setChecked(false);
        checkRad.setChecked(false);
        checkAll.setChecked(false);
    }


    public EditText getNum1() {return num1;}

    public EditText getNum2() {return num2;}

    public void setTxtV(TextView txtV) {this.txtV = txtV;}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtV = findViewById(R.id.txtV);
        checkSum = findViewById(R.id.checkSum);
        checkRes = findViewById(R.id.checkRes);
        checkExp = findViewById(R.id.checkExp);
        checkRad = findViewById(R.id.checkRad);
        checkAll = findViewById(R.id.checkAll);
        unCheckAll = findViewById(R.id.unCheckAll);
    }
}