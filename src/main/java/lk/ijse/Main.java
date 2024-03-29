package lk.ijse;

import jakarta.transaction.Transactional;
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


        /* Write an HQL query to retrieve all books published after the year 2010.*/
        Query query1 = session.createQuery("select title from Book where publicationYear > :year");
        query1.setParameter("year",2010);
        List<String> titles = query1.list();
        for(String title : titles){
            System.out.println(title);
        }

       /* Write an HQL update query to increase the price of all books published by a specific
        author by 10%.*/
        Query query2 = session.createQuery("update Book set price = price + (price * 10.0 / 100.0)  where author.id = :author_id");
        query2.setParameter("author_id",1);
        int count = query2.executeUpdate();
        System.out.println(count);

        /*Write an HQL query to find the average price of all books.*/
        Query query3 = session.createQuery("select avg (price) from Book ");
        Object result = query3.uniqueResult();
        System.out.println(result);

        /*Write an HQL query to retrieve all authors along with the count of books they have written.*/
        Query query4 = session.createQuery("select a.name, count (b.title) from Author a left join a.books b group by a.id,a.name");
        List<Object[]> bookCount = query4.list();

        for(Object[] results : bookCount){
            System.out.println("Author: " + results[0] + ", Count: " + results[1]);
        }

        /*Write an HQL query using named parameters to retrieve books written by authors from a
        specific country.*/
        Query query5 = session.createQuery("select b from Book b join b.author a where a.country = :countryName");
        query5.setParameter("countryName","Sri Lanka");
        List<Book> bookList = query5.list();
        System.out.println(bookList);

        /*Write an HQL query to find authors who have written more than the average number of
        books.*/
        Query query6 = session.createQuery("select a.name from Author a where (select count(b.title) from Book b where b.author = a) > " +
                "(select avg(count(b.title)) from Book b group by b.author)");
        List<String> authors = query6.list();
        for(String authorName : authors){
            System.out.println(authorName);
        }

        transaction.commit();
        session.close();
    }
}