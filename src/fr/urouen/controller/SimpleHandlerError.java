package fr.urouen.controller;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.util.ArrayList;
import java.util.List;

public class SimpleHandlerError implements ErrorHandler {

    private List<String> warningList;
    private List<String> errorList;
    private List<String> fatalErrorList;

    public SimpleHandlerError() {
        warningList = new ArrayList<>();
        errorList = new ArrayList<>();
        fatalErrorList = new ArrayList<>();
    }

    public void warning(SAXParseException e) throws SAXException {
        String msg = e.getMessage()+"(at line "+e.getLineNumber()+", column "+e.getColumnNumber()+")";
        warningList.add(msg);
        System.err.println(msg);
    }

    public void error(SAXParseException e) throws SAXException {
        String msg = e.getMessage()+"(at line "+e.getLineNumber()+", column "+e.getColumnNumber()+")";
        errorList.add(msg);
        System.err.println(msg);
    }

    public void fatalError(SAXParseException e) throws SAXException {
        String msg = e.getMessage()+"(at line "+e.getLineNumber()+", column "+e.getColumnNumber()+")";
        fatalErrorList.add(msg);
        System.err.println(msg);
    }

    public boolean hasError() {
        return errorList.size() != 0;
    }

    public boolean hasWarning() {
        return warningList.size() != 0;
    }

    public boolean hasFatalError() {
        return fatalErrorList.size() != 0;
    }

    public String getErrors() {
        String sRet = "";

        for (String s : errorList) {
            sRet += s + "\n";
        }

        return sRet;
    }

    public String getWarnings() {
        String sRet = "";

        for (String s : warningList) {
            sRet += s + "\n";
        }

        return sRet;
    }

    public String getFatalErrors() {
        String sRet = "";

        for (String s : fatalErrorList) {
            sRet += s + "\n";
        }

        return sRet;
    }
}