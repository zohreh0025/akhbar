package ir.akhbar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class newsviewholder extends RecyclerView.ViewHolder{
    private TextView titell;
    private TextView dec;

    public newsviewholder(View itemView) {
        super(itemView);
        titell= (TextView) itemView.findViewById(R.id.titell1);
        dec= (TextView) itemView.findViewById(R.id.description);
    }
    public void bind(NewsData data){

        titell.setText(data.getTitle());
        dec.setText(data.getDescription());
    }

}
