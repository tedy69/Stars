package tech.riseofdevelopers.stars;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBintangAdapter extends RecyclerView.Adapter<ListBintangAdapter.ListViewHolder> {
    private ArrayList<Stars> listBintang;

    public ListBintangAdapter(ArrayList<Stars> listBintang)
    {
        this.listBintang = listBintang;
    }

    private OnItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Stars bintang = listBintang.get(position);

        holder.namaLayout.setText(bintang.getName());
        holder.detailLayout.setText(bintang.getDetail());

        Glide.with(holder.itemView.getContext())
                .load(bintang.getFoto())
                .apply(new RequestOptions().transform(new CenterCrop(),new RoundedCorners(30))).
                into(holder.fotoLayout);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallBack.onItemClicked(listBintang.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listBintang.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView fotoLayout;
        TextView namaLayout, detailLayout;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            fotoLayout = itemView.findViewById(R.id.fotoLayout);
            namaLayout = itemView.findViewById(R.id.tvJudulContent);
            detailLayout = itemView.findViewById(R.id.tvDescContent);
        }
    }


    // Parameter Interface onClickItem
    public interface OnItemClickCallBack{
        void onItemClicked(Stars data);
    }
}
