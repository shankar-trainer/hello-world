package com.cts.validation;

public interface ValidationGroups {
    // For Add: validates name, amount, etc.
    interface Add {}
    
    // For Update: validates everything (id, name, amount, etc.)
    interface Update {}
    
    // For Search/Delete: validates only the ID
    interface IdOnly {}
}