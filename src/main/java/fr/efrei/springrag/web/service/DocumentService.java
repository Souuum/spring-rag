package fr.efrei.springrag.web.service;


import fr.efrei.springrag.domain.Document;
import fr.efrei.springrag.repository.DocumentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    public Document getDocumentById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }

    public void deleteDocumentById(Long id) {
        documentRepository.deleteById(id);
    }

    public Document buildAndSave(Document document) {
        return documentRepository.save(document);
    }
}
