
package com.nb.library.client.work;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.client.work package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListWorksByWord_QNAME = new QName("work.client.library.nb.com", "listWorksByWord");
    private final static QName _ListWorksByWordResponse_QNAME = new QName("work.client.library.nb.com", "listWorksByWordResponse");
    private final static QName _GetWorkResponse_QNAME = new QName("work.client.library.nb.com", "getWorkResponse");
    private final static QName _ListWorks_QNAME = new QName("work.client.library.nb.com", "listWorks");
    private final static QName _GetWork_QNAME = new QName("work.client.library.nb.com", "getWork");
    private final static QName _ListWorksResponse_QNAME = new QName("work.client.library.nb.com", "listWorksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.work
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWork }
     * 
     */
    public GetWork createGetWork() {
        return new GetWork();
    }

    /**
     * Create an instance of {@link ListWorksResponse }
     * 
     */
    public ListWorksResponse createListWorksResponse() {
        return new ListWorksResponse();
    }

    /**
     * Create an instance of {@link ListWorks }
     * 
     */
    public ListWorks createListWorks() {
        return new ListWorks();
    }

    /**
     * Create an instance of {@link GetWorkResponse }
     * 
     */
    public GetWorkResponse createGetWorkResponse() {
        return new GetWorkResponse();
    }

    /**
     * Create an instance of {@link ListWorksByWordResponse }
     * 
     */
    public ListWorksByWordResponse createListWorksByWordResponse() {
        return new ListWorksByWordResponse();
    }

    /**
     * Create an instance of {@link ListWorksByWord }
     * 
     */
    public ListWorksByWord createListWorksByWord() {
        return new ListWorksByWord();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link TypeWork }
     * 
     */
    public TypeWork createTypeWork() {
        return new TypeWork();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListWorksByWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "work.client.library.nb.com", name = "listWorksByWord")
    public JAXBElement<ListWorksByWord> createListWorksByWord(ListWorksByWord value) {
        return new JAXBElement<ListWorksByWord>(_ListWorksByWord_QNAME, ListWorksByWord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListWorksByWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "work.client.library.nb.com", name = "listWorksByWordResponse")
    public JAXBElement<ListWorksByWordResponse> createListWorksByWordResponse(ListWorksByWordResponse value) {
        return new JAXBElement<ListWorksByWordResponse>(_ListWorksByWordResponse_QNAME, ListWorksByWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "work.client.library.nb.com", name = "getWorkResponse")
    public JAXBElement<GetWorkResponse> createGetWorkResponse(GetWorkResponse value) {
        return new JAXBElement<GetWorkResponse>(_GetWorkResponse_QNAME, GetWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListWorks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "work.client.library.nb.com", name = "listWorks")
    public JAXBElement<ListWorks> createListWorks(ListWorks value) {
        return new JAXBElement<ListWorks>(_ListWorks_QNAME, ListWorks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "work.client.library.nb.com", name = "getWork")
    public JAXBElement<GetWork> createGetWork(GetWork value) {
        return new JAXBElement<GetWork>(_GetWork_QNAME, GetWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListWorksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "work.client.library.nb.com", name = "listWorksResponse")
    public JAXBElement<ListWorksResponse> createListWorksResponse(ListWorksResponse value) {
        return new JAXBElement<ListWorksResponse>(_ListWorksResponse_QNAME, ListWorksResponse.class, null, value);
    }

}
