package subject;

import observer.Subscriber;

public interface Topic {
	
	//methods to register and unregister observers
    public void register(Subscriber obj);
    public void unregister(Subscriber obj);
     
    //method to notify observers of change
    public void notifySubscribers();
     
    //method to get updates from subject
    public Object getUpdate(Subscriber obj);

}
