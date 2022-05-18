package com.rahul.springdemo.demo.DAO;

import com.rahul.springdemo.demo.model.tutorial;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class tutorialdaoimpl implements tutorialdao{

    private EntityManager entityManager;
    public tutorialdaoimpl(EntityManager theentitymanager)
    {
        entityManager=theentitymanager;
    }
    @Override
    @Transactional
    public List<tutorial> findAll() {
        Session curentsession=entityManager.unwrap(Session.class);
        Query<tutorial> thequery=curentsession.createQuery("From Movies",tutorial.class);
        List<tutorial> tutorial=thequery.getResultList();
        return tutorial;
    }

    @Override
    @Transactional
    public List<tutorial> directorinthegivenyearrange(String director, int year1, int year2) {
        Session curentsession=entityManager.unwrap(Session.class);
        Query<tutorial> thequery=curentsession.createQuery("select title from Movies where year BETWEEN year=:year1 AND year=:year2 AND director=:director");
        thequery.setParameter("year1",year1 );
        thequery.setParameter("year2",year2 );
        thequery.setParameter("director",director );
        List<tutorial> tutorial=thequery.getResultList();
        return tutorial;

    }

    @Override
    public List<tutorial> highestbudgettitlesofyear(int year) {
        Session curentsession=entityManager.unwrap(Session.class);
        Query<tutorial> thequery=curentsession.createQuery("select titile,MAX(budget) from Movies where year=:year");
        thequery.setParameter("year",year );
        List<tutorial> tutorial=thequery.getResultList();
        return tutorial;
    }

    @Override
    public List<tutorial> Sortwithuserreview() {
        Session curentsession=entityManager.unwrap(Session.class);
        Query<tutorial> thequery=curentsession.createQuery("select * from Movies ORDER BY reviews_from_users ASC");
        List<tutorial> tutorial=thequery.getResultList();
        return tutorial;
    }
}
