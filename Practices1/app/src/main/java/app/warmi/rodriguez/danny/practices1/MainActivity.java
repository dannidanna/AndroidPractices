package app.warmi.rodriguez.danny.practices1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMensaje;
    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMensaje = (Button) findViewById(R.id.btn1);
        btnToast = (Button) findViewById(R.id.btn2);
        btnMensaje.setOnClickListener(this);
        btnToast.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(this,"Mi prueba boton 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                Toast.makeText(this,"Mi prueba Toast", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
