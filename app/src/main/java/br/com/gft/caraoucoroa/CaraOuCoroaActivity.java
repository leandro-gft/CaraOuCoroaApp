package br.com.gft.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class CaraOuCoroaActivity extends AppCompatActivity {

    private ImageView imgCaraCoroa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_ou_coroa);

        imgCaraCoroa = findViewById(R.id.imgCaraCoroa);

        Bundle dados = getIntent().getExtras();
        int numeroImg = dados.getInt("numero");

        imgCaraCoroa.setImageResource(numeroImg);

    }

    public void voltar(View view){
        finish();
    }
}
