package com.nb.library.business.contract;

import com.nb.library.client.work.Work;

import java.util.List;

public interface WorkManager {
    Work getWork(Work work);

    List<Work> listWorks();

    List<Work> listWorksByWord(String word);
}
