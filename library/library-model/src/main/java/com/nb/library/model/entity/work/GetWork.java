
package com.nb.library.model.entity.work;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getWork complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getWork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{work.entity.model.library.nb.com}work" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWork", propOrder = {
    "arg0"
})
public class GetWork {

    protected Work arg0;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 arg0.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getArg0() {
        return arg0;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setArg0(Work value) {
        this.arg0 = value;
    }

}
