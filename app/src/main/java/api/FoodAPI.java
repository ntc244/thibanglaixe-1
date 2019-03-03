package api;

import java.util.List;

import model.Food;
import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

public interface FoodAPI {

    @GET("/food")
    Call<Food> getFood();
    @GET("/foods")
    Call<List<Food>> getList();

}
