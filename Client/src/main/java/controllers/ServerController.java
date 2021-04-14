package controllers;//import spiffyUrlManipulator

import models.Id;

public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085";

    private static ServerController svr = new ServerController();

    private ServerController() {}

    public static ServerController shared() {
        return svr;
    }

    public String idGet() {
        // url -> /ids/
        // send the server a get with url
        // return json from server
        return null;
    }
    public String idPost(Id id) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return null;
    }
    public String idPut(Id id) {
        // url -> /ids/
        return null;
    }


}

// ServerController.shared.doGet()