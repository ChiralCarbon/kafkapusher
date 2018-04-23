package com.yld.kafka;
import org.apache.kafka.clients.producer.*;
import java.util.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String topicName = "test";
       // String groupName = "SupplierTopicGroup";


        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        //props.put("group.id", groupName);


        Producer<String, String> producer = new KafkaProducer(props);

        System.out.println(producer.send(new ProducerRecord(topicName,"SUP1","testing")).get());
        System.out.println(producer.send(new ProducerRecord(topicName,"SUP2","testing2")).get());
        System.out.println("Done nibba");

    }
}
