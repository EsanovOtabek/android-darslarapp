package uz.lifepc.iqtisodiyotaktdarslari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

public class About extends AppCompatActivity {

    ImageButton tme,tel,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setTitle("Biz haqimizda");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(("#0099ff"))));


        tme=findViewById(R.id.imb1);
        mail=findViewById(R.id.imb2);
        tel=findViewById(R.id.imb3);

        tme.setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/odiljon81"));
            startActivity(intent);
        });
        mail.setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:khaydarovodiljon1981@gmail.com"));
            startActivity(intent);
        });
        tel.setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+998933325477"));
            startActivity(intent);
        });
    }
}