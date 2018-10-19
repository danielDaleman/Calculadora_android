package cosw.eci.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class calculadora_cosw extends AppCompatActivity {

    TextView display;
    double n1,n2,result;
    String Operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cosw);
    }

    public void bCero(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"0");
    }

    public void bOne(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"1");
    }

    public void bTwo(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"2");
    }

    public void bThree(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"3");
    }

    public void bFour(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"4");
    }

    public void bFive(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"5");
    }

    public void bSix(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"6");
    }

    public void bSeven(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"7");
    }

    public void bEight(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"8");
    }

    public void bNine(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+"9");
    }

    public void bPoint(View view){
        display = (TextView) findViewById(R.id.display);
        display.setText(display.getText()+".");
    }

    public void onClickOperationn1(View view){
        display = (TextView) findViewById(R.id.display);
        n1=Double.parseDouble(display.getText().toString());
        display.setText("");
    }

    public void Sum(View view){
        Operation = "+";
        onClickOperationn1(view);
    }

    public void Rest(View view){
        Operation = "-";
        onClickOperationn1(view);
    }

    public void Multi(View view){
        Operation = "*";
        onClickOperationn1(view);
    }

    public void Div(View view){
        Operation = "/";
        onClickOperationn1(view);
    }

    public void bEqual(View view){
        display = (TextView) findViewById(R.id.display);
        n2 = Double.parseDouble(display.getText().toString());

        if(Operation.equals("+")){
            result = n1 + n2;
        }else if(Operation.equals("-")){
            result = n1 - n2;
        }else if(Operation.equals("*")){
            result = n1 * n2;
        }else if(Operation.equals("/")){
            result = n1 / n2;
        }

        display.setText(""+result);
    }

    public void OpSqrt(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = Math.sqrt(n1);
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void sin(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = Math.sin(n1);
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void cos(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = Math.cos(n1);
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void tan(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = Math.tan(n1);
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void log(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = Math.log(n1);
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void bpow2(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = Math.pow(n1, 2);
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void bmm(View view){
        display = (TextView) findViewById(R.id.display);
        try{
            n1 = Double.parseDouble(display.getText().toString());
            result = n1*-1;
            display.setText(String.valueOf(result));
        }catch (NumberFormatException e){
        }
    }

    public void bDeleteAll(View view){
        n1= 0.0;
        n2 = 0.0;
        display = (TextView) findViewById(R.id.display);
        display.setText("");
    }
}
