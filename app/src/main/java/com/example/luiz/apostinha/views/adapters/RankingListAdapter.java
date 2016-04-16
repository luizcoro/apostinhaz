package com.example.luiz.apostinha.views.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.luiz.apostinha.R;
import com.example.luiz.apostinha.models.RankingItem;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by luiz on 4/15/16.
 */
public class RankingListAdapter extends ArrayAdapter<RankingItem> {

    private static class ViewHolder
    {
        TextView position;
        TextView name;
    }


    public RankingListAdapter(Context context, ArrayList<RankingItem> rankingItems)
    {
        super(context, R.layout.ranking_list, rankingItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView != null)
        {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.ranking_list_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.position = (TextView) convertView.findViewById(R.id.ranking_list_item_position);
            viewHolder.name = (TextView) convertView.findViewById(R.id.ranking_list_item_name);
            convertView.setTag(viewHolder);

        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        RankingItem item = getItem(position);

        viewHolder.position.setText(item.getPosition());
        viewHolder.name.setText(item.getName());

        return convertView;
    }
}
