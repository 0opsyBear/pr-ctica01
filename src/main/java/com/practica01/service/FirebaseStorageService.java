
package com.practica01.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargarImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "practica01-aad6f.appspot.com";
    
    final String rutaSuperiorStorage = "practica01";
    
    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "practica01-aad6f-firebase-adminsdk-6mh1n-a0613caa00";
}
