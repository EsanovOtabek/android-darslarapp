package uz.lifepc.iqtisodiyotaktdarslari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Lessons> lessonsList=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Darslar");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0099ff")));

        addLessons();

        mAdapter adapter=new mAdapter(this,lessonsList);
        recyclerView=findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.tool_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:{
                Toast.makeText(this,"About",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,About.class);
                startActivity(intent);
                return  true;
            }
            case R.id.logout:{
                AlertDialog alertDialog=new AlertDialog.Builder(this)
                        .setTitle("Chiqish!")
                        .setMessage("Dasturdan chiqishni xohlaysizmi?")
                        .setNegativeButton("Yo'q",(dialog, which) -> dialog.cancel())
                        .setPositiveButton("Ha",(dialog, which) -> {
                            finish();
                            System.exit(3);
                        }).show();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    private void addLessons(){
        lessonsList.add(new Lessons("1-Ma'ruza","IQTISODIYOTDA AXBOROT KOMMUNIKATSIYA TEXNOLOGIYALARI"));
        lessonsList.add(new Lessons("1-Amaliy mashg'ulot","MA’LUMOTLARNI KODLASHTIRISH."));
        lessonsList.add(new Lessons("1-Labaratoriya ishi","TURLI SANOQ TIZIMLARIDA AMALLAR BAJARISH BO’YICHA LABORATORIYA TOPSHIRIQLARINI BAJARISH"));
        lessonsList.add(new Lessons("2-Ma'ruza","AXBOROTNING NAZARIY ASOSLARI"));
        lessonsList.add(new Lessons("2-Amaliy mashg'ulot","OPERASION TIZIMLAR. WINDOWS OTDA ISHLASH KO’NIKMALARINI TAKOMILLASHTIRISH."));
        lessonsList.add(new Lessons("2-Labaratoriya ishi","WINDOWS OTDA FAYLLAR TIZIMI BILAN ISHLASH. FAYLLAR VA PAPKALAR USTIDA AMALLAR BAJARISH. MAVZU BO’YICHA LABORATORIYA TOPSHIRIQLARINI BAJARISH"));
        lessonsList.add(new Lessons("3-Ma'ruza","AXBOROT JARAYONINING APPARAT TA’MINOTI"));
        lessonsList.add(new Lessons("3-Amaliy mashg'ulot","MATN MUXARRIRLARIDA XUJJAT VA XISOBOTLAR YARATISH."));
        lessonsList.add(new Lessons("3-Labaratoriya ishi","MS WORD DASTURI YORDAMIDA QISHLOQ XO’JALIGI SOHASIGA OID ME’YORIY XUJJATLAR TAYYORLASH BO’YICHA LABORATORIYA TOPSHIRIQLARNI BAJARISH"));
        lessonsList.add(new Lessons("4-Ma'ruza","AXBOROT JARAYONLARINING DASTURIY TA’MINOTI"));
        lessonsList.add(new Lessons("4-Amaliy mashg'ulot","TAQDIMOT DASTURLARIDA SOHAGA OID TAQDIMOTLAR YARATISH"));
        lessonsList.add(new Lessons("4-Labaratoriya ishi","SOHAGA OID TAQDIMOTLAR YARATISH BO’YICHA LABORATORIYA TOPSHIRIQLARINI BAJARISH"));
        lessonsList.add(new Lessons("5-Ma'ruza",":OPERATSION TIZIMLAR VA ULARNING TURLARI"));
        lessonsList.add(new Lessons("5-Amaliy mashg'ulot","MS EXCEL DASTURIDA SOHAGA OID SONLI MA’LUMOTLAR BILAN ISHLASH."));
        lessonsList.add(new Lessons("5-Labaratoriya ishi","MS EXCEL DASTURI YORDAMIDA QISHLOQ XO’JALIGI OID MASALALAR BO’YICHA LABORATORIYA TOPSHIRIQLARINI BAJARISH"));
        lessonsList.add(new Lessons("6-Ma'ruza","MICROSOFT WINDOWS OPERATSION TIZIMIDA FAYLLAR BILAN ISHLASH"));
        lessonsList.add(new Lessons("6-Amaliy mashg'ulot","MS EXCEL DA TEXNIKIQTISODIY MASALALAR YECHISH"));
        lessonsList.add(new Lessons("6-Labaratoriya ishi","MS EXCEL DASTURI YORDAMIDA IQTISODIY MASALALARNI YECHISHGA OID LABORATORIYA TOPSHIRIQLARINI BAJARISH"));
        lessonsList.add(new Lessons("7-Ma'ruza","MATNLI AXBOROTLARNI QAYTA ISHLASH TEXNOLOGIYALARI"));
        lessonsList.add(new Lessons("7-Amaliy mashg'ulot","MS ACCESS OBYEKTLARI BILAN ISHLASH VA JADVALLAR HOSIL QILISH."));
        lessonsList.add(new Lessons("7-Labaratoriya ishi","MS ACCESSDA SOHAGA OID MA’LUMOTLAR BAZASINI YARATISH BO’YICHA LABORATORIYA TOPSHIRIQLARNI BAJARISH "));
        lessonsList.add(new Lessons("8-Ma'ruza","JADVAL PROTSESSORLARIDAN SOHAGA OID SONLI MA’LUMOTLAR BILAN ISHLASH\n"));
        lessonsList.add(new Lessons("8-Amaliy mashg'ulot","Biznes jarayonlarni boshqarish tizimlari"));
        lessonsList.add(new Lessons("8-Labaratoriya ishi","KATTA TA’LUMOTLAR BILAN ISHLASH. MS ACCESSDA MA’LUMOTLAR BAZASIDA SOHAGA OID SHAKL VA XISOBOTLAR YARATISH BO’YICHA TOPSHIRIQLARNI BAJARISH"));
        lessonsList.add(new Lessons("9-Ma'ruza","JADVAL PROTSESSORIDAN IQTISODIY MASALALAR YECHIMINI IZLASH"));
        lessonsList.add(new Lessons("9-Amaliy mashg'ulot","AXBOROT TIZIMLARI, TEXNOLOGIK JARAYONLARINI BOSHQARISH TIZIMLARI BILAN TANISHISH VA UNDA ISHLASH"));
        lessonsList.add(new Lessons("9-Labaratoriya ishi","TEXNOLOGIK JARAYONLARINI BOSHQARISH TIZIMLARI BO’YICHA TOPSHIRIQLARNI BAJARISH "));
        lessonsList.add(new Lessons("10-Ma'ruza","TAQDIMOTLAR TUZISH VA ULAR BILAN ISHLASH TEXNOLOGIYALARI. "));
        lessonsList.add(new Lessons("10-Amaliy mashg'ulot","INTERNET XIZMATLARI, AXBOROT QIDIRUV TIZIMLARI BILAN ISHLASH. "));
        lessonsList.add(new Lessons("10-Labaratoriya ishi","AVTOMATLASHTIRILGAN TEXNIK TIZIMLAR VA ULARDA ISHLASH"));
        lessonsList.add(new Lessons("11-Ma'ruza","MA’LUMOTLAR BAZALARI (MS ACCESSMA’LUMOTLAR BAZASINI BOSHQARISH TIZIMI)"));
        lessonsList.add(new Lessons("11-Amaliy mashg'ulot","BULUTLI TEXNOLOGIYALAR. GOOGLE ASBOB USKUNALAR VA XIZMATLARIDAN FOYDALANISH"));
        lessonsList.add(new Lessons("11-Labaratoriya ishi","INTERNET TARMOG’I XIZMATLARI. BERILGAN TOPSHIRIQLARNI QIDIRUVCHI TIZIMLAR YORDAMIDA AMALGA OSHIRISH "));
        lessonsList.add(new Lessons("12-Ma'ruza",": KATTA HAJMDAGI MA’LUMOTLARBILAN ISHLASH"));
        lessonsList.add(new Lessons("12-Amaliy mashg'ulot","ELEKTRON HUKUMAT TIZIMI IMKONIYATLARI, DAVLAT INTERAKTIV XIZMATLARI."));
        lessonsList.add(new Lessons("12-Labaratoriya ishi","BULUTLI TEXNOLOGIYALAR. GOOGLE ASBOB USKUNALAR VA XIZMATLARIDAN FOYDALANISH"));
        lessonsList.add(new Lessons("13-Ma'ruza","KOMPYUTER TARMOQLARI,TARMOQ TEXNOLOGIYALARI"));
        lessonsList.add(new Lessons("13-Amaliy mashg'ulot","ELEKTRON HUKUMAT TIZIMI IMKONIYATLARI, DAVLAT INTERAKTIV XIZMATLARI"));
        lessonsList.add(new Lessons("13-Labaratoriya ishi","ELEKTRON HUKUMATNING ELEMENTLARI VA AMALDAGI LOYIXALARI BO’YICHA TOPSHIRIQLAR BAJARISH"));
        lessonsList.add(new Lessons("14-Ma'ruza","INTERNET TEXNOLOGIYALARI,INTERNET XIZMATLARI"));
        lessonsList.add(new Lessons("14-Amaliy mashg'ulot"," HISOBLASH JARAYONLARIGA ALGORITMLAR TUZISH"));
        lessonsList.add(new Lessons("14-Labaratoriya ishi","HISOBLASH JARAYONLARIGA ALGORITM TUZISH BO’YICHA LABORATORIYA TOPSHIRIQLARINI BAJARISH"));
        lessonsList.add(new Lessons("15-Ma'ruza","BUYUMLAR INTERNETI. (INTERNET OFTHINGS) TEXNOLOGIYALARI"));
        lessonsList.add(new Lessons("15-Amaliy mashg'ulot","AXBOROTGA XUJUMLARNI TAXLILLASH VA XIMOYA VOSITALARINI TASHKIL ETISH"));
        lessonsList.add(new Lessons("15-Labaratoriya ishi","AXBOROTLARNI XIMOYALASH VA XAVFSIZLIGINI TA’MINLASH BO’YICHA LABORATORIYA TOPSHIRIQLARNI BAJARISH. "));
        lessonsList.add(new Lessons("16-Ma'ruza","BULUTLI TEXNOLOGIYALAR"));
        lessonsList.add(new Lessons("17-Ma'ruza","GOOGLE-DOCS GA KIRISH. GOOGLE DOCSDA ISHLASHNI BOSHLASH: HUJJATNI YARATISH,OCHISH, SAQLASH"));
        lessonsList.add(new Lessons("18-Ma'ruza","BLOKCHEYN TEXNOLOGIYASI VAUNDAN FOYDALANISH YO’LLARI"));
        lessonsList.add(new Lessons("19-Ma'ruza","Elektron hukumat boshqaruv tizimi"));
        lessonsList.add(new Lessons("20-Ma'ruza","Elektron hujjat aylanish tizimi, Davlat interaktiv xizmatlari"));
        lessonsList.add(new Lessons("21-Ma'ruza","Elektron ta’limni boshqarish tizimlari"));
        lessonsList.add(new Lessons("22-Ma'ruza","Internetda sohaga oid axborot resurslari bilan ishlash"));
        lessonsList.add(new Lessons("23-Ma'ruza","TARMOQDA AXBOROT XAVFSIZLIGI VA AXBOROTLARNI HIMOYALASH USULLARI"));
        lessonsList.add(new Lessons("24-Ma'ruza","AXBOROTLARNI HIMOYALASHNING KRIPTOGRAFIK USULLARI"));
        lessonsList.add(new Lessons("25-Ma'ruza","AXBOROT TIZIMLARI VA ULARNING BOSHQARISHDAGI"));
        lessonsList.add(new Lessons("26-Ma'ruza","AXBOROT TIZIMLARINING TARKIBIY TUZILISHI VA SINFLANISHI"));
        lessonsList.add(new Lessons("27-Ma'ruza","BIZNES JARAYONLARNI BOSHQARISH TIZIMLARI"));
        lessonsList.add(new Lessons("28-Ma'ruza","BUYUMLAR INTERNETI. (INTERNET OF THINGS) TEXNOLOGIYALARI"));
        lessonsList.add(new Lessons("29-Ma'ruza","ALGORITMLASH VA DASTURLASH ASOSLARI"));
        lessonsList.add(new Lessons("30-Ma'ruza","C++ DASTURLASH TILI"));
    }
}