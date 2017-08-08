import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PersonLog extends ArrayList<Person>{
    public interface  NotificationFunction extends Function<String, Function<String, Function<Integer, Function<String, Boolean>>>>{

    }
    private List<NotificationFunction> subscribers = new ArrayList();

    public void subscribe(NotificationFunction subscriber){
        this.subscribers.add(subscriber);
    }

    @Override
    public boolean add(Person t){
        subscribers.stream().
                forEach(s -> s.apply(t.getFirstName()).apply(t.getLastName()).apply(t.getAge()).apply(t.getSsn()));
//                    if (!transactionConsumer.apply(t)) {
//                        System.err.println("Subscriber failure");
//                    }
        // }
        ;
        return super.add(t);

    }
}
