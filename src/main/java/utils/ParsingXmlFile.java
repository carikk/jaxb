package utils;

import Entities.Produit;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

@Service
public class ParsingXmlFile {

    public static void marshalling(Produit produit) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Produit.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(produit, System.out);
    }

    public static Produit unmarshalling() throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Produit.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        File file = new File("/Users/yassinebouzoubaa/Desktop/Work/LCL/projects/catpat/src/main/resources/produit.xml");
        Produit produit = (Produit) unmarshaller.unmarshal(file);

        if(produit != null) {
            System.out.println("Unmarshalling successful!");
        }

        return produit;
    }
}
