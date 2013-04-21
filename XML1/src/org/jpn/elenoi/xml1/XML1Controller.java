package org.jpn.elenoi.xml1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class XML1Controller {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String filePath = "C:\\Users\\elenoi\\Desktop\\oaipmh.xml";
        String outFilePath = "C:\\Users\\elenoi\\Desktop\\oaipmh_copy.xml";

        File file = new File(filePath);
        SAXBuilder sax = new SAXBuilder();
        Document doc = null;
        try {
            doc = sax.build(file);
        } catch (JDOMException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }

        XMLOutputter xout = new XMLOutputter(Format.getCompactFormat());
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(outFilePath);
            xout.output(doc, fos);
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
            }
        }
    }
}
