package xample.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Subject> flyweightSubjectMap = new HashMap<>();

    public Subject getInstance(String key) {
        Subject subject = flyweightSubjectMap.get(key);
        if (subject == null) {
            subject = new Subject(key);
            System.out.println("새로생성 : "+ subject.getName());
            flyweightSubjectMap.put(key, subject);
        } else {
            System.out.println("재사용 : "+ subject.getName());
        }
        return subject;
    }
}
