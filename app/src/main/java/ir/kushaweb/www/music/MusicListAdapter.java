package ir.kushaweb.www.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 3/13/2018.
 */

public class MusicListAdapter extends BaseAdapter {
    Context mContext;
    List<MusicModel> instrument;

    public MusicListAdapter(Context mContext,List<MusicModel> instrument) {
        this.mContext=mContext;
        this.instrument=instrument;
    }

    @Override
    public int getCount() {
        return instrument.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row= LayoutInflater.from(mContext).inflate(R.layout.activity_music_item,parent,false);
        TextView txtsub=row.findViewById(R.id.txtsub);
        TextView txtprice=row.findViewById(R.id.txtprice);
        ImageView imgitem=row.findViewById(R.id.imgitem);
        TextView txtdetail=row.findViewById(R.id.txtdetail);

        txtsub.setText(instrument.get(position).getName());
        txtdetail.setText(instrument.get(position).getDetail());
        txtprice.setText(instrument.get(position).getPrice()+"");

         Picasso.get().load(instrument.get(position).getImageURL()).into(imgitem);
        return row;
    }
}
