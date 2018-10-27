package work;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Order_date")
    private Date date;

    @Column(name = "Order_summ")
    private int summ;

    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    @OneToMany(fetch = FetchType.EAGER,  mappedBy = "order")
    private Set<Stuff>  data;

    public Set<Stuff> getData() {
        return data;
    }

    public void setData(Set<Stuff> data) {
        this.data = data;
    }
}
