package org.stevegood.rift;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * User: stgood
 * Date: 1/9/14
 * Time: 11:23 AM
 */
public class RiftItemSlurper {

    public static ArrayList<RiftItem> parse(File file) throws IOException, SAXException, ParserConfigurationException {
        return parse(file, true);
    }

    public static ArrayList<RiftItem> parse(File file, boolean excludeConsumables) throws IOException, SAXException, ParserConfigurationException {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        RiftItemHandler handler = new RiftItemHandler();
        handler.setExcludeConsumables(excludeConsumables);
        parser.parse(file, handler);
        return handler.getItems();
    }

}
