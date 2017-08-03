package ru.ifmo.neerc.volunteers.service.calendar;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


/**
 * Created by Lapenok Akesej on 04.08.2017.
 */
@Data
public class Event {

    private static final SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String location;
    String summery;
    String description;
    Date start;
    Date end;

    public Event(Map<String, String> data) throws ParseException {
        location = data.get("location");
        summery = data.get("summery");
        description = data.get("description");
        start = parser.parse(data.get("start"));
        end = parser.parse(data.get("end"));
    }
}
