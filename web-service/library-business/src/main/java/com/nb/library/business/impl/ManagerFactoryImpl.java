package com.nb.library.business.impl;

import com.nb.library.business.contract.ManagerFactory;
import com.nb.library.business.contract.manager.*;

public class ManagerFactoryImpl implements ManagerFactory {

    private AuthorManager authorManager;
    public AuthorManager getAuthorManager() {
        return authorManager;
    }
    public void setAuthorManager(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    private BookManager bookManager;
    public BookManager getBookManager() {
        return bookManager;
    }
    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    private BorrowingManager borrowingManager;
    public BorrowingManager getBorrowingManager() {
        return borrowingManager;
    }
    public void setBorrowingManager(BorrowingManager borrowingManager) {
        this.borrowingManager = borrowingManager;
    }

    private EditorManager editorManager;
    public EditorManager getEditorManager() {
        return editorManager;
    }
    public void setEditorManager(EditorManager editorManager) {
        this.editorManager = editorManager;
    }

    private TypeWorkManager typeWorkManager;
    public TypeWorkManager getTypeWorkManager() {
        return typeWorkManager;
    }
    public void setTypeWorkManager(TypeWorkManager typeWorkManager) {
        this.typeWorkManager = typeWorkManager;
    }

    private UserManager userManager;
    public UserManager getUserManager() {
        return userManager;
    }
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    private WorkManager workManager;
    public WorkManager getWorkManager() {
        return workManager;
    }
    public void setWorkManager(WorkManager workManager) {
        this.workManager = workManager;
    }
}
