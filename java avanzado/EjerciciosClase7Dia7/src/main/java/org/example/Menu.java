package org.example;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private Integer id;
    private String descripcion;
    private List<Menu> menuList;

    public Menu(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.menuList = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", menuList=" + menuList +
                '}';
    }
}
