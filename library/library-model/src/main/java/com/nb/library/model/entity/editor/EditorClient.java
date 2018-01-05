
package com.nb.library.model.entity.editor;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EditorClient", targetNamespace = "editor.entity.model.library.nb.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EditorClient {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.nb.library.model.entity.editor.Editor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEditor", targetNamespace = "editor.entity.model.library.nb.com", className = "com.nb.library.model.entity.editor.GetEditor")
    @ResponseWrapper(localName = "getEditorResponse", targetNamespace = "editor.entity.model.library.nb.com", className = "com.nb.library.model.entity.editor.GetEditorResponse")
    @Action(input = "editor.entity.model.library.nb.com/EditorClient/getEditorRequest", output = "editor.entity.model.library.nb.com/EditorClient/getEditorResponse")
    public Editor getEditor(
        @WebParam(name = "arg0", targetNamespace = "")
        Editor arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.nb.library.model.entity.editor.Editor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listEditors", targetNamespace = "editor.entity.model.library.nb.com", className = "com.nb.library.model.entity.editor.ListEditors")
    @ResponseWrapper(localName = "listEditorsResponse", targetNamespace = "editor.entity.model.library.nb.com", className = "com.nb.library.model.entity.editor.ListEditorsResponse")
    @Action(input = "editor.entity.model.library.nb.com/EditorClient/listEditorsRequest", output = "editor.entity.model.library.nb.com/EditorClient/listEditorsResponse")
    public List<Editor> listEditors();

}