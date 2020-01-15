package ir.akhbar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ParsService on 1/14/2020.
 */

public class adaptornews extends RecyclerView.Adapter<newsviewholder> {
    private NewsData[] news;
    public adaptornews(NewsData[] news){
        this.news=news;
    }


    @Override
    public newsviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_list,parent,false);
        newsviewholder viewholder=new newsviewholder(itemview);
        return viewholder;

    }

    @Override
    public void onBindViewHolder(newsviewholder holder, int position) {
        NewsData Akhbar=news[position];
        holder.bind(Akhbar);
    }

    @Override
    public int getItemCount() {
        return news.length;
    }
}
