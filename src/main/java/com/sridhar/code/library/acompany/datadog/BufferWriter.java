package com.sridhar.code.library.acompany.datadog;

/*
Given an interface that lets you write to

 */

interface Fileout {

    public void write(char[] buf, int len);
}

class FileoutImplementation implements Fileout {


    public void write(char[] buf, int len) {

    }
}


class Buffer {

    Fileout fileout;
    char[] buffer;
    int movingIndex;

    Buffer(Fileout fileout, int buffersize) {
        this.fileout = fileout;
        this.buffer = new char[buffersize];
        this.movingIndex = 0;
    }

    void write(char[] data) {

    }

    void flush() {

    }

}

public class BufferWriter {



}
