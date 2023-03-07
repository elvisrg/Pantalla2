package clase3.elvis.dispositvos_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView mostrarDatos, valor1, valor2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        String Lado1 = getIntent().getStringExtra("Lado1");
        String Lado2 = getIntent().getStringExtra("Lado2");
        publicarDatos(Lado1, Lado2);

    }
    public void publicarDatos (String Lado1, String Lado2){
        mostrarDatos = findViewById(R.id.datoRecibido);
        valor1 = findViewById(R.id.Lado1);
        valor2 = findViewById(R.id.Lado2);
        float L1=Float.parseFloat(Lado1);
        float L2=Float.parseFloat(Lado2);
        float Resultado=L1*L2;
        String  resul = String.valueOf(Resultado);
        mostrarDatos.setText(resul);
        valor1.setText(Lado1);
        valor2.setText(Lado2);
    }
}