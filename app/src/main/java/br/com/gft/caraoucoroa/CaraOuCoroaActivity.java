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
        Random random = new Random();
        imgCaraCoroa.setImageResource(random.nextInt(R.drawable.moeda_coroa-R.drawable.moeda_cara+1)+R.drawable.moeda_cara);
    }

    public void voltar(View view){
        finish();
    }
}
