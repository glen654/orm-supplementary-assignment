package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

       /* Query query = session.createQuery("select title from Book where publicationYear > '2010'");
        List<String> titles = query.list();
        for(String title : titles){
            System.out.println(title);
        }*/

        /*Query query = session.createQuery("update Book set price = price + (price * 10.0 / 100.0)  where author.id = :author_id");
        query.setParameter("author_id",1);
        int count = query.executeUpdate();
        System.out.println(count);*/

       /* Query query = session.createQuery("select avg (price) from Book ");
        Object result = query.uniqueResult();
        System.out.println(result);*/

       /* Query query = session.createQuery("select a.name, count(b.title) from Author a join Book b on a.id = b.author.id where a.id = :author_id");
        query.setParameter("author_id",2);
        List<Objects[]> results = query.list();
        for (Object[] result : results) {
            String authorName = (String) result[0];
            Long bookCount = (Long) result[1];
            System.out.println("Author: " + authorName + ", Book Count: " + bookCount);
        }*/

        /*Query query = session.createQuery("select a, count(b.title) from Author a left join a.books b where a.id = :author_id group by a.id");
        query.setParameter("author_id",2);
        List<Object[]> results = query.list();

        for(Object[] result : results){
            Author author = (Author) result[0];
            Long book = (Long) result[1];

            System.out.println("Author: " + author.getName() + ",Book: " + book);
        }*/
       /* Query query = session.createQuery("select a.name from Author a where (select count(b.title) from Book b where b.author = a) > " +
                "(select avg(count(b.title)) from Book b group by b.author)");
        List<String> authors = query.list();
        for(String authorName : authors){
            System.out.println(authorName);
        }*/

        transaction.commit();
        session.close();
    }
}