package uz.lifepc.iqtisodiyotaktdarslari;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ImageView bos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        bos=findViewById(R.id.boss);
//
//        bos.setOnLongClickListener(v -> {
//            AlertDialog alertDialog=new AlertDialog.Builder(this).
//                    setTitle("Dasturchi haqida:")
//                    .setMessage("Esanov Otabek, (www.lifepc.uz)")
//                    .setPositiveButton("Ok\uD83D\uDE01", (dialog, which) -> dialog.cancel()).show();
//
//            return true;
//        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3333);

    }
}