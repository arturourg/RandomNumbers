package cl.ubb.randomnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView firstNumber = (ImageView) findViewById(R.id.primerNumero);

        final ImageView secondNumber = (ImageView) findViewById(R.id.segundoNumero);

        final ImageView logo = (ImageView) findViewById(R.id.Logo);

        Button btnRandom = (Button) findViewById(R.id.botonRandom);

        //Cargar los numeros que estan en la carpeta Drawable
        final int [] numbersId =
                {
                        R.drawable.cero,
                        R.drawable.uno,
                        R.drawable.dos,
                        R.drawable.tres,
                        R.drawable.cuatro,
                        R.drawable.cinco,
                        R.drawable.seis,
                        R.drawable.siete,
                        R.drawable.ocho,
                        R.drawable.nueve
                };

        btnRandom.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view){

               Log.d("Button Click", "El boton ha sido presionao' compare shoro, azi ke voh traki noma");
               int random = (int) (Math.random()*9);
               int random2 = (int) (Math.random()*9);

               firstNumber.setImageResource(numbersId[random]);
               secondNumber.setImageResource(numbersId[random2]);
           }
        });
    }
}
