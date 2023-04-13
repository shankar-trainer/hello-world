package org.example.main;

import org.example.model.Survey;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();


        Query query = session.createQuery("from Survey");

        List<Survey> list = query.list();

        for (Survey s:list          ) {
            System.out.println(s.getSurveyId()+"\t"+s.getSurveyName()+"\t"+s.getSurveyLocation()+"\t"+s.getSurveyDate()+"\t"+s.getSurveyTime());
        }

        query = session.createQuery("from Survey s where s.surveyId=100001");
        Survey s1= (Survey) query.uniqueResult();

        System.out.println("=====================");
        System.out.println(s1.getSurveyId()+"\t"+s1.getSurveyName()+"\t"+s1.getSurveyLocation()+"\t"+s1.getSurveyDate()+"\t"+s1.getSurveyTime());

        query = session.createQuery("from Survey s where s.surveyId=?0");  //position based parameter

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter survey id ");
        query.setInteger(0,sc.nextInt());


        s1= (Survey) query.uniqueResult();

        System.out.println("=====================");
        if(s1==null)
            System.out.println("record not present");
        else
        System.out.println(s1.getSurveyId()+"\t"+s1.getSurveyName()+"\t"+s1.getSurveyLocation()+"\t"+s1.getSurveyDate()+"\t"+s1.getSurveyTime());

        //======================aggregate function ================


        Query query1 = session.createQuery("select count(*) from  Survey ");

        long count= (Long) query1.uniqueResult();
        System.out.println("total count is "+count);

         query1 = session.createQuery("select max(surveyId) from  Survey ");

         int max= (Integer) query1.uniqueResult();
        System.out.println("first / max surveyId is  "+max);

         query1 = session.createQuery("select min(surveyId) from  Survey ");

         int min= (Integer) query1.uniqueResult();
        System.out.println("last / min surveyId is  "+min);



    }
}
