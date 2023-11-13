package especificObserver;

import observer.Subscriber;
import subject.Topic;

public class SmsSubscriber implements Subscriber {
	
	private String name;
    private Topic topic;
     
    public SmsSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name + ":: No new message");
        }else
        System.out.println(name+":: Consuming message by SMS:" + msg);
    }
 
    @Override
    public void setTopic(Topic sub) {
        this.topic=sub;
    }

}
