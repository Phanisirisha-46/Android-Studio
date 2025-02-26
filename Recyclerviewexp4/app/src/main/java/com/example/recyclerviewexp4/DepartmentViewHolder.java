package com.example.recyclerviewexp4;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DepartmentViewHolder extends RecyclerView.ViewHolder {
    public ImageView dpic;
    public TextView dname;
    public TextView dseats;
    public DepartmentViewHolder(@NonNull View itemView) {
        super(itemView);
        dpic=(ImageView) itemView.findViewById(R.id.imageView);
        dname=(TextView) itemView.findViewById(R.id.txt_dname);
        dseats=(TextView) itemView.findViewById(R.id.txt_dseats);
    }
}
