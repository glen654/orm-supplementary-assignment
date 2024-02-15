package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteAuthor {
    /*Implement a method to delete an author and cascade the deletion to all associated books
    using appropriate cascade options.*/
    public static void deleteAuthor(){
        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();
        Author author = session.get(Author.class,1);
        if(author != null){
            session.delete(author);
            transaction.commit();
            session.close();
        }
    }

    public static void main(String[] args) {
        deleteAuthor();
    }
}
