package xml_parsing;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import xml_parsing.Employee;
import xml_parsing.ReadSaxParser;

public class XMLParserSAX {

    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            ReadSaxParser handler = new ReadSaxParser();
            saxParser.parse(new File("saxXml.xml"), handler);
            //Get Employees list
            List<Employee> empList = handler.getEmpList();
            //print employee information
            for(Employee emp : empList)
                System.out.println(emp);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

}
