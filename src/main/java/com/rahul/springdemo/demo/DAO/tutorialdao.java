package com.rahul.springdemo.demo.DAO;

import com.rahul.springdemo.demo.model.tutorial;
import java.util.List;

public interface tutorialdao {

    public List<tutorial> findAll();
    public List<tutorial> directorinthegivenyearrange(String director,int year1,int year2);

    public List<tutorial> highestbudgettitlesofyear(int year);

    public List<tutorial> Sortwithuserreview();
}
