package logging;

import inputOutput.Input.Input;
import inputOutput.output.Output;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sorts.Sorter;

import java.io.IOException;

public class DBLogger extends AbstractLogger implements Logger {

    public DBLogger() {
    }

    public DBLogger(Sorter typeOfSort, Input typeOfInput, Output typeOfOutput, int lengthOfArray) {
        super(typeOfSort, typeOfInput, typeOfOutput, lengthOfArray);
    }

    @Override
    public void addToLog() throws IOException {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(DBLogObj.class).buildSessionFactory();
        String typeOfSortString = getTypeOfSort().getClass().getSimpleName();
        String typeOfInputString = getTypeOfInput().getClass().getSimpleName();
        String typeOfOutputString = getTypeOfOutput().getClass().getSimpleName();
        DBLogObj dbLogObj = new DBLogObj(typeOfSortString, typeOfInputString, typeOfOutputString, getLengthOfArray());
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(dbLogObj);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }

}


