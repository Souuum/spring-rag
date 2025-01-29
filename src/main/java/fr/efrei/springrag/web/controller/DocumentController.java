package fr.efrei.springrag.web.controller;

import fr.efrei.springrag.domain.Document;
import fr.efrei.springrag.web.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService)
    {
        this.documentService = documentService;
    }

    @GetMapping("/documents")
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @GetMapping("/documents/{id}")
    public Document getDocumentById(@PathVariable(value = "id", required = false) final Long id) {
        return documentService.getDocumentById(id);
    }

    @DeleteMapping("/documents/{id}")
    public void deleteDocumentById(@PathVariable(value = "id", required = false) final Long id) {
        documentService.deleteDocumentById(id);
    }

    @PostMapping("/documents")
    public Document buildAndSave(@RequestBody Document document) {
        return documentService.buildAndSave(document);
    }

}
