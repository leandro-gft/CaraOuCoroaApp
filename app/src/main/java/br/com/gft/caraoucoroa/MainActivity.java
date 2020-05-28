package br.com.gft.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       }

    public void jogar(View view){
        Intent intent = new Intent(this, CaraOuCoroaActivity.class);
        int numero = new Random().nextInt(R.drawable.moeda_coroa-R.drawable.moeda_cara+1)+R.drawable.moeda_cara;
        intent.putExtra("numero", numero);

        startActivity(intent);

    }
}
