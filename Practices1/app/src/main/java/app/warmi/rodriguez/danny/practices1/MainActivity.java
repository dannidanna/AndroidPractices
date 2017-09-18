package app.warmi.rodriguez.danny.practices1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMensaje;
    Button btnToast;
    ImageView imageView;
    TextView texto;
    Button btnNewScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMensaje = (Button) findViewById(R.id.btn1);
        btnToast = (Button) findViewById(R.id.btn2);
        btnNewScreen = (Button) findViewById(R.id.btn3);
        imageView = (ImageView) findViewById(R.id.imageView);
        texto = (TextView) findViewById(R.id.textView);
        btnMensaje.setOnClickListener(this);
        btnToast.setOnClickListener(this);
        btnNewScreen.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(this,"Mi prueba boton 1", Toast.LENGTH_LONG).show();
                texto.setText("Este es un cambio en el texto por Danny");
                break;
            case R.id.btn2:
                Toast.makeText(this,"Mi prueba Toast", Toast.LENGTH_LONG).show();
                imageView.setImageResource(R.drawable.woman);
                break;
            case R.id.btn3:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;

        }
    }
}
