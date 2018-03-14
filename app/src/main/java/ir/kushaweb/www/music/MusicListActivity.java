package ir.kushaweb.www.music;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MusicListActivity extends AppCompatActivity {
 ListView listviewmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        listviewmusic=(ListView)findViewById(R.id.listviewmusic);
        List<MusicModel> instrument = new ArrayList<MusicModel>();

        MusicModel guitar=new MusicModel();
        guitar.setName("Guitar");
        guitar.setDetail("گیتار نوعی ساز زهی است که با پیک یا انگشت نواخته میشود و از این جهت که سیمهای آن در اثر ارتعاش تولید صدا میکنند");
        guitar.setPrice(570000);
        guitar.setImageURL("http://www.dodoak.com/3014-large_default/yamaha-c40-classic-guitar.jpg");


MusicModel piano=new MusicModel();
        piano.setName("piano");
        piano.setDetail("پیانو یکی از سازهای صفحه کلیددار و مشهورترین آنها است. صدای پیانو در اثر برخورد چکشهایی با سیمهای فلزی آن در داخل جعبه چوبی تولید میشود.");
        piano.setPrice(160000);
        piano.setImageURL("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Boesendorfer_002.jpg/800px-Boesendorfer_002.jpg");


MusicModel trumpet=new MusicModel();
        trumpet.setName("trumpet");
        trumpet.setDetail("ترومپت (به فرانسوی: trompette) از سازهای بادی برنجی است و که در محدوده سوپرانو زیرترین صدا را در بین سازهای بادی برنجی میتواند تولید کند. ");
        trumpet.setPrice(570000);
        trumpet.setImageURL("http://del-ava.com/Dashboard/ArtPic/268images.jpg");


MusicModel Drum=new MusicModel();
        Drum.setName("Drum");
        Drum.setDetail("درامز یا درام (به انگلیسی: Drum) که در زبان فارسی به معنی طبل است، در زبان انگلیسی معادل «Drum Kit» به معنی مجموعهای از طبلها، سنجها و گاهی دیگر سازهای کوبهای است که در کنار هم یک ساز واحد و مستقل را تشکیل میدهند. ");
        Drum.setPrice(570000);
        Drum.setImageURL("https://upload.wikimedia.org/wikipedia/commons/b/ba/Vue_batteur_grand.jpg");


MusicModel violin=new MusicModel();
        violin.setName("violin");
        violin.setDetail("خانواده ویولن شامل سه ساز ویولن، ویولا و ویولنسل است. این سازها به ترتیب در منطقه زیر و میانی و بم صدا میدهند. ساز کنترباس از این خانواده نیست و در خانواده ویول قرار دارد. این مسئله را میتوان از شانههای شیبدار آن متوجه شد.  ");
        violin.setPrice(570000);
        violin.setImageURL("https://s.cafebazaar.ir/1/icons/com.music773vmp_512x512.png");


               instrument.add(guitar);
               instrument.add(piano);
               instrument.add(trumpet);
               instrument.add(violin);
               instrument.add(Drum);




               MusicListAdapter adapter=new MusicListAdapter(this,instrument);
               listviewmusic.setAdapter(adapter);
    }
}
