package uz.lifepc.iqtisodiyotaktdarslari;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DarsView extends AppCompatActivity {

    PDFView book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dars_view);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0099ff")));

        Bundle bundle=getIntent().getExtras();
        int id =Integer.parseInt(bundle.getString("id")),x;
        String title = bundle.getString("title");
        String mavzu = bundle.getString("mavzu");

        getSupportActionBar().setTitle(title);
        String pdfadress=id+".pdf";
        book=(PDFView)findViewById(R.id.pdfview);
        book.fromAsset(pdfadress).load();
    }
}