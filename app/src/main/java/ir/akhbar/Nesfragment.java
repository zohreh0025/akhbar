package ir.akhbar;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

public class Nesfragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_news,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView  newsrecycler = (RecyclerView) view.findViewById(R.id.recycleview);
        newsrecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        NewsData [] news=new NewsData[]{
                new NewsData("salam","salamdec","123"),
                new NewsData("hello","hellodec","123")};
        adaptornews adapter=new adaptornews(news);
        newsrecycler.setAdapter(adapter);

    }
}
