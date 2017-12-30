package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.Borrowing;

import java.util.List;

public interface BorrowingDao {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowing(Borrowing borrowing);

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded();
}