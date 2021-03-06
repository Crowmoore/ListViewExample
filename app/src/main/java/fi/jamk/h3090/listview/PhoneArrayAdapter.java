package fi.jamk.h3090.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Crowmoore on 18-Sep-16.
 */
public class PhoneArrayAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> phones;

    public PhoneArrayAdapter(Context context, ArrayList<String> phones) {
        super(context, R.layout.rowlayout, R.id.textView, phones);
        this.context = context;
        this.phones = phones;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        textView.setText(phones.get(position));

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        switch (phones.get(position)) {
            case "Android": imageView.setImageResource(R.drawable.android);
                break;
            case "iPhone": imageView.setImageResource(R.drawable.ios);
                break;
            case "Blackberry": imageView.setImageResource(R.drawable.blackberry);
                break;
            case "Ubuntu": imageView.setImageResource(R.drawable.ubuntu);
                break;
            case "WebOS": imageView.setImageResource(R.drawable.webos);
                break;
            case "WindowsMobile": imageView.setImageResource(R.drawable.windows);
                break;
        }
        return rowView;
    }
}
