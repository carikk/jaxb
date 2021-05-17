package com.lcl.catpat;

import Entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utils.ParsingXmlFile;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@SpringBootApplication
public class CatpatApplication {



    public static void main(String[] args) {
        SpringApplication.run(CatpatApplication.class, args);

        ParsingXmlFile p = new ParsingXmlFile();

        try {
            /*
            Extract data from xml file in resources directory
             */
            Produit produit = p.unmarshalling();

            /*
            Passing the   model of xml by unmarshalling xml file. Alternatively, can construct company object
            with all data. It will create xml same as xml in resources directory.
             */
//            p.marshalling(produit);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
