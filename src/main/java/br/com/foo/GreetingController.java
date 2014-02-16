package br.com.foo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping("/updateFoo")
    public @ResponseBody
    String updateFoo() {
        String timestamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
        template.convertAndSend("/topic/foo", new Greeting("Updated Foo at " + timestamp));
        return "Foo has been updated!!!";
    }

    @RequestMapping("/updateBar")
    public @ResponseBody
    String updateBar() {
        String timestamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
        template.convertAndSend("/topic/bar", new Greeting("Updated Bar at " + timestamp));
        return "Bar has been updated!!!";
    }

}
