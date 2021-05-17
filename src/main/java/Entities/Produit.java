package Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement(name = "produit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Produit {
    @XmlAttribute
    private boolean a_archiver;

    @XmlAttribute
    private String categProduit;

    @XmlAttribute
    private String famille;

    @XmlAttribute
    private Date date_creation;

    @XmlAttribute
    private Integer id;

    public boolean isA_archiver() {
        return a_archiver;
    }

    public void setA_archiver(boolean a_archiver) {
        this.a_archiver = a_archiver;
    }

    public String getCategProduit() {
        return categProduit;
    }

    public void setCategProduit(String categProduit) {
        this.categProduit = categProduit;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produit() {
    }

    public Produit(boolean a_archiver, String categProduit, String famille, Date date_creation, Integer id) {
        this.a_archiver = a_archiver;
        this.categProduit = categProduit;
        this.famille = famille;
        this.date_creation = date_creation;
        this.id = id;
    }

    // It is called immediately after the object is created and before the unmarshalling begins.
    // The callback provides an opportunity to initialize JavaBean properties prior to unmarshalling.
    void beforeUnmarshal(Unmarshaller unmarshaller, Object parent) {
        System.out.println("Before Unmarshaller Callback");
    }

    // It is called after all the properties are unmarshalled for this object,
    // but before this object is set to the parent object.
    void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        System.out.println("After Unmarshaller Callback");
    }
}
