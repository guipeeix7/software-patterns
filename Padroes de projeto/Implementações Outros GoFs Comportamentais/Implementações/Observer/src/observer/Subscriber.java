package observer;

import subject.Topic;

public interface Subscriber {
	
	//method to update the observer, used by subject
    public void update();
     
    //attach with subject to observe
    public void setTopic(Topic sub);

}
