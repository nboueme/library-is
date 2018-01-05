package com.nb.library.service.resource;

import com.nb.library.model.entity.Work;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "WorkClient", serviceName = "WorkService", portName = "WorkPort", targetNamespace = "work.entity.model.library.nb.com")
public class WorkService extends AbstractService {

    @WebMethod
    public Work getWork(Work work) {
        return getManagerFactory().getWorkManager().getWork(work);
    }

    @WebMethod
    public List<Work> listWorks() {
        //List<Work> works = getManagerFactory().getWorkManager().listWorks();
        //return works.toArray(new Work[works.size()]);
        return getManagerFactory().getWorkManager().listWorks();
    }
}
