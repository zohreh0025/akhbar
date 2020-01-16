package ir.akhbar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class newsviewholder extends RecyclerView.ViewHolder{
    private TextView titell;
    private TextView dec;
    private ImageView newsimg;
    private ItemClick itemclick;
    public newsviewholder(View itemView,ItemClick itemclick) {
        super(itemView);
        titell= (TextView) itemView.findViewById(R.id.titell1);
        dec= (TextView) itemView.findViewById(R.id.description);
        newsimg= (ImageView) itemView.findViewById(R.id.newsimg);
       this.itemclick=itemclick;
    }
    public void bind(final NewsData data){

        titell.setText(data.getTitle());
        dec.setText(data.getDescription());

        Glide.with(newsimg.getContext())
                .load(data.getImg())
                .fitCenter()
                .into(newsimg);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemclick.OnClick(data);
            }
        });
    }

}
