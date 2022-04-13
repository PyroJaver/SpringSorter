package logging;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class DBLogObj {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "sort_id_seq")
    public int id;
    @Column
    private String typeOfSortString ;
    @Column
    private String typeOfInputString ;
    @Column
    private String typeOfOutputString ;
    @Column
    int arrayLength ;

    public DBLogObj(String typeOfSortString, String typeOfInputString, String typeOfOutputString, int arrayLength) {
        this.typeOfSortString = typeOfSortString;
        this.typeOfInputString = typeOfInputString;
        this.typeOfOutputString = typeOfOutputString;
        this.arrayLength = arrayLength;
    }
}
