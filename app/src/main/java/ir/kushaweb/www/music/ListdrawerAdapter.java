package ir.kushaweb.www.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Asus on 3/14/2018.
 */

public class ListdrawerAdapter extends BaseAdapter {
    Context mcontext;
    String names[];

    public ListdrawerAdapter(Context mcontext,String[] names) {
        this.mcontext=mcontext;
        this.names=names;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row= LayoutInflater.from(mcontext).inflate(R.layout.activity_listdrawer_item,parent,false);
        TextView txtdrawer=row.findViewById(R.id.txtdrawer);

        txtdrawer.setText(names[position]);
        return row;
    }
}
