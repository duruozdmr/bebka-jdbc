package org.example;

import model.Courses;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;

        try {
            tx= session.beginTransaction();
            Courses courses=new Courses("DURU","YAZILIM","JAVA","ANTALYA");
            session.persist(courses);
            tx.commit();
            System.out.println("veri eklendi");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}