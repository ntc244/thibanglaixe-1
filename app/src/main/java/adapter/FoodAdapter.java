package adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

import model.Food;

public class FoodAdapter extends ArrayAdapter<Food> {

    private Activity activity;
    private int resource;
    private List<Food> foods;

    public FoodAdapter(@NonNull Activity context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);
        this.activity = context;
        this.resource = resource;
        this.foods = objects;
    }



    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public Food getItem(int position) {
        return foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Gọi layoutInflater ra để bắt đầu ánh xạ view và data.
        LayoutInflater inflater = activity.getLayoutInflater();

        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong item_name.xml
        view = inflater.inflate(this.resource, null);

        // Đặt chữ cho từng view trong danh sách.
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        tvName.setText(foods.get(position).getName());

        // Trả về view kết quả.
        return view;
    }
}
