package clase3.elvis.dispositvos_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String TAG = "CLASE2";
    EditText valor1, valor2;
    TextView result;
    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "--Crear--");
        valor1 =findViewById(R.id.valor1);
        valor2 =findViewById(R.id.valor2);
        result =findViewById(R.id.resultado);
        //calculate =findViewById(R.id.calcular);
        calculate=(Button)findViewById(R.id.calcular);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Entre a onStart");
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla2(v);
            }


        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Entre a OnRestart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Entre a onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Entre a onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Entre a onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Entre a onDestroy");
    }

    public void pantalla2(View view){
        Intent pasarDato = new Intent(this, MainActivity2.class);
        pasarDato.putExtra("Lado1", valor1.getText().toString());
        pasarDato.putExtra("Lado2", valor2.getText().toString());
        startActivity(pasarDato);



    }

}
