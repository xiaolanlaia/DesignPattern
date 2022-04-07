package com.example.designpattern.ActionType.visitorPattern.exam;

import java.io.File;

public interface VisitorInterface {
    void visitDir(File file);
    void visitFile(File file);
}
