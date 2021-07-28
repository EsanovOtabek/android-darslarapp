package uz.lifepc.iqtisodiyotaktdarslari;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class mAdapter extends RecyclerView.Adapter<mAdapter.MyViewHolder> {

    private List<Lessons> lessonsList;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;

    public mAdapter(Context mContext,List<Lessons> lessonsList){
        this.mInflater=LayoutInflater.from(mContext);
        this.lessonsList = lessonsList;
        this.context=mContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.title_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(lessonsList.get(position).title);
        holder.mavzu.setText(lessonsList.get(position).mavzu);
    }

    @Override
    public int getItemCount() {
        return lessonsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView mavzu;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title_txt);
            mavzu=itemView.findViewById(R.id.mavzu);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(itemView.getContext(), ""+lessonsList.get(getLayoutPosition()).title,Toast.LENGTH_SHORT).show();
            Bundle bundle=new Bundle();
            bundle.putString("id",getLayoutPosition()+"");
            bundle.putString("title",lessonsList.get(getLayoutPosition()).title);
            bundle.putString("mavzu",lessonsList.get(getLayoutPosition()).mavzu);
            Intent intent=new Intent(context,DarsView.class);
            intent.putExtras(bundle);
            context.startActivity(intent);

        }
    }

    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
