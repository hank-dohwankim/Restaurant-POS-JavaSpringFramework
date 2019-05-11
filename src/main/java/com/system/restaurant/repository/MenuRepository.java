package com.system.restaurant.repository;

import com.system.restaurant.domain.Menu;

import java.util.ArrayList;

public interface MenuRepository {
    ArrayList<Menu> menulist();

    Menu findOne(int id);

    Menu post(Menu menudata);

    Menu put(Menu menudata);

    int delete(int menu_id);
}
