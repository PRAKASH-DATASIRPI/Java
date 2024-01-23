package com.example.GeneratePDF.Controller;


import com.example.GeneratePDF.Entity.UserEntity;
import com.example.GeneratePDF.Repository.Repo;
import com.example.GeneratePDF.Service.UserServices;
//import com.example.Pdf.Pdfmaker.Entity.BookShop;
//import com.example.Pdf.Pdfmaker.Repo.BookRepo;
//import com.example.Pdf.Pdfmaker.Service.PdfService;
//import com.lowagie.text.DocumentException;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private Repo repo;

    @Autowired
    private UserServices userServices;

    @GetMapping("/generate-pdf")
    public ResponseEntity<ByteArrayResource> generatePdf() throws DocumentException, IOException {
        List<UserEntity>  data = repo.findAll(); // Fetch data from the database

        ByteArrayOutputStream bis = userServices.generatePdf(data);

        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Disposition", "inline; filename=example.pdf");
        headers.add("Content-Disposition", "attachment; filename=BookStore.pdf");
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new ByteArrayResource(bis.toByteArray()));
    }
}