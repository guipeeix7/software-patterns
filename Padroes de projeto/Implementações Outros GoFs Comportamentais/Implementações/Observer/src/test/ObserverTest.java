package test;

import observer.Subscriber;
import especificObserver.EmailSubscriber;
import especificObserver.SmsSubscriber;
import especificSubject.MyTopic;

public class ObserverTest {

	public static void main(String[] args) {
		 //create subject
        MyTopic topic = new MyTopic();
         
        //create observers
        Subscriber obj1 = new SmsSubscriber("Obj1");
        Subscriber obj2 = new SmsSubscriber("Obj2");
        Subscriber obj3 = new EmailSubscriber("Obj3");
         
        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
         
        //attach observer to subject
        obj1.setTopic(topic);
        obj2.setTopic(topic);
        obj3.setTopic(topic);
         
        //check if any update is available
        obj1.update();
         
        //now send message to subject
        topic.postMessage("New message to be subscribed...");

	}

}
