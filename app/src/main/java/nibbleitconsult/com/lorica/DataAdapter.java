package nibbleitconsult.com.lorica;

/**
 * Created by jeanhuit on 17/05/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<lorics> android;

    public DataAdapter(ArrayList<lorics> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.loric_name.setText(android.get(i).getName());
       // viewHolder.loric_content.setText(android.get(i).getContent());
       // viewHolder.loric_location.setText(android.get(i).getImage_location());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView loric_name,loric_content,loric_location;


        public ViewHolder(View view) {
            super(view);

            loric_name = (TextView)view.findViewById(R.id.loric_name);
            loric_content = (TextView)view.findViewById(R.id.loric_content);
            loric_location = (TextView)view.findViewById(R.id.loric_location);

        }
    }

}
