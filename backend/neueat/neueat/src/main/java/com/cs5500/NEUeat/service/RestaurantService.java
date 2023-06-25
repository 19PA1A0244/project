package com.cs5500.NEUeat.service;

// import com.cs5500.NEUeat.model.Comment;
import com.cs5500.NEUeat.model.Dish;
// import com.cs5500.NEUeat.model.Restaurant;
import com.cs5500.NEUeat.model.RestaurantInfo;
import java.util.List;

public interface RestaurantService {

  int addDish(String id, Dish dish);

  int removeDish(String id, Dish dish);

  List<Dish> getAllDishes(String id);

  RestaurantInfo getInformation(String id);

  int updateInfo(String id, RestaurantInfo info);
}
