package fr.urouen.controller;

public class MessageGenerator {
    public static String generateMessage(String id, OperationStatus status, String description) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<id>"+id+"</id>";
        sRet += "<status>"+status.name()+"</status>";
        sRet += "<description>"+description+"</description>";

        sRet += "</response>";
        return sRet;
    }

    public static String generateMessage(String id, OperationStatus status) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<id>"+id+"</id>";
        sRet += "<status>"+status.name()+"</status>";

        sRet += "</response>";
        return sRet;
    }

    public static String generateMessage(OperationStatus status, String description) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<status>"+status.name()+"</status>";
        sRet += "<description>"+description+"</description>";

        sRet += "</response>";
        return sRet;
    }

    public String generateMessage(OperationStatus status) {
        String sRet = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
        sRet += "<response>";

        sRet += "<status>"+status.name()+"</status>";

        sRet += "</response>";
        return sRet;
    }
}
