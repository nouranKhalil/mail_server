package com.example.Backend.mailServerSystem.CommandDesignPattern;

public class userMail{
    public static mailServerButtons getButton(Long idU){
        return new mailServer(idU);
    }
     public static mailServerButtons getMail(Long idD, String foldeName, Long idU){
        return new mailServer(idD, foldeName, idU);
    }
    public static mailServerButtons userFolders(Long idU, String folderName){
        return new mailServer(idU,folderName);
    }
}
