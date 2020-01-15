package ir.akhbar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class newsviewholder extends RecyclerView.ViewHolder{
    private TextView titell;
    public newsviewholder(View itemView) {
        super(itemView);
        titell= (TextView) itemView.findViewById(R.id.titell1);
    }
    public void bind(NewsData data){
        titell.setText(data.getTitle());
    }

}
