package com.example.dexter.calculatornewfull;

import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.lang.Math;
public class MainActivity extends AppCompatActivity  {

    public String str ="";
    Character op = 'q';
    double i,num,numtemp;
    EditText showResult;
    Button x2,x3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       x2=(Button)findViewById(R.id.btnX2);
        x2.setText(Html.fromHtml(getResources().getString(R.string.X2)));
        showResult = (EditText)findViewById(R.id.display);

    }

    public void clickedBtn1(View v){
        insert("1");

    }

    public void clickedBtn2(View v){
        insert("2");

    }
    public void clickedBtn3(View v){
        insert("3");

    }
    public void clickedBtn4(View v){
        insert("4");

    }
    public void clickedBtn5(View v){
        insert("5");

    }
    public void clickedBtn6(View v){
        insert("6");
    }
    public void clickedBtn7(View v){
        insert("7");

    }
    public void clickedBtn8(View v){
        insert("8");

    }
    public void clickedBtn9(View v){
        insert("9");

    }
    public void clickedBtn0(View v){
        insert("0");

    }
    public void clickedBtndot(View v){
        insert(".");

    }


    public void clickedtan(View v){
        op='T';
        Toast.makeText(getApplicationContext(),"tan",Toast.LENGTH_SHORT).show();

    }
    public void clickedSin(View v){
        op='S';
        Toast.makeText(getApplicationContext(),"Sin",Toast.LENGTH_SHORT).show();

    }
    public void clickedCos(View v){
       showResult.setText("Cos(");
        op='C';
       // Toast.makeText(getApplicationContext(),"Cos",Toast.LENGTH_SHORT).show();

    }
    public void clickedSqrt(View v){
        showResult.setText("Cos(");
        op='√';
        //Toast.makeText(getApplicationContext(),"√",Toast.LENGTH_SHORT).show();

    }
    public void clickedBtnx2(View v){
        perform();
        op = 'X';

    }
    public void clickedBtnlog(View v){

        op = 'L';

    }

    public void clickedBtnplus(View v){
        perform();
        op = '+';

    }

    public void clickedMinus(View v){
        perform();
        op = '-';

    }
    public void clickedBtnDiv(View v){
        perform();
        op = '/';

    }
    public void clickedBtnMul(View v){
        perform();
        op = '*';

    }
    public void clickedBtnequal(View v){
        calculate();

    }

    public void clickedBtnClear(View v){
        reset();
    }


    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    public void insert(String j) {
        // TODO Auto-generated method stub

        str = str+j;

        num = Double.valueOf(str);

        showResult.setText(str);

    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        numtemp = num;
    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
             num = numtemp+num;
        else if(op == '-')
             num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        else  if(op=='C')
        {
           perform();

            num=Math.cos(Math.toRadians(numtemp));

        }
        else  if(op=='S')
        {
            perform();

            num=Math.sin(Math.toRadians(numtemp));

        }
        else  if(op=='T')
        {
            perform();

            num=Math.tan(Math.toRadians(numtemp));

        }

        else  if(op=='√')
        {
            perform();

            num=Math.sqrt(numtemp);

        }
        else  if(op=='X')
        {
            num=numtemp*numtemp;

        }
        else  if(op=='L')
        {
            perform();
            num=Math.log(numtemp);

        }
       // showResult.setText("Cos(" + numtemp + ")");
        showResult.setText(String.valueOf(num).toString());
        }
}
