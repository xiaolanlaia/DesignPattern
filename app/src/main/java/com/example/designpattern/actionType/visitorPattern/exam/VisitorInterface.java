package com.example.designpattern.actionType.visitorPattern.exam;

import java.io.File;

public interface VisitorInterface {
    void visitDir(File file);
    void visitFile(File file);
}
