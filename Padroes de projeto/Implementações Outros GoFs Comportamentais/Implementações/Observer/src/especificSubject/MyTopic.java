package especificSubject;

import java.util.ArrayList;
import java.util.List;

import observer.Subscriber;
import subject.Topic;

public class MyTopic implements Topic {

	private List<Subscriber> subscribers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();
     
    public MyTopic(){
        this.subscribers = new ArrayList<>();
    }
    @Override
    public void register(Subscriber obj) {
        if(obj == null) throw new NullPointerException("Null Subscriber");
        synchronized (MUTEX) {
        	if(!subscribers.contains(obj)) subscribers.add(obj);
        }
    }
 
    @Override
    public void unregister(Subscriber obj) {
        synchronized (MUTEX) {
        	subscribers.remove(obj);
        }
    }
 
    @Override
    public void notifySubscribers() {
        List<Subscriber> localSubscribers = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            localSubscribers = new ArrayList<>(this.subscribers);
            this.changed=false;
        }
        for (Subscriber obj : localSubscribers) {
            obj.update();
        }
    }
 
    @Override
    public Object getUpdate(Subscriber obj) {
        return this.message;
    }
     
    //method to post message to the topic
    public void postMessage(String msg){
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifySubscribers();
    }

}
