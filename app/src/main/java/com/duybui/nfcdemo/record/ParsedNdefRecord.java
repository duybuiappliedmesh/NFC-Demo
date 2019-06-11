package com.duybui.nfcdemo.record;

public interface ParsedNdefRecord {
    /**
     * Read the data from NFC card
     *
     * @return the String data read from the NFC Card
     */
    String readData();
}
